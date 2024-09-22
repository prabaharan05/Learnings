package test;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(2>2) {
			System.out.println("çhecking condition");
		}
		//int[] subArr= {1,2,3};
	//	SubArray.printSubArray(subArr, 0, 0,0);
		
		
	}
	
	static void printSubArray(int[] arr,int start, int end,int count) {
		
		if(end==arr.length) {
			return;
			
		}else if(start>end) {
			printSubArray(arr,0,end+1,count++);
		}else {
			for(int i=start;i<=end;i++)
				System.out.print(arr[i]);
			System.out.println("count="+count);
			printSubArray(arr,start+1,end,count+1);
		}
		
	}
	

}
