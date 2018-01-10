/*
prog: lightson
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class lightson {
	
	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, M;
	public static Room[][] barn;
	
	
	public static void main(String[] args) throws Exception {
		
		long sT = System.nanoTime();
		
		in = new BufferedReader(new FileReader("lightson.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("lightson.out")));
		
		String[] line = in.readLine().split(" ");
		
		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
		
		barn = new Room[N][N];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				barn[i][j] = new Room(i, j);
		
		for (int i = 0; i < M; i++)
			add(in.readLine().split(" "));
		
		barn[0][0].ill = true;
		
		recur(barn[0][0]);
		
		int count = 0;
		
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++) {
				System.out.println(barn[i][j].check);
				if (barn[i][j].ill)
					count++;
			}
		
		out.println(count);
		
		System.out.println("Took " + (System.nanoTime() - sT) + " ns");
		
		in.close();
		out.close();
		System.exit(0);
		
	}
	
	private static void recur(Room r) {
		
		if (r.check)
			return;
		
		if (!r.ill)
			return;
		
		r.check = true;
		r.flood = true;
		
		if (r.y > 0)
			if (!barn[r.x][r.y-1].flood)
				recur(barn[r.x][r.y-1]);
		if (r.x > 0)
			if (!barn[r.x-1][r.y].flood)
				recur(barn[r.x-1][r.y]);
		if (r.x < N - 1)
			if (!barn[r.x+1][r.y].flood)
				recur(barn[r.x+1][r.y]);
		if (r.y < N-1)
			if (!barn[r.x][r.y+1].flood)
				recur(barn[r.x][r.y+1]);
		
		for (Room next: r.switches) {
			
			next.ill = true;
			if (nf(next)) {
				recur(next);
			}
		}
		
		
		
	}

	private static boolean nf(Room next) {
		if (next.x > 0)
			if (barn[next.x-1][next.y].flood)
				return true;
		if (next.y > 0)
			if (barn[next.x][next.y-1].flood)
				return true;
		if (next.x < N - 1)
			if (barn[next.x+1][next.y].flood)
				return true;
		if (next.y < N-1)
			if (barn[next.x][next.y+1].flood)
				return true;
		
		return false;
	}

	private static void add(String[] line) {
		
		barn[Integer.parseInt(line[0]) - 1][Integer.parseInt(line[1]) - 1].switches.add(barn[Integer.parseInt(line[2]) - 1][Integer.parseInt(line[3]) - 1]);
		
	}
	
}

class Room {
	
	int x, y;
	ArrayList<Room> switches;
	boolean ill, check, flood;
	
	public Room(int a, int b) {
		
		x = a;
		y = b;
		ill = check = flood = false;
		switches = new ArrayList<Room>();
		
	}
	
	public String toString() {

		String s = "(" + x + " " + y + ") -";
		for (Room elem: switches)
			s += " " + "(" + elem.x + " " + elem.y + ")";
		return s;
		
	}
	
}