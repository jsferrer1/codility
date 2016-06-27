package codility;

import java.lang.*;

// a0Bababa1Catcatcat

public class LongestPassword {
	
	public int solution(String S) {
		
		int N = S.length();
		int start = -1;
		int longest = -1;
		int validChars = 0;
		int countUpperCase = 0;
		
		if (N > 200) return -1;
		
		for(int i=0; i<N; i++) {
			
			char ch = S.charAt(i);
			
			// skip number or special characters
			if (Character.isDigit(ch) || !Character.isLetterOrDigit(ch)) {
				start = -1;
				countUpperCase = 0;
				validChars = 0;
				continue;
			}
			
			if (Character.isLetter(ch)) {
				if (validChars == 0) {
					start = i;
				}
				
				// check for one UPPERCASE letter
				if (Character.isUpperCase(ch)) {
					
					countUpperCase++;
				}
				
				validChars++;
			}
			
			if (validChars > 0 && countUpperCase >= 1) {
				
				if (((i-start) + 1) > longest) {
					longest = (i - start) + 1;
				}
			}
		}
		
		return longest;
	}

}
