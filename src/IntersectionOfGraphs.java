
// пересечение графов

public class IntersectionOfGraphs {

	public static boolean[][] run(boolean[][] A, boolean[][] B) {
		
		boolean C[][] = new boolean[A.length][A.length];		
		
		for (int i = 0; i < A.length; i++) 
			for (int j = 0; j < A.length; j++) {
				C[i][j] = A[i][j] || B[i][j];
			}
		
		return C;		
		
	}
	
}
