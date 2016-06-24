package codility;

public class FrogJmp {
	
	public int solution(int X, int Y, int D) {
		
		if (X>=Y) return 0;
		
		// (Y - X) / D
		int min = (Y-X) / D;
		
		int newPos = X + (D*min);
		if (newPos >= Y) return min;
		else min++;
		
		return min;
	}

}
