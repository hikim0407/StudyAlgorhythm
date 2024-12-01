package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution13 {
	
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> result = new ArrayList<>();
        if (A == null || A.size() == 0) {
            return result;
        }
        
        //처음 경계값을 설정
        int top = 0;
        int bottom = A.size() - 1;
        int left = 0;
        int right = A.get(0).size() - 1;
        
        
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(A.get(top).get(i));
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.add(A.get(i).get(right));
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(A.get(bottom).get(i));
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(A.get(i).get(left));
                }
                left++;
            }
        }

        return result;
    }
	
	public static void main(String[] args) {
		Solution13 sol = new Solution13();
		ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1));
		ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(2));
		ArrayList<Integer> row3 = new ArrayList<>(Arrays.asList(3));
		array.add(row1);
		array.add(row2);
		array.add(row3);
		ArrayList<Integer> answer = sol.spiralOrder(array);
		for(Integer index : answer) {
			System.out.println(index);
		}
	}
	
	/*
	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
		List<ArrayList<Integer>> duplList = new ArrayList<ArrayList<Integer>>();
		for(ArrayList<Integer> list : A) {
			duplList.add(list);
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		while(!duplList.isEmpty()) {
			for(int num : duplList.remove(0)) {
				result.add(num);
			}
			if(duplList.isEmpty()) break;
			for(int i=0; i<duplList.size(); i++) {
				ArrayList<Integer> temp = duplList.get(i);
				result.add(temp.remove(temp.size()-1));
			}
			if(duplList.isEmpty()) break;
			ArrayList<Integer> temp2 = duplList.remove(duplList.size()-1);
			for(int i=temp2.size()-1; i>=0; i--) {
				result.add(temp2.get(i));
			}
			if(duplList.isEmpty()) break;
			for(int i=duplList.size()-1; i>=0; i--) {
				ArrayList<Integer> temp = duplList.get(i);
				result.add(temp.remove(0));
			}
		}
		return result;
	}
	*/
}
