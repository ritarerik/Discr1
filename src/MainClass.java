import java.util.Scanner;

public class MainClass {

	public static void main(String args[])
	{
		
		boolean exit = false;
		while (!exit) {
			
			System.out.println("1 > пересечение графов");
			System.out.println("2 > минимальная полустепень захода");
			System.out.println("3 > случайная матрица INT");
			System.out.println("4 > случайная матрица BOOLEAN");
			System.out.println("5 > выход");
			System.out.println(">> ");
			
			Scanner in = new Scanner(System.in);			
			int num = 0;
			String res = "";
			try { num = in.nextInt(); } catch (Exception e) { continue; }
			
			 switch(num) {     
	        	case 1:
	        		
	        		boolean A[][] = {{true, false, false}, {false, true, false}, {true, true, false}};
	        		boolean B[][] = {{false, false, false}, {true, false, false}, {false, false, true}};
	        		
	        		boolean C[][] = IntersectionOfGraphs.run(A, B);
	        		
	        		for (int i = 0; i < A.length; i ++) {
	        			for (int j = 0; j < A.length; j++) {
	        				System.out.print(C[i][j]);	        				
	        				if (j < A.length - 1) System.out.print(" ");	        				
	        			}
	        			
	        			if (i < A.length - 1) System.out.print("\n");	        			
	        		}
	        		
	        		break;
	        		
	        	case 2:
	        		
	        		int D[][] = {{1, 5, 2}, {1, 5, 2}, {1, 5, 2}};
	        		
	        		int E[] = Vertex.run(D);
	        		
	        		for (int i = 0; i < D.length; i ++) {
	        			System.out.print(E[i]);	        			
	        			if (i < D.length - 1) System.out.print(" ");	        			
	        		}
	        		
	        		break;
	        		
	        	case 3 :
	        		
	        		int F[][] = RandomMatrix.createINT(10);
	        		
	        		for (int i = 0; i < F.length; i ++) {
	        			for (int j = 0; j < F.length; j++) {
	        				System.out.print(F[i][j]);	        				
	        				if (j < F.length - 1) System.out.print(" ");	        				
	        			}
	        			
	        			if (i < F.length - 1) System.out.print("\n");	        			
	        		}
	        		
	        		break;
	        	
	        	case 4:
	        		
	        		boolean G[][] = RandomMatrix.createBOOLEAN(10);
	        		
	        		for (int i = 0; i < G.length; i ++) {
	        			for (int j = 0; j < G.length; j++) {
	        				System.out.print(G[i][j]);	        				
	        				if (j < G.length - 1) System.out.print(" ");	        				
	        			}
	        			
	        			if (i < G.length - 1) System.out.print("\n");	        			
	        		}
	        		
	        		break;
	        		
	        	default:
	        		exit = true;
	        		
			 }
			 
			 System.out.println("\n");			
			
		}
		
		
	}
	
	
}
