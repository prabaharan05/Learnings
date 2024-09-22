	package test;
	
	public class MergeSortedArrayO1 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int[] nums1= {1,2,3,0,0};
	int[] nums2= {1,6};
	int m=3,n=2;
	
	int p1=m-1;
	int p2=n-1;
	
	for(int p=m+n-1;p>=0;p--) {
		if(p2<0) {
			break;
		}
		if(p>=0&&nums1[p1]>nums2[p2]) {
			nums1[p]=nums1[p1--];
		}else {
			nums1[p]=nums2[p2--];
		}
		for(int i=0;i<m+n;i++) {
			System.out.print(nums1[i]);
		
		}
		System.out.println();
	}
			
			
		}
	
	}
