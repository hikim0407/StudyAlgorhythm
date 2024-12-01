package easy;

import java.util.Stack;

public class Solution07 {
	public String reverseString(String A) {
	    StringBuilder result = new StringBuilder();
	    
	    Stack<Character> stack = new Stack<>();
	    
	    for (int i = 0; i < A.length(); i++) {
	        stack.push(A.charAt(i));
	    }
	    
	    while (!stack.isEmpty()) {
	        result.append(stack.pop());
	    }
	    
	    return result.toString();
	}
	
	/*
	public String reverseString(String A) {
		String result = "";
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<A.length(); i++) {
			stack.push(A.charAt(i));
		}
		
		while(!(stack.isEmpty())) {
			result += stack.pop();
		}
		
		return result;
	}
	*/
	
	public static void main(String[] args) {
		Solution07 s7 = new Solution07();
		System.out.println(s7.reverseString("abc"));
	}
}
