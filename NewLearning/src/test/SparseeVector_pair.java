package test;

import java.util.List;
import java.util.ArrayList;

public class SparseeVector_pair {
	
	List<int[]> pair;
	
	SparseeVector_pair(int[] nums){
		pair=new ArrayList<>();
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				pair.add(new int[] {i,nums[i]});
			}
		}
		
		
	}
	
	public int dotProduct(SparseeVector_pair vec) {
		int productSum=0;
		int p=0; int q=0;
		while(p<pair.size()&&q<vec.pair.size()) {
			if(pair.get(p)[0]==vec.pair.get(q)[0]) {
				productSum+=pair.get(p)[1]*vec.pair.get(q)[1];
				p++;
				q++;
			}else if(pair.get(p)[0]>vec.pair.get(q)[0]) {
				q++;
				
			}else {
				p++;
			}
		}
		
		
		
		return productSum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int[] v1Arr= {1,0,0,2,3	};	
				int[] v2Arr= {0,3,0,4,0};
				SparseeVector_pair v1= new SparseeVector_pair(v1Arr);
				SparseeVector_pair v2=new SparseeVector_pair(v2Arr);
				int n=v1.dotProduct(v2);
						System.out.println(n);
				

	}

}
