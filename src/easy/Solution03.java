package easy;

import java.util.Arrays;
import java.util.List;

public class Solution03 {
	
	public static int maxSubArray(List<Integer> A) {
        // 배열의 첫 번째 원소를 현재 최대 합과 현재 서브배열 합으로 설정
        int maxSum = A.get(0);
        int currentSum = A.get(0);
        
        // 배열의 두 번째 원소부터 끝까지 탐색
        for (int i = 1; i < A.size(); i++) {
            // 현재 원소 자체가 현재 서브배열의 합보다 큰지 비교하고, 큰 값으로 갱신
            currentSum = Math.max(A.get(i), currentSum + A.get(i) );
            // 최대 합을 현재 서브배열의 합과 비교하여 갱신
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
	
	public static void main (String args[]) {
		Solution03 s3 = new Solution03();
		System.out.println(s3.maxSubArray(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4)));
	};
	
	/*
	 * 이 방법의 경우 subList 와 arraySum 이 사용되어 시간복잡도가 최악의 경우 O(n^2) 가 된다.
	public int maxSubArray(final List<Integer> A) {
		int maxSum = 0;
		int currentSum = 0;
		
		int startIdx = 0;
		
		for(int i = 0; i < A.size(); i++) {
			currentSum = arraySum(A.subList(startIdx, i+1));
			if(currentSum < 0) {
				startIdx++;
				continue;
			}
			if(maxSum < currentSum) maxSum = currentSum;
		}
		return maxSum;
    };
	
	public static int arraySum(List<Integer> list) {
		return list.stream().mapToInt(Integer::intValue).sum();
	};
	*/
}
