import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class blink {

	private static PrintWriter out;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new FileReader("blink.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("blink.out")));

		String line = in.readLine();
		StringTokenizer st = new StringTokenizer(line, ", ");
		int N = Integer.parseInt(st.nextToken());
		String triesStr = st.nextToken();
		BigInteger tries = new BigInteger(triesStr);

		int[] b = new int[N];

		for (int i = 0; i < N; i++)
			b[i] = Integer.parseInt(in.readLine());

		for (BigInteger bi = BigInteger.ZERO; bi.compareTo(tries) < 0; bi = bi
				.add(BigInteger.ONE)) {

			int last = b.length - 1;
			int val = b[last];

			for (int i = last; i >= 0; i--) {

				if (i == 0) {

					if (val == 1)
						b[i] = 1 ^ b[i];

				} else if (b[i - 1] == 1)
					b[i] = 1 ^ b[i];
			}

		}

		printState(b);

		in.close();
		out.close();
		System.exit(0);

	}

	private static void printState(int[] b) {

		for (int i = 0; i < b.length; i++)
			out.println(b[i]);
	}

}
