import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainClass {

	public static void main(String args[])
	{
		
		boolean exit = false;
		while (!exit) {
			
			System.out.println("> Ïåðåñå÷åíèå ãðàôîâ 			>> 1");
			System.out.println("> Ìèíèìàëüíàÿ ïîëóñòåïåíü çàõîäà 	>> 2");
			System.out.println("> Ñëó÷àéíàÿ ìàòðèöà INT 		>> 3");
			System.out.println("> Ñëó÷àéíàÿ ìàòðèöà BOOLEAN 		>> 4");
			System.out.println("> Âûõîä 				>> Äðóãîå");
			System.out.print("\n  >> ");
			
			Scanner in = new Scanner(System.in);			
			int num = 0;
			String res = "";
			try { 
				num = in.nextInt(); 
			} catch (Exception e) { 
				System.out.println("\n> Íåâåðíûé ââîä, ïîæàëóéñòà, ââåäèòå ÷èñëî\n"); 
				continue; 
			}
			
			System.out.println("\n> Ðàçìåðíîñòü ìàòðèöû (5;10)");
			System.out.print("\n  >> ");
			
			int size = 0;
			
			try { 
				size = in.nextInt(); 
				
				if (size < 5 || size > 10) throw new Exception();
				
			} catch (Exception e) { 
				System.out.println("\n> Íåâåðíûé ââîä, ïîæàëóéñòà, ââåäèòå ÷èñëî (5;10)\n"); 
				continue; 
			}

			System.out.println();
			
			 switch(num) {     
	        	case 1:
	        		
	        		boolean A[][] = RandomMatrix.createBOOLEAN(size); 	delay(10);
	        		boolean B[][] = RandomMatrix.createBOOLEAN(size); 	delay(10);        		
	        		boolean C[][] = IntersectionOfGraphs.run(A, B);		delay(10);
	        		
	        		System.out.println(">> A >\n"); 		printMatrixBOOLEAN(A); System.out.println("\n"); 
	        		System.out.println(">> B >\n"); 		printMatrixBOOLEAN(B); System.out.println("\n");
	        		System.out.println(">> ÐÅÇÓËÜÒÀÒ >\n"); printMatrixBOOLEAN(C); System.out.println();
	        		
	        		break;
	        		
	        	case 2:
	        		
	        		int D[][] = RandomMatrix.createINT(size);
	        		System.out.println(">> ÌÀÒÐÈÖÀ >\n"); printMatrixINT(D); System.out.println("\n");
	        		
	        		int E[] = Vertex.run(D);
	        		System.out.println(">> ÏÎËÓÑÒÅÏÅÍÈ ÇÀÕÎÄÀ >\n");
	        		for (int i = 0; i < D.length; i ++) {
	        			System.out.println("   x(" + i + ") = " + E[i]);	        			
//	        			if (i < D.length - 1) System.out.print(", ");	        			
	        		}
	        		
	        		System.out.println("\n");
	        		
	        		int minIndex = getMinIndex(E);
	        		System.out.println(">> ÌÈÍÈÌÀËÜÍÀß ÏÎËÓÑÒÅÏÅÍÜ >\n");
	        		System.out.println("   >> x(" + minIndex + ") = " + E[minIndex]);
	        		
	        		break;
	        		
	        	case 3 :
	        		
	        		int F[][] = RandomMatrix.createINT(size);
	        		printMatrixINT(F); System.out.println();
	        		
	        		break;
	        	
	        	case 4:
	        		
	        		boolean G[][] = RandomMatrix.createBOOLEAN(size);
	        		printMatrixBOOLEAN(G); System.out.println();
	        		
	        		break;
	        		
	        	default:
	        		exit = true;
	        		
			 }
			 
			 System.out.println("\n");			
			
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
