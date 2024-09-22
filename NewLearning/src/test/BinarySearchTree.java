package test;

public class BinarySearchTree {
	
	public static void main(String[] args) {
		
		
		int key=9;
		int [] arr= {1,2,3,4,5,6,7,8,9};
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
		int mid=left+(right-left)/2;
		System.out.println("chec"+(left+(right-left)/2));
		if(arr[mid]==key) {
			System.out.println("mid="+mid);
			break;
		} else if(arr[mid]<key) {
			left=mid+1;
			
		}else {
			right=mid-1;
		}
		}
		
	}
	
	

}
