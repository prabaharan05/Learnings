package test;

import java.util.Arrays;

public class MinimizeProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1= {1,2,3};
		int[] nums2= {4,3,5};
		
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int minProductSum=0;
		int n=nums1.length;
		for(int i=0;i<n;i++) {
			minProductSum+=nums1[i]*nums2[n-1-i];
			
		} 
		//return minProductSum;
	}

}
