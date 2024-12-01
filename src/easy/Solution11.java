package easy;

import java.util.Arrays;

public class Solution11 {
	public String[] stringSort(String[] strings, int n) {
		Arrays.sort(strings, (s1, s2) -> {
            // n번째 문자를 기준으로 비교
            if (s1.charAt(n) == s2.charAt(n)) {
                // n번째 문자가 같으면 사전순 정렬
                return s1.compareTo(s2);
            } else {
                // n번째 문자를 기준으로 정렬
                return Character.compare(s1.charAt(n), s2.charAt(n));
            }
        });
		return strings;
		/*
        // 버블 정렬을 이용한 직접 정렬
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - 1 - i; j++) {
                if (compare(strings[j], strings[j + 1], n) > 0) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
        return strings;
        */
    }
	
    // 두 문자열을 n번째 문자 기준으로 비교하는 메서드
    public static int compare(String s1, String s2, int n) {
        char char1 = s1.charAt(n);
        char char2 = s2.charAt(n);

        // n번째 문자가 같으면 전체 문자열을 비교
        if (char1 == char2) {
            return s1.compareTo(s2);
        }
        // n번째 문자를 기준으로 비교
        return Character.compare(char1, char2);
    }
	
	public static void main(String[] args) {
		Solution11 sol = new Solution11();
		String[] strings = {"abcd", "abce", "cdx"};
		String[] answer = sol.stringSort(strings, 2);
		for(String str : answer) {
			System.out.println(str);
		}
	}
}
