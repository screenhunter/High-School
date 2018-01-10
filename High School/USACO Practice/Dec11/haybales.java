/*
PROG: haybales
LANG: JAVA
*/



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class haybales {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new FileReader("haybales.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("haybales.out")));
		
		int N = Integer.parseInt(in.readLine());
		
		int[] nums = new int[N];
		
		int average = 0;
		
		for (int i = 0; i < N; i++) {
			
			nums[i] = Integer.parseInt(in.readLine());
			average += nums[i];
			
		}
		
		average = average/N;
		
		int count = 0;
		
		for (int i = 0; i < N; i++)
			if (nums[i] > average)
				count += nums[i] - average;
		
		out.println(count);
		
		in.close();
		out.close();
		System.exit(0);
		
	}

}
