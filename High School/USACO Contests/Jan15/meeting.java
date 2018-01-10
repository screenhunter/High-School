/*
rkhanna 
Rajat Khanna
XX/XX/2014
prog: meeting
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.PriorityQueue;

public class meeting {
	
	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, M;
	public static HashMap<Integer, Integer> paths;
	
	public static void main(String[] args) throws Exception {
		
		long sT = System.nanoTime();
		
		in = new BufferedReader(new FileReader("meeting.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("meeting.out")));
		
		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
		//B = new HashMap<Integer, Integer>();
		//E = new HashMap<Integer, Integer>();
		
		int X, Y;
		for (int i = 0; i < N; i++) {
			
			line = in.readLine().split(" ");
			X = Integer.parseInt(line[0]);
			Y = Integer.parseInt(line[1]);
			
		}
		
		iterate();
		
		System.out.println("Took " + (System.nanoTime() - sT) + " ns");
		
		in.close();
		out.close();
		System.exit(0);
		
	}

	private static void iterate() {
		
		//PriorityQueue<Path>
		
		
	}

}

class Path implements Comparable<Path> {
	
	public int A, B, C;
	
	public Path(int a, int b, int c) {
		
		A = a;
		B = b;
		C = c;
		
	}

	@Override
	public int compareTo(Path o) {
		
		return C - o.C;
		
	}
	
	
}
