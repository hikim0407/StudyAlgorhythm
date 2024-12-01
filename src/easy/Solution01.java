package easy;

public class Solution01 {
	public int numSetBits(int a) {
        int count = 0;
        
        if(a == 0) {
            return 0;
        }
        
        while(a > 0) {
            if((a & 1) == 1) {
                count++;
            }
            a >>= 1;
        }
        
        return count;
	}
	
	public static void main (String args[]) {
		Solution01 sl = new Solution01();
		System.out.println(sl.numSetBits(15));
	}
}
