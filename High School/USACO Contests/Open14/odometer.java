/*
rkhanna
Rajat Khanna
04/07/2014
PROG: odometer
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class odometer {

	public static BufferedReader in;
	public static PrintWriter out;
	public static long X, Y;
	public static int count;
	public static int[] counts;

	public static void main(String[] args) throws Exception {

		in = new BufferedReader(new FileReader("odometer.in"));
		out = new PrintWriter(
				new BufferedWriter(new FileWriter("odometer.out")));

		String[] line = in.readLine().split(" ");

		X = Long.parseLong(line[0]);
		Y = Long.parseLong(line[1]);
		count = 0;
		counts = new int[10];

		for (long i = X; i <= Y; i++)
			test(i + "");

		out.println(count);

		in.close();
		out.close();

		System.exit(0);

	}

	private static void test(String s) {

		Arrays.fill(counts, 0);

		for (char c : s.toCharArray())
			if (c == '0')
				counts[0]++;
			else if (c == '1')
				counts[1]++;
			else if (c == '2')
				counts[2]++;
			else if (c == '3')
				counts[3]++;
			else if (c == '4')
				counts[4]++;
			else if (c == '5')
				counts[5]++;
			else if (c == '6')
				counts[6]++;
			else if (c == '7')
				counts[7]++;
			else if (c == '8')
				counts[8]++;
			else
				counts[9]++;

		int length = s.length();

		for (int i = 0; i < 10; i++)
			if (counts[i] * 2 >= length) {

				count++;
				break;

			}

	}

}
