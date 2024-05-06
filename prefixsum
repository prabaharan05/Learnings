package test;

public class PrefixSum
{

	public static void main(String[] args){
		int[] sum={10,20,30,5,15};
		int[] prefixSum=new int[sum.length];
		fillPrefixSum(sum, prefixSum);
		for(int i=0;i<prefixSum.length;i++){
			System.out.println("Prefix length"+prefixSum[i]);
		}   	



	}

	public static void  fillPrefixSum(int[] sum,int[] prefixSum){
		prefixSum[0]=sum[0];
		for(int i=1;i<sum.length;i++){
			prefixSum[i]=prefixSum[i-1]+sum[i];	
		}
	}



}




