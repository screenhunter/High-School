package Dec13;
/*
rkhanna
Rajat Khanna
XX/XX/2014
PROG: name
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

public class msched {

	public static BufferedReader in;
	public static PrintWriter out;
	public static int N, sum;
	public static Cow[] farm;
	
	public static void main(String[] args) throws Exception {
		
		long startTime = System.nanoTime();
		
		in = new BufferedReader(new FileReader("msched.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("msched.out")));
		
		N = Integer.parseInt(in.readLine());
		farm = new Cow[N];
		
		for (int i = 0; i < N; i++)
			farm[i] = new Cow(in.readLine().split(" "));
			
		Comparator<Cow> byTime = new Comparator<Cow>() {

			public int compare(Cow a, Cow b) {
				
				return b.time - a.time;
				
			}
			
		};
		
		Arrays.sort(farm, byTime);
		
		sum = 0;
		int index = 0;
		PriorityQueue<Cow> cur = new PriorityQueue<Cow>();
		for (int i = 10000; i >= 0; i--) {
			
			while (index < N && farm[index].time > i) {
				
				cur.add(farm[index]);
				index++;
				
			}
			
			if (cur.size() > 0)
				sum += cur.poll().milk;
			
		}
		
		out.println(sum);
		
		in.close();
		out.close();
		
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
		
		System.exit(0);
		
	}

}

class Cow implements Comparable<Cow> {
	
	public int time, milk;
	
	public Cow(String[] line) {
		
		time = Integer.parseInt(line[1]);
		milk = Integer.parseInt(line[0]);
		
	}

	public int compareTo(Cow o) {
		
		return o.milk - this.milk;
		
	}
	
	public String toString() {
		
		return time + " " + milk;
		
	}
	
}
