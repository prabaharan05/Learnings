package test;

import java.util.HashSet;

public class SubStringBruteForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubStringBruteForce b=new SubStringBruteForce();
		b.lengthOfLongestSubstring("aaaaa");

	}
	
	    public int lengthOfLongestSubstring(String s) {
	        int n=s.length();
	        int res=0;

	if(s.length()==1) return 1;
	else if(s.isEmpty()) return 0;

	        for(int i=0;i<n;i++){
	            for(int j=1;j<n;j++){
	                if(checkRepetition(s,i,j)){
	                    res=Math.max(res,j-i+1);
	                }

	            }
	        }
	        return res;
	    }

	    public boolean  checkRepetition(String s, int start,int end){
	        HashSet<Character> chars =new HashSet<>();
	        for(int i=start;i<=end;i++){
	            Character c=s.charAt(i);
	            if(chars.contains(c)){
	                return false;
	            }
	            chars.add(c);
	        }
	        return true;
	    }
	

}
