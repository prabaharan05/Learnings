package test;

public class SortedArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,2,1,5};
		int temp=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]>arr[i]) {
				//System.out.println(arr[i]);
				temp=arr[i-1];
		
				arr[i-1]=arr[i];
				arr[i]=temp;
				i=1;
				
			}
		}
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
	}
	
}
