package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution12 {
	
	public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();  // 값과 해당 값의 인덱스를 저장할 해시맵

        for (int i = 0; i < A.size(); i++) {
            int value = B - A.get(i);  // B에서 현재 값을 뺀 값 (complement)
            
            if (map.containsKey(value)) {
                // 현재 값과 더해서 B가 되는 값이 해시맵에 있는 경우
                result.add(map.get(value) + 1);  // 1-based index
                result.add(i + 1);  // 1-based index
                System.out.println("key : "+A.get(i)+" value : "+i);
                return result;  // 처음 찾은 쌍을 반환
            }
            
            // 현재 값을 해시맵에 추가
            if (!map.containsKey(A.get(i))) {
                map.put(A.get(i), i);  // 현재 값과 해당 인덱스를 저장
                System.out.println("key : "+A.get(i)+" value : "+i);
            }
        }

        return result;  // 쌍을 찾지 못한 경우 빈 리스트 반환
    }
	
	/*
	public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=0; i<A.size(); i++) {
			for(int j=i+1; j<A.size(); j++) {
				if(A.get(i) + A.get(j) == B) {
					if(result.size() == 0) {
						result.add(i+1);
						result.add(j+1);
					} else {
						int index1 = result.get(0);
						int index2 = result.get(1);
						if(index2 > j+1) {
							result.set(0, i+1);
							result.set(1, j+1);
						} else if(index2 == j+1) {
							if(index1 > i+1) {
								result.set(0, i+1);
								result.set(1, j+1);
							}
						}
					}
				}
			}
		}
		return result;
    }
    */
	
	public static void main(String[] args) {
		Solution12 sol = new Solution12();
		ArrayList<Integer> array = new ArrayList<Integer> (Arrays.asList(4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8));
		ArrayList<Integer> answer = sol.twoSum(array, -3);
		for(Integer index : answer) {
			System.out.println(index);
		}
	}
}
