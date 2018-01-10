
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class typo_optimized {

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new FileReader("cowfind.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"cowfind.out")));

		String l = in.readLine();

		char[] line = new char[l.length()];
		int[] count = new int[line.length];

		for (int i = 0; i < line.length; i++) {

			count[i] = reader(line[i]);

		}

		out.println(count);

		in.close();
		out.close();
		System.exit(0);

	}

	private static int reader(char c) {

		if (c == '(')
			return 1;
		if (c == ')')
			return -1;

		return 1;

	}

}
