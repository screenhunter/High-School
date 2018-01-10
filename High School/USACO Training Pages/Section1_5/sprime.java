/*
PROG: sprime
LANG: JAVA
 */



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class sprime {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	public static String case1 = "2357";
	public static String case2 = "1379";

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("sprime.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("sprime.out")));

		N = Integer.parseInt(in.readLine());

		recur(N, "");

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static void recur(int n, String s) {

		if (n == 0) {

			if (check(s))
				out.println(s);

			return;

		}

		if (n == N)
			for (char c : case1.toCharArray())
				recur(n - 1, s + c);
		else
			for (char c : case2.toCharArray())
				recur(n - 1, s + c);

	}

	private static boolean check(String s) {

		String temp = "";

		for (int i = 0; i < s.length(); i++) {

			temp += s.charAt(i);
			if (!isPrime(temp))
				return false;

		}

		return true;

	}

	private static boolean isPrime(String s) {

		double x = Double.parseDouble(s);

		for (int i = 2; i <= Math.sqrt(x); i++)
			if (x / ((double) i) == (int) (x / i))
				return false;

		return true;

	}

}
