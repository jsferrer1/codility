package codility;

import java.lang.*;


public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sol = solution(255);
	}

    static int solution(int N) {
        // write your code in Java SE 8
        
        System.out.println(N);

        String s = Integer.toBinaryString(N);        
        System.out.println(s);
        
        // check for 1s
        int bc = Integer.bitCount(N);
        if (bc <= 1) {
            return 0;
        }
        
        // check for 0s
        if (s.indexOf("0") < 0) {
            return 0;
        }
        
        // example 1000010001, 10100
        char c[] = s.toCharArray();
        int prevGap = 0;
        int gap = 0; 
        boolean started = false;
        boolean ended = true; 
        int i = 0;
        int idx = 0;
        while(i < s.length()) {

            System.out.format("%d %c\n", i, c[i]);
            if (c[i] == '1') {
                
                // find the next '1'
                idx = s.indexOf('1', i+1);
                System.out.format("idx: %d\n", idx);
                
                if (idx > i) {
                    gap = idx - i;
                } else {
                    gap = 1; // just move to the next character
                }    
                
                i += gap;
                
            } else {
                i++;
            }    
                        
        }
        
        return gap;
    }	
}
