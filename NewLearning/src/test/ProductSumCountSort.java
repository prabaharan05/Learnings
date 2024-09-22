package test;

public class ProductSumCountSort {

	public static void main(String[] args) {
		
		
		int[] nums1= {5,3,4,2};
		int[] nums2= {4,2,2,5};
		int n=nums1.length;
		//Initialize the counter1 and counter2 with ranged of 101
		int[] counter1=new int[101];
		int[] counter2=new int[101];
		for(int num:nums1)
			counter1[num]++;
		for(int num:nums2)
			counter2[num]++;
		//Initialize the two pointer array p1=1 and p2=100
		int p1=1;
		int p2=100;
		int ans=0;
		int occurance=0;
			
		
		//while the two pointers are in valid range
		while(p1<100&&p2>0) {
			//if the countere1[p1]==0 meaning there is no element equals to p1 in counter1
			while(p1<100&&counter1[p1]==0) 
				p1+=1;
			
			
			
		//if the counter2[p2]==0 meaning there is no element equals to p2 in counter2
			while(p2>0&&counter2[p2]==0) {
				p2-=1;
			}
			// if the any of the pointers goes the beyond the border, 
			//we have finished the iteration break the loop
			if(p1==101 || p2==0)
				break;
			
			//otherewise we can make it at most min(counter1[p1],counter2[p2])
			//pairs of {p1,p2} lets call it as occuranceses
			//Each pair has product of P1 * p2 thus the cumulative sum is increased by
			//occ*p1*p2. update counteer1[p1] and counter2[p2]
			occurance=Math.min(counter1[p1], counter2[p2]);
			ans+=occurance*p1*p2;
			counter1[p1]-=occurance;
			counter2[p2]-=occurance;
			System.out.println(ans);
		}
		
	}

}	
