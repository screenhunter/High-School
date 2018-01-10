/*
ID: khanna.1
LANG: JAVA
TASK: friday
 */



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class friday {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new FileReader("friday.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
		
		int N = Integer.parseInt(in.readLine());
		int[] count = new int[7];
		int[] days = {3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};
		
		int day1 = 2;
		
		for (int i = 1900; i <= 1900 + N - 1; i++) {
			
			for (int j = 0; j < 12; j++) {
			
				int day13 = day1 + 5;
				
				while (day13 >= 7)
					day13 -= 7;
			
				for (int x = 0; x < 7; x++)
					if (day13 == x) {
						
						count[x]++;
						break;
					
					}
			
				if (j == 1 && i % 4 == 0)
					if (i % 100 != 0 || i % 400 == 0)
						day1 += 1;
			
				day1 += days[j];
				
			}
			
		}
		
		for (int i = 0; i < 7; i++) {
			
			out.print(count[i]);
			 if (i < 6)
				 out.print(" ");
			 
		}
		
		out.println();
		
		in.close();
		out.close();
		System.exit(0);
		
	}

}
