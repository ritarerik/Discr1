// Вычисление вершины графа с минимальной полустепенью захода

public class Vertex {
	
	public static int[] run(int A[][]) {
		
		int B[] = new int[A.length];
		for (int i : B) i = 0;
		
		for (int i = 0; i < A.length; i++)
			for (int j = 0; j < A.length; j++) 
				B[i] += A[j][i];
			
		return B;		
		
	}
	
}
