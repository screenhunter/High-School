/*
rkhanna
Rajat Khanna
12/15/2012
PROG: greetings
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class greetings {

	public static BufferedReader in;
	public static PrintWriter out;
	private static int B, E;
	private static ArrayList<Integer> b, e;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("greetings.in"));
		out = new PrintWriter(new BufferedWriter(
				new FileWriter("greetings.out")));

		String[] line = in.readLine().split(" ");
		B = Integer.parseInt(line[0]);
		E = Integer.parseInt(line[1]);
		b = new ArrayList<Integer>();
		e = new ArrayList<Integer>();

		for (int i = 0; i < B; i++) {

			line = in.readLine().split(" ");
			if (line[1].contains("L"))
				for (int j = 0; j < Integer.parseInt(line[0]); j++)
					b.add(-1);
			else
				for (int j = 0; j < Integer.parseInt(line[0]); j++)
					b.add(1);

		}
		
		for (int i = 0; i < E; i++) {

			line = in.readLine().split(" ");
			if (line[1].contains("L"))
				for (int j = 0; j < Integer.parseInt(line[0]); j++)
					e.add(-1);
			else
				for (int j = 0; j < Integer.parseInt(line[0]); j++)
					e.add(1);

		}
		
		while (b.size() < e.size())
			b.add(0);
		
		while (e.size() < b.size())
			e.add(0);
		
		out.println(run());

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	private static int run() {

		int bessie = 0;
		int elsie = 0;
		int count = 0;
		
		for (int i = 0; i < b.size(); i++) {
			
			if (bessie < elsie && bessie + b.get(i) >= elsie + e.get(i))
				count++;
			
			if (elsie < bessie && elsie + e.get(i) >= bessie + b.get(i))
				count++;
			
			bessie += b.get(i);
			elsie += e.get(i);
			
		}
		
		return count;
		
	}

}
