/*
rkhanna 
Rajat Khanna
XX/XX/2014
prog: crowded
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class crowded {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, D, start, end, count;
	public static Cow[] farm;
	public static PriorityQueue<Cow> left, right;

	public static void main(String[] args) throws Exception {

		long sT = System.nanoTime();

		in = new BufferedReader(new FileReader("crowded.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("crowded.out")));

		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		D = Integer.parseInt(line[1]);
		farm = new Cow[N];

		for (int i = 0; i < N; i++)
			farm[i] = new Cow(in.readLine().split(" "));

		Comparator<Cow> comp = new Comparator<Cow>() {
			
			public int compare(Cow a, Cow b) {
				
				return b.h - a.h;
				
			}
			
		};
		
		left = new PriorityQueue<Cow>(N, comp);
		right = new PriorityQueue<Cow>(N, comp);
		Arrays.sort(farm);

		start = 0;
		end = 0;

		count = 0;
		
		for (int i = 0; i < N; i++) {

			check(i);
			
			if (left.size() > 0 && right.size() > 0)
				if (left.peek().h >= farm[i].h * 2
						&& right.peek().h >= farm[i].h * 2)
					count++;

			left.add(farm[i]);
			right.remove(farm[i]);

		}

		out.println(count);

		System.out.println("Took " + (System.nanoTime() - sT) + " ns");
		in.close();
		out.close();
		System.exit(0);

	}

	public static void check(int cur) {

		while (start < cur && farm[start].x < farm[cur].x - D) {

			left.remove(farm[start]);
			start++;

		}
		
		right.remove(farm[cur]);
		while (end + 1 < N && farm[end + 1].x <= farm[cur].x + D) {

			end++;
			right.add(farm[end]);

		}

	}

}

class Cow implements Comparable<Cow> {

	public int x, h;

	public Cow(String[] s) {

		x = Integer.parseInt(s[0]);
		h = Integer.parseInt(s[1]);

	}

	public int compareTo(Cow c) {

		return x - c.x;

	}
	
	public String toString() {
		
		return x + " " + h;
		
	}

}
