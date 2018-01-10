/*
PROG: milk2
LANG: JAVA
 */



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class milk2 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new FileReader("milk2.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk2.out")));
		
		int N = Integer.parseInt(in.readLine());
		
		int[] timings = new int[1000001];
		int start = 1000000;
		int end = 0;
		for (int i = 0; i < N; i++) {
			
			 String[] line = in.readLine().split(" ");
			 
			 int x = Integer.parseInt(line[0]);
			 int y = Integer.parseInt(line[1]);
			 
			 start = Math.min(start, x);
			 end = Math.max(end, y);
			 
			 for (int j = x; j < y; j++)
				 timings[j]++;
			 
		}
		
		int mTime = 0;
		int iTime = 0;
		
		int temp1 = 0;
		int temp2 = 0;
		
		for (int i = start; i < end; i++) {
			
			if (timings[i] > 0) {
				
				temp1++;
				temp2 = 0;
				
			}
			else {
				
				temp1 = 0;
				temp2++;
				
			}
			
			mTime = Math.max(mTime, temp1);
			iTime = Math.max(iTime, temp2);
			
		}
		
		out.println(mTime + " " + iTime);
		
		in.close();
		out.close();
		System.exit(0);
		
	}

}
