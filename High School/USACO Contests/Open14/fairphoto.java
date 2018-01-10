/*
rkhanna
Rajat Khanna
04/07/2014
PROG: fairphoto
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class fairphoto {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	public static ArrayList<Cow> cows;

	public static void main(String[] args) throws Exception {

		in = new BufferedReader(new FileReader("fairphoto.in"));
		out = new PrintWriter(new BufferedWriter(
				new FileWriter("fairphoto.out")));

		N = Integer.parseInt(in.readLine());
		cows = new ArrayList<Cow>(N);

		for (int i = 0; i < N; i++)
			cows.add(new Cow(in.readLine().split(" ")));

		Collections.sort(cows);
		for (int i = 0; i < N; i++) {

			int a, b, c;

			if (i == 0)
				a = cows.get(i).pos;
			else
				a = cows.get(i - 1).pos;

			b = cows.get(i).pos;

			if (i == N - 1)
				c = cows.get(i).pos;
			else
				c = cows.get(i + 1).pos;

			cows.get(i).left = c - b;
			cows.get(i).right = b - a;

		}

		if (Cow.W < Cow.S)
			case1(Cow.W - Cow.S);
		else if ((Cow.W - Cow.S) % 2 == 1)
			case2();

		out.println(cows.get(N - 1).pos - cows.get(0).pos);

		in.close();
		out.close();

		System.exit(0);

	}

	private static void case1(int dif) {

		Cow left, right;
		int pos, lw, rw;

		pos = 0;
		lw = 0;
		while (cows.get(pos).white == true)
			pos++;
		lw = pos;
		left = cows.get(pos);

		pos = N - 1;
		while (cows.get(pos).white == true)
			pos--;
		rw = N - 1 - pos;
		right = cows.get(pos);

	}

	private static void case2() {

		Cow first = cows.get(0);
		Cow last = cows.get(N - 1);

		if (first.left < last.right)
			cows.remove(0);
		else
			cows.remove(N - 1);

		N--;

	}
	
	public static class Cow implements Comparable<Cow> {

		public int pos, left, right;
		public boolean white;
		public static int W, S;

		public Cow(String[] s) {

			pos = Integer.parseInt(s[0]);
			white = false;
			S++;
			if (s[1].equals("W")) {

				white = true;
				W++;
				S--;
			}

		}

		public int compareTo(Cow c) {

			return pos - c.pos;

		}

	}

}