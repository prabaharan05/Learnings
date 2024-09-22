package test;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */

	    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

	        ListNode prehead=new ListNode(-1);
	        ListNode prev=prehead;
	        while(list1!=null&&list2!=null){
	            if(list1.getVal()<list2.getVal()){
	                prev.setNext(list1);
	                list1=list1.getNext();
	            }else{
	                prev.setNext(list2);
	                list2=list2.getNext();
	            }
	        
	        prev=prev.getNext();
	        }
	        prev.setNext(list1==null?list2:list1);
	        return prehead.getNext();
	    }
	    
	

}
