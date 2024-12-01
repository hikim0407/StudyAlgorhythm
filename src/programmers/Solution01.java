package programmers;

public class Solution01 {
	
	//평균구하기
	public double calcAvg(int[] arr) {
		double answer = 0;
		for(int num : arr) {
			answer += num;
		}
		answer = answer / arr.length;
		return answer;
	}
	
	//x만큼 커지는 n개의 숫자들의 합
	public long[] xnNumbers(int x, int n) {
		long[] answer = new long[n];
		for(int i=0; i<n; i++) {
			//int x 를 long 으로 캐스팅 한 다음 곱셈을 하는게 포인트.
			answer[i] = (long) x * (i + 1);
		}
		return answer;
	}
	
	//나머지가 1인 가장 작은 숫자
	public int remainOne(int n) {
		int answer = 2;
		while(true) {
			if(n % answer == 1) break;
			answer++;
		}
		return answer;
	}
	
	//a 와 b 사이의 정수 합
	public long betweenSum(int a, int b) {
		long answer = 0;
		
		int start = a > b ? b : a;
		int end = a > b ? a : b;
		
		for(int i=start; i<=end; i++) {
			answer = answer + (long) i;
		}
		return answer;
	}
	
	//문자열 s 에서 p 의 갯수와 y 의 갯수 카운팅
	public boolean compareChar(String s) {
		boolean answer = true;
		int pCnt = 0;
		int yCnt = 0;
		
		for(char c : s.toLowerCase().toCharArray()) {
			if(c == 'p') pCnt++;
			if(c == 'y') yCnt++;
		}
		
		if(pCnt != yCnt) answer = false;
		
		return answer;
	}
	
	//0~9 까지 숫자 일부가 들어있는 정수배열에서 0~9 중 없는숫자의 합 리턴
	public int missingNum(int[] numbers) {
		int answer = 45;
        for(int num : numbers) {
            answer -= num;
        }
        return answer;
	}
	
	
	
	public static void main(String[] args) {
		Solution01 sol = new Solution01();
		System.out.println(sol.betweenSum(5, 3));
		/*
		int[] arr = {1,2,3,4,5,6};
		System.out.println(sol.calcAvg(arr));
		*/
		/*
		long[] answer = sol.xnNumbers(4, 3);
		for(long num : answer) {
			System.out.println(num);
		}
		*/
	}
}
