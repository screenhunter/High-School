/*
PROG: bphoto
LANG: JAVA
*/



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class bphoto {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new FileReader("bphoto.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("bphoto.out")));
		
		int N = Integer.parseInt(in.readLine());
		
		int[][] photos = new int[5][N];
		
		for (int j = 0;  j < 5; j++)
			for (int i = 0; i < N; i++)
				photos[j][i] = Integer.parseInt(in.readLine());
		
		
		
		in.close();
		out.close();
		System.exit(0);
		
	}

}
