package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {
	public static  Map<Character, Character> mapping = null;
	
	static{
		
		mapping=new HashMap<>();
		mapping.put(')', '(');
		mapping.put('}', '{');
		mapping.put(']', '[');
	}

	public static void main(String[] args) throws Exception {
		String s="([])";
		
ValidParanthesis vp=new ValidParanthesis();
System.out.print(vp.isValidParanthesis(s));
	}
	
	public boolean isValidParanthesis(String s) {
		//initialize the empty stack with character
				Stack<Character> stack=new Stack<Character>();
				//Iterate the string to as array for loop
				for(int i=0;i<s.length();i++) {
					char c=s.charAt(i);
					
				//	if character of string matches to with map keys it will continue to if condition 
					//else it will goto push into the stack
					
					if(mapping.containsKey(c)) {
						
						//get the top of the elements if the stack is not empty and if it is empty set the temporaty value '#'
						char topElement=stack.isEmpty()?'#':stack.pop();
						if(mapping.get(c)!=topElement) {
							return false;
						}
						
					}else {
						stack.push(c);
					}
				}
				//if stack is not empty  invalid paranthesis present so it will return false
				return stack.isEmpty();
	}

}

