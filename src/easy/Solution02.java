package easy;

public class Solution02 {
	public int climbStairs(int a) {
		// 기본 예외 처리: 계단이 1개 이하일 경우
        if (a == 1) {
            return 1;
        }
        
        // 첫 두 개의 계단은 각각 1가지와 2가지 방법으로 올라갈 수 있음
        int[] count = new int[a + 1];
        count[1] = 1;
        count[2] = 2;
        
        // 3번째 계단부터 피보나치 방식으로 계산
        for (int i = 3; i <= a; i++) {
        	count[i] = count[i - 1] + count[i - 2];
        }
        return count[a];
	}
	
	public static void main (String args[]) {
		Solution02 s2 = new Solution02();
		System.out.println(s2.climbStairs(7));
	}
	/*
	//조합으로 풀어야 하는 문제. >> 시간복잡도 상 피보나치 수열이 맞다...
	public int climbStairs(int a) {
		int count = 0; //결과값.
		
		int maxLength = a;
		int minLength = a/2 + a%2;
		
		int n = maxLength;
		int k = 0;
		
		while(n >= minLength) {
			if(k == 0) {
				count++;
			} else {
				count = count + (factorial(n) / (factorial(k) * factorial(n - k)));
			}
			n--;
			k++;
		}
		
		return count;
    }
	
	public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    */
}
