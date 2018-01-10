/*
PROG: B
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ykangbuffbuff {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, max;
	public static double[][] zombies;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("B.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("B.out")));

		N = Integer.parseInt(in.readLine());
		zombies = new double[N][2];

		for (int i = 0; i < N; i++) {

			String[] line = in.readLine().split(" ");
			zombies[i][0] = Integer.parseInt(line[0]);
			zombies[i][1] = Integer.parseInt(line[1]);

		}

		max = 2;
		iterate();
		
		out.println(max);
		
		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static void iterate() {

		for (int i = 0; i < N; i++)
			for (int j = 0; j < i; j++) {
				
				int count = 0;
				
				double y = zombies[i][1] - zombies[j][1];
				double x = zombies[i][0] - zombies[j][0];
				
				for (int k = 0; k < N; k++)
					if (zombies[i][0] == zombies[k][0] && zombies[i][1] == zombies[k][1])
						count++;
					else if (x == 0) {
						if (zombies[i][0] == zombies[k][0])
							count++;
					} else
						if (y/x == (zombies[i][1] - zombies[k][1])/(zombies[i][0] - zombies[k][0]))
							count++;
				
				if (count > max)
					max = count;
			}
		
	}
}
