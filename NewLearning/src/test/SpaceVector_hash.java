package test;

import java.util.HashMap;
import java.util.Map;

public class SpaceVector_hash {
	
 public Map<Integer,Integer> maps;

	SpaceVector_hash(int[] nums){
		
	this.maps=new HashMap<>();
	for(int i=0;i<nums.length;i++) {
		
	if(nums[i]!=0)
		this.maps.put(i, nums[i]);
	}
		
	}
	public int dotProduct(SpaceVector_hash vec) {
		int productSum=0;
		for(Integer index:this.maps.keySet()) {
			if(this.maps.containsKey(index)) {
				productSum+=this.maps.get(index)+vec.maps.get(index);
			}
		}
		return productSum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v1Arr= {1,0,0,2,3	};	
		int[] v2Arr= {0,3,0,4,0};
		SpaceVectors_naive v1= new SpaceVectors_naive(v1Arr);
		SpaceVectors_naive v2=new SpaceVectors_naive(v2Arr);
		int n=v1.dotProduct(v2);
				System.out.println(n);

	}

}
