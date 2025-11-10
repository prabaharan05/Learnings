import { Component, OnInit } from '@angular/core';

declare const google: any;

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user: any = null;
  // Replace this with your actual Google OAuth client ID
  clientId = 'REPLACE_WITH_YOUR_GOOGLE_CLIENT_ID.apps.googleusercontent.com';

  constructor() { }

  ngOnInit(): void {
    // Restore persisted user if available
    const raw = localStorage.getItem('g_user');
    if (raw) {
      try { this.user = JSON.parse(raw); } catch { this.user = null; }
    }

    // Initialize Google Identity Services if available
    if (typeof google !== 'undefined' && google.accounts && google.accounts.id) {
      try {
        google.accounts.id.initialize({
          client_id: this.clientId,
          callback: (res: any) => this.handleCredentialResponse(res)
        });

        // Render a Google Sign-In button into the placeholder element
        setTimeout(() => {
          const el = document.getElementById('googleSignInDiv');
          if (el) {
            google.accounts.id.renderButton(el, { theme: 'outline', size: 'large' });
            // Optionally prompt one-tap (commented out by default)
            // google.accounts.id.prompt();
          }
        }, 0);
      } catch (e) {
        // ignore initialization errors in non-browser or blocked scenarios
        console.warn('Google Identity init failed', e);
      }
    }
  }

  handleCredentialResponse(response: any) {
    if (!response || !response.credential) return;
    const payload = this.decodeJwt(response.credential);
    this.user = payload;
    try { localStorage.setItem('g_user', JSON.stringify(this.user)); } catch {}
  }

  decodeJwt(token: string) {
    try {
      const payload = token.split('.')[1];
      const json = atob(payload.replace(/-/g, '+').replace(/_/g, '/'));
      // Some browsers may require decodeURIComponent/escape for unicode
      try { return JSON.parse(decodeURIComponent(escape(json))); } catch { return JSON.parse(json); }
    } catch (e) { return null; }
  }

  signOut(): void {
    if (typeof google !== 'undefined' && google.accounts && google.accounts.id) {
      try { google.accounts.id.disableAutoSelect(); } catch {}
    }
    this.user = null;
    try { localStorage.removeItem('g_user'); } catch {}
  }
}
