/*
PROG: ariprog
LANG: JAVA
 */



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ariprog {

	private static int N;
	private static int M;

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader("ariprog.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"ariprog.out")));

		N = Integer.parseInt(in.readLine());
		M = Integer.parseInt(in.readLine());
		int x = M * M * 2;
		boolean[] nums = new boolean[x + 1];

		for (int i = 0; i <= M; i++)
			for (int j = 0; j <= i; j++)
				nums[i * i + j * j] = true;

		boolean flag = true;
		int quantity;
		int cur;

		for (int i = 1; i <= x/(N-1); i++)
			for (int j = 0; j < x; j++) {

				if (!nums[j])
					continue;

				cur = j;
				quantity = 1;

				while (quantity < N) {

					cur += i;
					if (cur >= x + 1 || !nums[cur])
						break;
					quantity++;

				}

				if (quantity == N) {

					flag = false;
					out.println(j + " " + i);

				}

			}

		if (flag)
			out.println("NONE");

		in.close();
		out.close();
		System.exit(0);

	}

}
