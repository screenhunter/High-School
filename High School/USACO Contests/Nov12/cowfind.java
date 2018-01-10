
/*
 rkhanna
 Rajat Khanna
 11/17/2012
 PROG: cowfind
 LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class cowfind {

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new FileReader("cowfind.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"cowfind.out")));

		String line = in.readLine();

		int count = 0;

		for (int i = 0; i < line.length() - 3; i++) {

			String x = line.substring(i, i + 2);

			if (x.contentEquals("((") == true) {

				for (int j = i; j < line.length() - 1; j++) {

					String y = line.substring(j, j + 2);

					if (y.contentEquals("))") == true)
						count++;

				}

			}

		}

		out.println(count);

		in.close();
		out.close();
		System.exit(0);

	}

}
