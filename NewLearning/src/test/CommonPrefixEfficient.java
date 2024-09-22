package test;

import java.util.Arrays;

public class CommonPrefixEfficient {

	public static void main(String[] args) {
		//String[] strs={"car","cir"};
		String[] strs={"c"};
				//String[] strs={"c","acc","ccc"};
				//String[] strs={"flower","flow","flight"};

		//String[] strs={"dog","racecar","car"};
		Arrays.sort(strs);
		String strF=strs[0];
		String strL=strs[strs.length-1];
		int i=0;
		String commonPrefix="";
		
		while(i<strF.length()) {
			
			if(strF.charAt(i)==strL.charAt(i)) {
				
				commonPrefix+=strF.charAt(i);
				i++;
			}else {
				break;
			}
			
		}
		System.out.println(commonPrefix);
	}

}
