

/*
ID: khanna.1
LANG: JAVA
TASK: beads
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class beads {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new FileReader("beads.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
		
		int N = Integer.parseInt(in.readLine());
		String line = in.readLine();
		
		String check = line + line + line;
		
		int length = 0;
		
		for (int i = N; i < N + N; i++) {
			
			int temp = i;
			int newLength = 0;
			
			char x = check.charAt(temp);
			
			if (x == 'w') {
				
				int num = temp;
				
				while (num < N + N + N - 1 && check.charAt(num) == 'w')
					num++;
				
				x = check.charAt(num);
				
			}
				
			
			while (temp < N + N + N && (check.charAt(temp) == x || check.charAt(temp) == 'w')) {
				
				newLength++;
				temp++;
				
			}
			
			temp = i-1;
			
			x = check.charAt(temp);
			
			if (x == 'w') {
				
				int num = temp;
				
				while (num > 0 && check.charAt(num) == 'w')
					num--;
				
				x = check.charAt(num);
				
			}
			
			while ((check.charAt(temp) == check.charAt(i-1) || check.charAt(temp) == 'w') && temp > 0) {
				
				newLength++;
				temp--;
				
			}
			
			if (newLength > length)
				length = newLength;
			
		}
		
		if (length > N)
			out.println(N);
		else
			out.println(length);
		
		in.close();
		out.close();
		System.exit(0);
		
	}

}
