/*
PROG: checker
LANG: JAVA
 */



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class checker {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	public static int[] state;
	public static boolean[] cols;
	public static boolean[] rDiag;
	public static boolean[] lDiag;
	public static int count;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("checker.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("checker.out")));

		N = Integer.parseInt(in.readLine());
		state = new int[N];
		cols = new boolean[N];
		lDiag = new boolean[2 * N - 1];
		rDiag = new boolean[2 * N - 1];
		count = 0;
		
		recur(0);
		out.println(count);
		
		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}
	
	private static void recur(int row) {
		
		if (row >= N) {
			
			count++;
			
			if (count <= 3) {
				
				String s = "";
				for (int i = 0; i < N; i++)
					s += state[i] + 1 + " ";
				out.println(s.trim());
				
			}
			
			return;
			
		}
		
		for (int i = 0; i < N; i++) {
			
			if (place(row, i)) {
				
				recur(row+1);
				undo(row, i);
				
			}
			
		}
		
	}

	private static void undo(int row, int col) {

		state[row] = -1;
		cols[col] = false;
		rDiag[row + col] = false;
		lDiag[N - 1 - row + col] = false;
		
	}

	private static boolean place(int row, int col) {
		
		if (cols[col] == true)
			return false;
		
		if (rDiag[row + col] == true)
			return false;
		
		if (lDiag[N - 1 - row + col] == true)
			return false;
		
		state[row] = col;
		cols[col] = true;
		rDiag[row + col] = true;
		lDiag[N - 1 - row + col] = true;
		
		return true;
		
	}
}
