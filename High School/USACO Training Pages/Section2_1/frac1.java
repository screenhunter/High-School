/*
PROG: frac1
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class frac1 {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("frac1.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("frac1.out")));

		N = Integer.parseInt(in.readLine());

		ArrayList<Fraction> list = new ArrayList<Fraction>();
		for (int i = 1; i <= N; i++)
			for (int j = 0; j <= N; j++)
				if (((double)j) / i <= 1)
					list.add(new Fraction(j, i));

		Collections.sort(list);
		Fraction prev = list.get(0);
		for (int i = 0; i < list.size(); i++) {

			if (prev.compareTo(list.get(i)) == 0) {

				if (list.get(i).den < prev.den)
					prev = list.get(i);

			} else {

				out.println(prev);
				prev = list.get(i);

			}

		}

		out.println(prev);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

}

class Fraction implements Comparable<Fraction> {

	public int num, den;
	public double value;

	public Fraction(int x, int y) {

		num = x;
		den = y;
		value = ((double) num) / den;

	}

	public int compareTo(Fraction f) {

		if (value > f.value)
			return 1;
		if (f.value > value)
			return -1;

		return 0;

	}

	public String toString() {

		return num + "/" + den;

	}

}