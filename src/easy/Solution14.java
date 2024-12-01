package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution14 {
	public ArrayList<Integer> wave(ArrayList<Integer> A) {	
		// 배열을 퀵 정렬을 사용해 오름차순 정렬
        quickSort(A, 0, A.size() - 1);
        
		// wave 정렬
		for (int i = 0; i < A.size() - 1; i += 2) {
            int temp = A.get(i);
            A.set(i, A.get(i + 1));
            A.set(i + 1, temp);
        }
		
		return A;
    }
	
	// 퀵 정렬을 위한 메서드
    public void quickSort(ArrayList<Integer> A, int low, int high) {
        if (low < high) {
            int pi = partition(A, low, high);

            // 피벗 기준 왼쪽 정렬
            quickSort(A, low, pi - 1);
            // 피벗 기준 오른쪽 정렬
            quickSort(A, pi + 1, high);
        }
    }
    
    // 퀵 정렬의 분할(Partition) 메서드
    public int partition(ArrayList<Integer> A, int low, int high) {
    	// 피벗을 마지막 요소로 선택
        int pivot = A.get(high);
        // 작은 요소를 가리키는 인덱스
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (A.get(j) <= pivot) {
                i++;

                // A[i]와 A[j]를 스왑
                int temp = A.get(i);
                A.set(i, A.get(j));
                A.set(j, temp);
            }
        }

        // 피벗을 적절한 위치로 이동
        int temp = A.get(i + 1);
        A.set(i + 1, A.get(high));
        A.set(high, temp);

        return i + 1;
    }
    
	public static void printArray (ArrayList<Integer> array) {
		for(int i : array) {
			System.out.print(i);
		}
		System.out.println("============");
    };
	
	public static void main(String[] args) {
		Solution14 sol = new Solution14();
		ArrayList<Integer> array = new ArrayList<>(Arrays.asList(5, 1, 3, 2, 4));
		ArrayList<Integer> answer = sol.wave(array);
		for(Integer index : answer) {
			System.out.println(index);
		}
	}
	
	/*
	public ArrayList<Integer> wave(ArrayList<Integer> A) {
		//버블정렬
		for(int i=0; i<A.size()-1; i++) {
			for(int j=0; j<A.size()-1-i; j++) {
				if(A.get(j) > A.get(j+1)) {
					int temp = A.get(j);
					A.set(j, A.get(j+1));
					A.set(j+1, temp);
				}
			}
		}
		
		// wave 정렬
		for (int i = 0; i < A.size() - 1; i += 2) {
            int temp = A.get(i);
            A.set(i, A.get(i + 1));
            A.set(i + 1, temp);
        }
		
		return A;
    }
    */
}
