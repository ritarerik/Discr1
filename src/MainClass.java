import java.util.Scanner;

public class MainClass {

	public static void main(String args[])
	{
		
		boolean exit = false;
		while (!exit) {
			
			System.out.println("1 > Ïåğåñå÷åíèå ãğàôîâ");
			System.out.println("2 > Ìèíèìàëüíàÿ ïîëóñòåïåíü çàõîäà");
			System.out.println("3 > Ñëó÷àéíàÿ ìàòğèöà INT");
			System.out.println("4 > Ñëó÷àéíàÿ ìàòğèöà BOOLEAN");
			System.out.println("5 > Âûõîä");
			System.out.print(">> ");
			
			Scanner in = new Scanner(System.in);			
			int num = 0;
			String res = "";
			try { num = in.nextInt(); } catch (Exception e) { continue; }
			
			 switch(num) {     
	        	case 1:
	        		
	        		boolean A[][] = RandomMatrix.createBOOLEAN(3);
	        		boolean B[][] = RandomMatrix.createBOOLEAN(3);	        		
	        		boolean C[][] = IntersectionOfGraphs.run(A, B);
	        		
	        		System.out.println("A >"); printMatrixBOOLEAN(A); System.out.println("\n"); 
	        		System.out.println("B >"); printMatrixBOOLEAN(B); System.out.println("\n");
	        		System.out.println("ĞÅÇÓËÜÒÀÒ >"); printMatrixBOOLEAN(C); System.out.println();
	        		
	        		break;
	        		
	        	case 2:
	        		
	        		int D[][] = RandomMatrix.createINT(3);
	        		System.out.println("ÌÀÒĞÈÖÀ >"); printMatrixINT(D); System.out.println("\n");
	        		
	        		System.out.println("ÏÎËÓÑÒÅÏÅÍÈ ÈÑÕÎÄÀ >"); 
	        		int E[] = Vertex.run(D);	        		
	        		for (int i = 0; i < D.length; i ++) {
	        			System.out.print(E[i]);	        			
	        			if (i < D.length - 1) System.out.print(" ");	        			
	        		}
	        		
	        		break;
	        		
	        	case 3 :
	        		
	        		int F[][] = RandomMatrix.createINT(10);
	        		printMatrixINT(F);
	        		
	        		break;
	        	
	        	case 4:
	        		
	        		boolean G[][] = RandomMatrix.createBOOLEAN(10);
	        		printMatrixBOOLEAN(G);
	        		
	        		break;
	        		
	        	default:
	        		exit = true;
	        		
			 }
			 
			 System.out.println("\n");			
			
		}
		
		
	}
	
	private static void printMatrixINT(int A[][]) {		
		for (int i = 0; i < A.length; i ++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j]);	        				
				if (j < A.length - 1) System.out.print(" ");	        				
			}
			
			if (i < A.length - 1) System.out.print("\n");	        			
		}		
	}
	
	private static void printMatrixBOOLEAN(boolean A[][]) {		
		for (int i = 0; i < A.length; i ++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j]);	        				
				if (j < A.length - 1) System.out.print(" ");	        				
			}
			
			if (i < A.length - 1) System.out.print("\n");	        			
		}		
	}
	
	
}
