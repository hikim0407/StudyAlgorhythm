package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Solution06 {
	
	public int evalRPN(ArrayList<String> A) {
		Stack<Integer> stack = new Stack<>();
        for (String token : A) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }
        return stack.pop();
	}
	
	public static void main (String args[]) {
		Solution06 s6 = new Solution06();
		ArrayList<String> array = new ArrayList<String> (Arrays.asList("4", "13", "5", "/", "+"));
		System.out.println(s6.evalRPN(array));
	};
	
	/*
	public int evalRPN(ArrayList<String> A) {
		int reuslt = 0;
		
		ArrayList<String> operators = new ArrayList<String>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		String str = "";
		
		for(int i=A.size()-1; i>=0; i--) {
			String element = A.get(i);
			if(isParsableToInt(element)) {
				//numbers.add(Integer.parseInt(element));
			} else {
				//operators.add(element);
			}
		}
		System.out.println(operators);
		System.out.println(numbers);
		
		int index = 0;
		for(int i=0; i<operators.size(); i++) {
			String operator = operators.get(i);
			int num01, num02 = 0;
			if(index == 0) {
				num01 = numbers.get(index);
				num02 = numbers.get(index+1);
			} else {
				num01 = numbers.get(index);
				num02 = reuslt;
			}
			reuslt = calculator(operator, num01, num02);
		}
		
		return reuslt;
    }
	
	public static int calculator(String operator, int num01, int num02) {
		int result = 0;
		//+, -, *, /
		switch (operator) {
			case "+":
				result = num01 + num02;
				break;
			case "-":
				result = num01 - num02;
				break;
			case "*":
				result = num01 * num02;
				break;
			case "/":
				result = num01 / num02;
				break;
			default:
				break;
		}
		return result;
	}
	
	public static boolean isParsableToInt(String str) {
		try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
	}
	*/
	
}
