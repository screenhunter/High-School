import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

public class haywire {

	private static HashSet<String> pairs;
	private static int min;

	private static int calculate(int[] input) {

		int sum = 0;

		for (String s : pairs)
			sum += Math
					.abs(input[Integer.parseInt(s.substring(0, s.indexOf(" "))) - 1]
							- input[Integer.parseInt(s.substring(s.indexOf(" ") + 1)) - 1]);

		return sum;

	}

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader("haywire.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"haywire.out")));

		int n = Integer.parseInt(in.readLine());
		pairs = new HashSet<String>();

		for (int i = 1; i <= n; i++)
			for (String s : in.readLine().split(" "))
				if (!pairs.contains(s + " " + i)
						&& !pairs.contains(i + " " + s))
					pairs.add(i + " " + s);

		int[] barn = new int[n];
		for (int i = 0; i < n; i++)
			barn[i] = i + 1;

		min = Integer.MAX_VALUE;

		permute(barn, 0);

		out.println(min);

		in.close();
		out.close();
		System.exit(0);

	}

	public static void permute(int[] input, int start) {

		if (start == input.length) {

			int x = calculate(input);
			if (x < min)
				min = x;

		} else {
			for (int i = start; i < input.length; i++) {

				int temp = input[i];
				input[i] = input[start];
				input[start] = temp;
				permute(input, start + 1);
				input[start] = input[i];
				input[i] = temp;
			}
		}

	}

}
