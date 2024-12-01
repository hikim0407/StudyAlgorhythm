package easy;

public class Solution17 {
	
	public int solution(int n) {
        int answer = 0;
        
        String numberStr = String.valueOf(n);
        
        for(char digit : numberStr.toCharArray()) {
        	answer += Character.getNumericValue(digit);
        }
        
        return answer;
    }
	
	public static void main (String args[]) {
		Solution17 sl = new Solution17();
		System.out.println(sl.solution(123));
	}
	
	/*
	public int solution(int n) {
        int answer = 0;
        double num = n;
        
        int digit = 1;
        while( num > 0) {
        	num = num / Math.pow(10, digit);
        	answer += Integer.parseInt(String.valueOf(num).split("\\.")[1]);
        	num = Math.floor(num);
        }

        return answer;
    }
	*/
}
