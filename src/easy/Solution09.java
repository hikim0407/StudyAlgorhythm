package easy;

import java.util.Arrays;
import java.util.List;

public class Solution09 {
	
	public int maxProfit(final List<Integer> A) {
	    if (A.isEmpty()) return 0;

	    int sumProfit = 0;

	    // 첫 번째 날 이후부터 비교
	    for (int i = 1; i < A.size(); i++) {
	        int profit = A.get(i) - A.get(i - 1);
	        // 이익이 양수인 경우만 수익에 더한다.
	        if (profit > 0) {
	            sumProfit += profit;
	        }
	    }
	    return sumProfit;
	}
	
	public static void main (String args[]) {
		Solution09 sol = new Solution09();
		System.out.println(sol.maxProfit(Arrays.asList(5,2,10)));
	};
	
	/*
	public int maxProfit(final List<Integer> A) {
	    if (A.isEmpty()) return 0;
	    
	    int minPrice = A.get(0);
	    int sumProfit = 0;
	    
	    for (int i = 1; i < A.size(); i++) {
	    	//예상 수익을 계산
	        int profit = A.get(i) - minPrice;
	        //예상 수익이 마이너스면 최소값만 갱신.
	        if(profit < 0) {
		        minPrice = Math.min(minPrice, A.get(i));
	        } else {
	        	//예상 수익이 플러스면 처분
	        	sumProfit += profit;
	        	//처분시점부터 다시 최소값을 갱신
		        minPrice = A.get(i);
	        }
	    }
	    return sumProfit;
	}
	*/
}
