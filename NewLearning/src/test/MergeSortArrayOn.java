package test;

import java.util.Arrays;

public class MergeSortArrayOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {1,2,3,0,0};
		int[] nums2= {1,6};
		int m=3,n=2;
		for(int i=0;i<n;i++) {
			nums1[i+m]=nums2[i];
		}
		Arrays.sort(nums1);
		for(int i=0;i<n+m;i++) {
			System.out.print(nums1[i]);
		}

	}

}
