	package learn.LinkedList;

public class LinkedList {
	
	Node head;
	
	
	static class Node {
		int data;
		Node next;
		
		Node(int dataM){
			this.data=dataM;
			next=null;
			
		}
		
			
		
	}
	public static LinkedList insert(LinkedList list,int data) {
		
		//create new node with given data
		Node new_node=new Node(data);
		
		
		//if the Linked list is empty,
		//then make the new node as head
		if(list.head==null) {
			list.head=new_node;
		}else {
			//Else traverse till the last node
			//and insert the new_node there
			
			Node last=list.head;
			while(last.next!=null) {
				last=last.next;
					
			}
			
			//insert the new node and the last node
			last.next=new_node;
			
		}
		
		
		
		return list;
	}
	
	public static void printList(LinkedList list) {
		
		Node currNode=list.head;
		
		System.out.println("LinkedListt....");
		
		while(currNode !=null) {
		
		//print the data at current node
		System.out.print(currNode.data+" ");
		//Go to next node
		currNode=currNode.next;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* start with empty list */
		LinkedList list=new LinkedList();
		

		LinkedList.insert(list,10);
		LinkedList.insert(list, 20);
		
		LinkedList.printList(list);
	}

}
