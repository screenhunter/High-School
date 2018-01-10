/*
PROG: barn1
LANG: JAVA
*/



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class barn1 {
	
	private static int M;
	private static int C;
	private static int[] gaps;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new FileReader("barn1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("barn1.out")));
		
		String[] line = in.readLine().split(" ");
		M = Integer.parseInt(line[0]);
		C = Integer.parseInt(line[2]);
		gaps = new int[C-1];
		
		int[] nums = new int[C];
		for (int i = 0; i < C; i++)
			nums[i] = Integer.parseInt(in.readLine());
		
		Arrays.sort(nums);
		
		int prev = 0;
		for (int i = 0; i < C; i++) {
			
			int temp = nums[i];
			if (prev != 0)
				gaps[i-1] = temp - prev - 1;
			prev = temp;
			
		}
		
		Arrays.sort(gaps);
		int boards = C;
		int covered = C;
		int pos = 0;
		
		while (boards > M) {
			
			covered += gaps[pos];
			boards--;
			pos++;
			
		}
		
		out.println(covered);
		
		in.close();
		out.close();
		System.exit(0);

	}

}
