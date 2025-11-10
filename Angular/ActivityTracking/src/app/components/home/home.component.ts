import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  revisions: any[] = [];
  filteredRevisions: any[] = [];
  revision: any = {
    problem: '',
    concept: '',
    difficulty: 'Easy',
    revisedTime: null,
    attempt: null,
    date: '',
    reviseDate: '',
    note: null
  };
  editIndex = -1;

  // Filter/search state
  searchText = '';
  filterConcept = '';
  filterDifficulty = '';
  fromDate = '';
  toDate = '';

  constructor() { }

  ngOnInit(): void {
    const raw = localStorage.getItem('revisions');
    if (raw) {
      try {
        this.revisions = JSON.parse(raw);
      } catch { this.revisions = []; }
    }
    this.onFilterChange();
  }

  save(): void {
    if (!this.revision.problem) return;
    const entry = { ...this.revision };
    if (this.editIndex > -1) {
      this.revisions[this.editIndex] = entry;
    } else {
      this.revisions.unshift(entry);
    }
    localStorage.setItem('revisions', JSON.stringify(this.revisions));
    this.reset();
    this.onFilterChange();
  }

  edit(index: number): void {
    this.editIndex = index;
    this.revision = { ...this.revisions[index] };
    window.scrollTo({ top: 0, behavior: 'smooth' });
  }

  remove(index: number): void {
    this.revisions.splice(index, 1);
    localStorage.setItem('revisions', JSON.stringify(this.revisions));
    if (this.editIndex === index) this.reset();
    this.onFilterChange();
  }

  // New helpers requested by template
  editItem(item: any): void {
    const idx = this.revisions.indexOf(item);
    if (idx > -1) this.edit(idx);
  }

  removeItem(item: any): void {
    const idx = this.revisions.indexOf(item);
    if (idx > -1) this.remove(idx);
  }

  // Filtering logic
  onFilterChange(): void {
    const s = (this.searchText || '').toLowerCase().trim();
    const concept = (this.filterConcept || '').toLowerCase().trim();
    const diff = (this.filterDifficulty || '').trim();
    const from = this.fromDate ? new Date(this.fromDate) : null;
    const to = this.toDate ? new Date(this.toDate) : null;

    this.filteredRevisions = this.revisions.filter(r => {
      // search text matches problem or concept
      const inSearch = !s || ((r.problem || '').toLowerCase().includes(s)) || ((r.concept || '').toLowerCase().includes(s));
      if (!inSearch) return false;

      if (concept && !((r.concept || '').toLowerCase().includes(concept))) return false;
      if (diff && r.difficulty !== diff) return false;

      if ((from || to) && r.date) {
        const d = new Date(r.date);
        if (from && d < from) return false;
        if (to && d > to) return false;
      }

      return true;
    });
  }

  clearFilters(): void {
    this.searchText = '';
    this.filterConcept = '';
    this.filterDifficulty = '';
    this.fromDate = '';
    this.toDate = '';
    this.onFilterChange();
  }

  reset(): void {
    this.revision = {
      problem: '',
      concept: '',
      difficulty: 'Easy',
      revisedTime: null,
      attempt: null,
      date: '',
      reviseDate: '',
      timeTaken: null
    };
    this.editIndex = -1;
  }
}
