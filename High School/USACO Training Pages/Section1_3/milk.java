/*
PROG: milk
LANG: JAVA
*/



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class milk {
	
	private static int N;
	private static int M;
	private static int[][] milk;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new FileReader("milk.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk.out")));
		
		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
		milk = new int[2][M];
		
		for (int i = 0; i < M; i++) {
			
			line = in.readLine().split(" ");
			for (int j = 0; j < 2; j++)
				milk[j][i] = Integer.parseInt(line[j]);
			
		}
		
		int cost = 0;
		int amount = 0;
		
		while (amount != N) {
			
			int index = search();
			if (amount + milk[1][index] <= N) {
				
				cost += milk[0][index]*milk[1][index];
				amount += milk[1][index];
				
			} else {
				
				cost += milk[0][index]*(N - amount);
				amount = N;
			}
			
			milk[0][index] = Integer.MAX_VALUE;
			
		}
		
		out.println(cost);
		
		in.close();
		out.close();
		System.exit(0);

	}

	private static int search() {
		
		int index = 0;
		
		for (int i = 1; i < milk[0].length; i++)
			if (milk[0][index] > milk[0][i])
				index = i;
		
		return index;
		
	}

}
