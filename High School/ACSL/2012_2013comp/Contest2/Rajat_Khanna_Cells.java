package Contest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Rajat Khanna
 * Thomas Jefferson High School for Science and Technology
 * Junior Division
 * Contest #2 2012-2013
 * Cells
 */

public class Rajat_Khanna_Cells {

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		for (int counter = 1; counter <= 5; counter++) {

			System.out.println("Please enter the input:");

			String input = in.readLine();

			StringTokenizer st = new StringTokenizer(input, ", ");

			String[] line = new String[2];
			int pos = 0;

			while (st.hasMoreTokens()) {

				line[pos] = st.nextToken();
				pos++;

			}

			for (int i = 0; i < 2; i++)
				line[i] = line[i].trim();

			line[0] = line[0].toLowerCase();

			if (line[0].contains("divide"))
				System.out.println(divide(line[1]));
			else if (line[0].contains("add"))
				System.out.println(add(line[1], Integer.parseInt(line[0]
						.substring(line[0].length() - 1))));
			else if (line[0].contains("subtract"))
				System.out.println(subtract(line[1], Integer.parseInt(line[0]
						.substring(line[0].length() - 1))));

		}

		in.close();

	}

	private static String divide(String s) {

		String s1 = s.substring(0, 4);
		String s2 = s.substring(4);

		return s1 + s1 + " and " + s2 + s2;

	}

	private static String add(String s, int x) {

		String s1 = s.substring(0, x) + s;
		s1 = s1.substring(0, 8);

		return s1;

	}

	private static String subtract(String s, int x) {

		String s1 = s + s.substring(s.length() - x);
		s1 = s1.substring(x);

		return s1;

	}

}
