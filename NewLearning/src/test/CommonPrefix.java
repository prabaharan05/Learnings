package test;

import java.util.Arrays;

public class CommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] strs={"car","cir"};
		//String[] strs={"c","acc","ccc"};
		//String[] strs={"flower","flow","flight"};
		String[] strs={"dog","racecar","car"};
		Arrays.sort(strs);
		 String firstString=strs[0];
	        String commonPrefix="";
	        if(strs.length>1){
	        for(int i=0;i<firstString.length();i++){
	        	String ar=commonPrefix+String.valueOf(firstString.charAt(i));
	            for(int j=1;j<strs.length;j++){
	            	if(strs[j].length()==i) {
	            		ar="";
	            		break;
	            	}
	            	String s= strs[j].substring(0,i+1);
	            	//System.out.println(s);
	                if(!s.equalsIgnoreCase(ar)){
	                    ar="";
	                    break;
	                }
	                
	                
	                
	       
	            }
	            
	            if(!ar.isBlank()) {
	            	commonPrefix=ar;
	            }else {
	            	break;
	            }

	        }
	        }else {
	        	commonPrefix=firstString;
	        }
	       System.out.println(commonPrefix);
	       // return commonPrefix;


	}
	
	

}
