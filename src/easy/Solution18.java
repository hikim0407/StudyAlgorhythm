package easy;

public class Solution18 {

	public String masking(String phone_number) {
        int length = phone_number.length();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length - 4; i++) {
            sb.append("*");
        }
        
        // 마지막 4자리 추가
        sb.append(phone_number.substring(length - 4));
        
        return sb.toString();
    }
	
	public static void main (String args[]) {
		Solution18 sl = new Solution18();
		System.out.println(sl.masking("01040366032"));
	}
}
