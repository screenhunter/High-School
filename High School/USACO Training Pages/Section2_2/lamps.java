/*
PROG: lamps
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class lamps {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, C;
	public static ArrayList<Integer> on, off;
	public static ArrayList<String> ans;
	
	public static void main(String[] args) throws Exception {
		
		long startTime = System.nanoTime();
		
		in = new BufferedReader(new FileReader("lamps.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("lamps.out")));
		
		N = Integer.parseInt(in.readLine());
		C = Integer.parseInt(in.readLine());
		
		on = new ArrayList<Integer>();
		off = new ArrayList<Integer>();
		
		String[] line = in.readLine().split(" ");
		for (String s: line)
			if (s.equals("-1"))
				break;
			else
				on.add(Integer.parseInt(s) - 1);
		
		line = in.readLine().split(" ");
		for (String s: line)
			if (s.equals("-1"))
				break;
			else
				off.add(Integer.parseInt(s) - 1);
		
		ans= new ArrayList<String>();
		find();
		
		in.close();
		out.close();
		
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
		
		System.exit(0);
		
	}

	private static void find() {
		
		b1(new boolean[N], 0);
		
		if (ans.size() == 0) {
			
			out.println("IMPOSSIBLE");
			return;
			
		}
		
		Collections.sort(ans);
		for (String s: ans)
			out.println(s);
		
	}

	private static void b1(boolean[] state, int count) {
		
		b2(state, count);
		
		for (int i = 0; i < N; i++)
			if (state[i] == true)
				state[i] = false;
			else
				state[i] = true;
		
		b2(state, count+1);
		
		for (int i = 0; i < N; i++)
			if (state[i] == true)
				state[i] = false;
			else
				state[i] = true;
		
	}

	private static void b2(boolean[] state, int count) {
		
		b3(state, count);
		
		for (int i = 0; i < N; i += 2)
			if (state[i] == true)
				state[i] = false;
			else
				state[i] = true;
		
		b3(state, count+1);
		
		for (int i = 0; i < N; i += 2)
			if (state[i] == true)
				state[i] = false;
			else
				state[i] = true;
		
	}

	private static void b3(boolean[] state, int count) {

		b4(state, count);
		
		for (int i = 1; i < N; i += 2)
			if (state[i] == true)
				state[i] = false;
			else
				state[i] = true;
		
		b4(state, count+1);
		
		for (int i = 1; i < N; i += 2)
			if (state[i] == true)
				state[i] = false;
			else
				state[i] = true;
		
	}

	private static void b4(boolean[] state, int count) {

		criteria(state, count);
		
		for (int i = 0; i < N; i += 3)
			if (state[i] == true)
				state[i] = false;
			else
				state[i] = true;
		
		criteria(state, count+1);
		
		for (int i = 0; i < N; i += 3)
			if (state[i] == true)
				state[i] = false;
			else
				state[i] = true;
		
	}

	private static void criteria(boolean[] state, int count) {
		
		if (count > C || (C - count) % 2 != 0)
			return;
		
		for (int x: on)
			if (state[x] != false)
				return;
		
		for (int x: off)
			if (state[x] != true)
				return;
		
		String s = "";
		
		for (int i = 0; i < N; i++)
			if (!state[i])
				s += 1;
			else
				s += 0;
		
		ans.add(s);
		
	}

}
