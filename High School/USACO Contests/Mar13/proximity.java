import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 rkhanna
 Rajat Khanna
 3/9/2013
 PROG: proximity
 LANG: JAVA
 */

public class proximity {

	public static void main(String[] args) throws IOException {

		// long startTime = System.nanoTime();

		BufferedReader in = new BufferedReader(new FileReader("proximity.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"proximity.out")));

		String[] temp = in.readLine().split(" ");

		int N = Integer.parseInt(temp[0]);
		int K = Integer.parseInt(temp[1]);

		int[] cows = new int[N];

		for (int i = 0; i < N; i++)
			cows[i] = Integer.parseInt(in.readLine());

		int crowd = -1;

		for (int i = 0; i < N; i++) {

			int cur = cows[i];

			if (cur > crowd)
				for (int j = 1; i - j >= 0 && j <= K; j++) {

					int compare = cows[i - j];

					if (compare == cur && cur > crowd)
						crowd = cur;

				}

		}

		out.println(crowd);

		// long endTime = System.nanoTime();
		// System.out.println("Took " + (endTime - startTime)/1000000000.0 +
		// " s");

		in.close();
		out.close();
		System.exit(0);

	}

}
