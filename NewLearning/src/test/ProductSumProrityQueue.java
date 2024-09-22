package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class ProductSumProrityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {5,3,4,2};
		int[] nums2= {4,2,2,5};
		int n=nums1.length;
		Arrays.sort(nums1);
		int minProductSum=0;
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int num:nums2) {
			pq.add(num);
		}
		for(int i=0;i<n;i++) {
			
			minProductSum+=nums1[i] * pq.poll();
		}
		System.out.println(minProductSum);
		
	}

}
