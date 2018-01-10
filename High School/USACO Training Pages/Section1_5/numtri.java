/*
 PROG: numtri
 LANG: JAVA
 */



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class numtri {

	public static int R;
	public static int[][] tree;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new FileReader("numtri.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"numtri.out")));

		R = Integer.parseInt(in.readLine());
		tree = new int[R][R];
		
		for (int i = 0; i < R; i++) {
			
			String[] line = in.readLine().split(" ");
			for (int j = 0; j < line.length; j++)
				tree[i][j] = Integer.parseInt(line[j]);
			
		}
		
		for (int i = R-2; i >= 0; i--)
			for (int j = 0; j < R-1; j++)
				tree[i][j] += Math.max(tree[i+1][j], tree[i+1][j+1]);
		
		out.println(tree[0][0]);

		in.close();
		out.close();		
		System.exit(0);

	}

}