/*
rkhanna
Rajat Khanna
03/08/2014
PROG: irrigation
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class irrigation {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, C, sum;
	public static HashMap<Integer, Set<Integer>> forest;
	public static TreeSet<Edge> edges;
	public static int[][] coor;
	public static boolean[] check;
	
	public static void main(String[] args) throws Exception {
		
		//long startTime = System.nanoTime();
		
		in = new BufferedReader(new FileReader("irrigation.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("irrigation.out")));
		
		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		C = Integer.parseInt(line[1]);
		coor = new int[N][2];
		edges = new TreeSet<Edge>();
		forest = new HashMap<Integer, Set<Integer>>();
		check = new boolean[N];
		
		double temp;
		Set<Integer> s;
		for (int i = 0; i < N; i++) {
			
			line = in.readLine().split(" ");
			coor[i][0] = Integer.parseInt(line[0]);
			coor[i][1] = Integer.parseInt(line[1]);
			
			for (int j = 0; j < i; j++) {
				
				temp = Math.pow(coor[i][0] - coor[j][0], 2) + Math.pow(coor[i][1] - coor[j][1], 2);
				
				if (temp >= C) {
					
					edges.add(new Edge(i, j, (int)temp));
					check[i] = true;
					check[j] = true;
					
				}
				
			}
			
			s = new HashSet<Integer>();
			s.add(i);
			forest.put(i, s);
			
		}
		
		for (int i = 0; i < N; i++)
			if (!check[i])
				exit();
		
		sum = 0;
		Set<Integer> a, b;
		for (Edge e: edges) {
			
			a = forest.get(e.v1);
			b = forest.get(e.v2);
			
			if (a.equals(b))
				continue;
			
			sum += e.cost;
			a.addAll(b);
			for (int x: a)
				forest.put(x, a);
			
			if (a.size() == N)
				break;
			
		}
		
		out.println(sum);
		
		in.close();
		out.close();
		
		//long endTime = System.nanoTime();
		//System.out.println("Took " + (endTime - startTime) + " ns");
		
		System.exit(0);
		
	}

	private static void exit() throws Exception {

		out.println(-1);
		
		in.close();
		out.close();
		System.exit(0);
		
	}
	
	public static class Edge implements Comparable<Edge> {
		
		public int v1, v2, cost;
		
		public Edge(int a, int b, int c) {
			
			v1 = a;
			v2 = b;
			cost = c;
			
		}
		
		public int compareTo(Edge o) {
			
			if (cost == o.cost)
				if (v1 == o.v1)
					return v2 - o.v2;
				else
					return v1 - o.v1;
			
			return cost - o.cost;
			
		}
		
	}

}