
/*
 rkhanna
 Rajat Khanna
 11/17/2012
 PROG: typo
 LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class typo {

	public static boolean checker(String s) {

		if (s.length() % 2 == 1)
			return false;

		int temp = s.length() / 2;

		for (int count = 0; count < temp; count++)
			for (int i = 0; i < s.length() - 1; i++)
				if (s.substring(i, i + 2).contentEquals("()")) {

					s = s.substring(0, i) + s.substring(i + 2);
					i = -1;

				}

		if (s.length() == 0)
			return true;

		return false;

	}

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new FileReader("typo.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"typo.out")));

		String line = in.readLine();
		int count = run(line);

		out.println(count);

		in.close();
		out.close();
		System.exit(0);

	}

	public static int run(String line) {

		if (checker(line) == true)
			return 0;

		int count = 0;

		for (int i = 0; i < line.length(); i++)
			if (line.charAt(i) == '(') {

				if (checker(line.substring(0, i) + ')' + line.substring(i + 1)))
					count++;

			} else {

				if (checker(line.substring(0, i) + '(' + line.substring(i + 1)))
					count++;

			}

		return count;

	}

}
