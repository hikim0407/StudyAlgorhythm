package easy;

public class Solution10 {
	
	public boolean isPrimeNumber(int number) {
		boolean result = true;
		
		//1 이하는 소수가 아님.
		if(number <= 1) {
			return false;
		}
		
		//소수는 1과 자기 자신으로만 나눠지는 수. 2 부터 number의 제곱근까지 나눠본다. 
		for(int i=2; i<=Math.sqrt(number); i++) {
			if(number % i == 0) {
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Solution10 sol = new Solution10();
		System.out.println(sol.isPrimeNumber(213124123));
	}
}
