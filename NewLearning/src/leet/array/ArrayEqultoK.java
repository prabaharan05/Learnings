package leet.array;

public class ArrayEqultoK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int minOperations(int[] nums, int k) {
        int finalXor=0;

        for(int num:nums){
            finalXor=finalXor ^ num;
        }
        int count=0;
       // iterate the K and finalXor untill becomes 0
       while(k>0||finalXor>0){
        //k%2 is the right most bit of k
        //finalXor%2 is the rigt most bit of k
        if(k%2!=finalXor%2){
            count++;
        }
        //remove the last bit from both integers
        k/=2;
        finalXor/=2;
       }
    return count;
    }
	public int minOperationsUsingStandardLibrary(int[] nums, int k) {
        int finalXor=0;

        for(int num:nums){
            finalXor=finalXor ^ num;
        }
        
    return Integer.bitCount(finalXor^k);
    }
}
