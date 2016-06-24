package codility;

import java.util.Arrays;

public class TapeEquilibrium {
	
	// Correctness=100%	| Performance=33% | Task score=66%
	public int solution(int[] A) {
			
			int min = 0;
			int leftSum = 0;
			int[] diffs = new int[A.length-1];
			for(int i=0; i<(A.length-1); i++) {
				
				leftSum += A[i];
				
				int rightSum = 0;
				for(int j=i+1; j<A.length; j++) {
					
					rightSum += A[j];
				}
				
				diffs[i] = Math.abs(leftSum - rightSum);
			}
			
			Arrays.sort(diffs);
			
			return diffs[0];
	}
		
	// Correctness=100%	| Performance=100% | Task score=100%
	public int solution1(int[] A) {
		
		// write your code in Java SE 8
		int LSide = 0;
		int RSide = 0;
		int[] Num = new int[A.length-1];
		    
		//sets RSide to all the arrays added
		for(int i =0; i<A.length; i++)
		{
		    RSide += A[i];
		}
            
		  for(int i =0; i<A.length-1; i++)
		  {
		      //removes the first and onwards array from the RSide
		  RSide -= A[i];
		  //Adds the next array to the LSide
		  LSide += A[i];
		  //this allows for absolutes to be calculated
		      Num[i] = Math.abs(LSide - RSide);
		  }
		  
		  //sort array Num in order of smallest to largest
		  Arrays.sort(Num);
		  
		  //returns smallest array
		   return Num[0];   		
		
	}
	
	
}
