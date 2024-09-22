package test;

public class SpaceVectors_naive {
	
	int[] array;
	
	
	SpaceVectors_naive(int[] nums){
		
		array=nums;
		
	}
	public int dotProduct(SpaceVectors_naive vec) {
		int productSum=0;
	for(int i=0;i<array.length;i++) {
		productSum+=array[i]*vec.array[i];
		
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
