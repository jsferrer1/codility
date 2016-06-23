package codility;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import org.apache.commons.lang3.ArrayUtils;

public class CyclicRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {3, 8, 9, 7, 6};
		int K = 3;
		
		int[] A1 = solution(A, K);
	}
	
	//Helper method to convert int arrays into Lists
	static List<Integer> intArrayAsList(final int[] a) {
	    if(a == null)
	        throw new NullPointerException();
	    return new AbstractList<Integer>() {

	        @Override
	        public Integer get(int i) {
	            return a[i];//autoboxing
	        }
	        @Override
	        public Integer set(int i, Integer val) {
	            final int old = a[i];
	            a[i] = val;//auto-unboxing
	            return old;//autoboxing
	        }
	        @Override
	        public int size() {
	            return a.length;
	        }
	    };
	}
	
	public static int[] solution(int[] A, int K) {
		
		List<Integer> l = Arrays.asList(ArrayUtils.toObject(A));

		Collections.rotate(intArrayAsList(A), 3);
		System.out.println(Arrays.toString(A));
		
		return A;
	}

}
