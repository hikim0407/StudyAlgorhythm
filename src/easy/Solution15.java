package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Solution15 {
	public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
	    ArrayList<Integer> result = new ArrayList<>();
	    Stack<Integer> stack = new Stack<>();

	    for (int i = 0; i < A.size(); i++) {
	        int num = A.get(i);
	        
	        // 스택에서 num보다 크거나 같은 값은 모두 제거
	        while (!stack.isEmpty() && stack.peek() >= num) {
	            stack.pop();
	        }
	        
	        // 스택이 비었으면 -1, 아니면 스택의 top이 가장 가까운 작은 값
	        if (stack.isEmpty()) {
	            result.add(-1);
	        } else {
	            result.add(stack.peek());
	        }
	        
	        // 현재 값을 스택에 추가
	        stack.push(num);
	        System.out.println("num : "+num+" / result : "+result.get(i)+" ("+stack+")");
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		Solution15 sol = new Solution15();
		ArrayList<Integer> array = new ArrayList<>(Arrays.asList(34, 35, 27, 42, 5, 28, 39, 20, 28));
		ArrayList<Integer> answer = sol.prevSmaller(array);
		for(Integer index : answer) {
			System.out.println(index);
		}
	}
	/*
	public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
		ArrayList<Integer> result = new ArrayList<>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<A.size(); i++) {
			int num = A.get(i);
			stack.add(num);
			result.add(i, -1);
			while(!stack.isEmpty()) {
				int min = stack.pop();
				if(A.get(i) > min) {
					result.set(i, min);
					stack.add(min);
					break;
				} else {
					result.set(i, -1);
				}
			}
			stack.add(num);
		}
		return result;
    }
	*/
}
