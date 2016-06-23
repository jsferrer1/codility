package codility;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

//List<Integer> li = intArrayAsList(A);
//List<Integer> list = IntStream.of(A).boxed().collect(Collectors.toList());
//List<Object> li =  Arrays.stream(A).boxed().collect(Collectors.toList());

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {9, 3, 9, 3, 9, 7, 9};
		int unpaired = solution(A);
	}

	public static int solution(int[] A) {
		
		// copy the lists
		List<Integer> list = new ArrayList<Integer>();
		for (int i : A) list.add(i);
		
		// loop through the lists
		int i = 0;
		while (list.size() > 0) {
			Integer elem = list.get(i);
			
			int[] indices = IntStream.range(0, list.size())
	                .filter(p -> list.get(p) == elem)
	                .toArray();
			
			System.out.println(indices.toString());
			
			if (indices.length <= 1) { // not found
				return elem;
			} else if (indices.length >= 2) {
				// remove these elements
				list.remove(indices[1]);
				list.remove(indices[0]);
				i = 0;
			}
			
		}
		
		return 0;
	}
	
}
