import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class A {

	public static String input, ans;
	public static long N, K;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String[] line = in.readLine().split(" ");

		N = Integer.parseInt(line[0]);
		K = Integer.parseInt(line[1]) % 26;

		input = in.readLine();
		long cur = 1;
		for (int i = 0; i < N; i++) {

			out.print((char) (((input.charAt(i) - 97 + cur) % 26) + 97));
			cur *= K;
			cur = cur % 26;

		}

		out.println();

		in.close();
		out.close();
		System.exit(0);

	}

}
