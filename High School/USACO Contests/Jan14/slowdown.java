/*
rkhanna
Rajat Khanna
01/11/2014
PROG: slowdown
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.PriorityQueue;

public class slowdown {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N;
	public static PriorityQueue<Integer> T, D;
	public static long time;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("slowdown.in"));
		out = new PrintWriter(
				new BufferedWriter(new FileWriter("slowdown.out")));

		N = Integer.parseInt(in.readLine());
		T = new PriorityQueue<Integer>();
		D = new PriorityQueue<Integer>();
		time = 0;

		String[] line;
		for (int i = 0; i < N; i++) {

			line = in.readLine().split(" ");
			if (line[0].equals("T"))
				T.add(Integer.parseInt(line[1]));
			else
				D.add(Integer.parseInt(line[1]));

		}

		start();

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static void start() {

		int curTime = 0;
		int curSpeed = 1;
		double time = 0;
		double dist = 0;

		while (T.size() > 0) {

			curTime = T.remove();
			double temp = dist + (curTime - time) / curSpeed;

			while (time < curTime && D.size() > 0 && D.peek() < temp) {

				time += (D.peek() - dist) * curSpeed;
				dist = D.remove();
				curSpeed++;
				temp = dist + (curTime - time) / curSpeed;

			}

			dist += (curTime - time) / curSpeed;
			time = curTime;
			curSpeed++;

		}

		while (D.size() > 0) {

			time += (D.peek() - dist) * curSpeed;
			dist = D.remove();
			curSpeed++;

		}

		time += (1000 - dist) * curSpeed;

		out.print(Math.round(time));

	}

}
