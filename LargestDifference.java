package codility;

import java.util.Arrays;

public class LargestDifference {
	
	// Correctness=100%	| Performance=100% | Task score=100%
	public int solution(int[] A) {
		
		// write your code in Java SE 8
		int lSide = 0;
		int rSide = 0;
		int[] arr = new int[A.length-1];
		    
		//sets RSide to all the arrays added
		  for(int i =0; i<A.length-1; i++)
		  {
			  lSide = A[i];
			  rSide = A[i+1];
			  //this allows for absolutes to be calculated
		      arr[i] = Math.abs(lSide - rSide);
		  }
		  
		  //sort array arr in order of smallest to largest
		  Arrays.sort(arr);
		  
		  //returns largest array
		  return arr[arr.length-1];   		
		
	}	
}
