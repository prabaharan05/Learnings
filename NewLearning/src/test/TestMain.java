
package test;

import java.util.HashMap;
import java.util.Map;

public class TestMain {

	public static void main(String[] args) {
		String s="MCMXCIV";
		
		Map<Character,Integer> roman=new HashMap<Character,Integer>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        
        int sum=roman.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
        	System.out.println(s.charAt(i));
        	
            if(roman.get(s.charAt(i))<roman.get(s.charAt(i+1))){
                sum-=roman.get(s.charAt(i));
            }else {
            	sum+=roman.get(s.charAt(i));
            }


        }
        System.out.println(sum);
    }
	
	

}
