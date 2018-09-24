import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainClass {

	public static void main(String args[])
	{
		
		boolean exit = false;
		while (!exit) {
			
			System.out.println("> Ðàçìåðíîñòü ìàòðèöû (5;10)");
			System.out.println("> Âûõîä >> 0");
			System.out.print("\n  >> ");
			
			int size = 0;
			Scanner in = new Scanner(System.in);
			
			try { 
				size = in.nextInt(); 
				
				if (size == 0) exit = true;
				else if (size < 5 || size > 10) throw new Exception();
				
			} catch (Exception e) { 
				System.out.println("\n> Íåâåðíûé ââîä, ïîæàëóéñòà, ââåäèòå ÷èñëî (5;10)\n"); 
				continue; 
			}
			
			if (!exit) {			
				System.out.println();
				
		        boolean A[][] = RandomMatrix.createBOOLEAN(size); 	delay(10);
		        boolean B[][] = RandomMatrix.createBOOLEAN(size); 	delay(10);        		
		        boolean C[][] = IntersectionOfGraphs.run(A, B);		delay(10);
		        		
		        System.out.println(">> A >\n"); 		printMatrixBOOLEAN(A); System.out.println("\n"); 
		        System.out.println(">> B >\n"); 		printMatrixBOOLEAN(B); System.out.println("\n");
		        System.out.println(">> ÐÅÇÓËÜÒÀÒ >\n"); printMatrixBOOLEAN(C); System.out.println("\n");
		        	        
		        int D[] = Vertex.run(booleanMatrixToInt(C));
		        
		        System.out.println(">> ÏÎËÓÑÒÅÏÅÍÈ ÇÀÕÎÄÀ >\n");
		        for (int i = 0; i < C.length; i ++) {
		        	System.out.println("   x(" + i + ") = " + D[i]);        			
		        }
		        		
		        System.out.println("\n");
		        		
		        int minIndex = getMinIndex(D);
		        System.out.println(">> ÌÈÍÈÌÀËÜÍÀß ÏÎËÓÑÒÅÏÅÍÜ >\n");
		        System.out.println("   >> x(" + minIndex + ") = " + D[minIndex]);
	
				System.out.println("\n");			
			}
		}
		
		
	}
	
	private static void printMatrixINT(int A[][]) {	  	
		
		System.out.print("        |");
		for (int i = 0; i < A.length; i++) {
			System.out.print("(" + i + ") ");
		}
		System.out.println();
		
		
		System.out.print("        |———");
		for (int i = 0; i < A.length - 1; i++) {
			System.out.print("————");
		}
		System.out.println();
		
		
		for (int i = 0; i < A.length; i ++) {
			System.out.print("   x(" + i + ") |");
			for (int j = 0; j < A.length; j++) {
				System.out.print(" " + A[i][j] + " ");	        				
				if (j < A.length - 1) System.out.print(" ");	        				
			}			
			if (i < A.length - 1) System.out.print("\n");	        			
		}		
	}
	
	private static void printMatrixBOOLEAN(boolean A[][]) {
		
		System.out.print("        |");
		for (int i = 0; i < A.length; i++) {
			System.out.print("(" + i + ") ");
		}
		System.out.println();
		
		System.out.print("        |———");
		for (int i = 0; i < A.length - 1; i++) {
			System.out.print("————");
		}
		System.out.println();

		for (int i = 0; i < A.length; i ++) {
			System.out.print("   x(" + i + ") |");
			for (int j = 0; j < A.length; j++) {				
				if (A[i][j] == true) System.out.print(" " + 1 + " ");
					else System.out.print(" " + 0 + " ");
				if (j < A.length - 1) System.out.print(" ");	        				
			}			
			if (i < A.length - 1) System.out.print("\n");	        			
		}		
	}
	
	private static int getMinIndex(int A[]) {
		
		int min = A[0], minIndex = 0;	
		
		for (int i = 0; i < A.length; i++) {			
			if (A[i] < min) {
				min = A[i];	
				minIndex = i;
			}
		}	
		
		return minIndex;		
		
	}
	
	private static void delay(int time) {
		try {
			TimeUnit.MILLISECONDS.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private static int[][] booleanMatrixToInt(boolean A[][]) {
		
		int B[][] = new int[A.length][A.length];
		
		for (int i = 0; i < A.length; i++) 
			for (int j = 0; j < A.length; j++) 
				if (A[i][j]) B[i][j] = 1;
				else B[i][j] = 0;
		
		return B;
		
	}
	
	
}
