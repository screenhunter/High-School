package Contest2;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Data_Compression {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int uselesscount = 0; uselesscount < 5; uselesscount++) {
			
			System.out.println("Please enter the input:");
			System.out.println(counter(in.readLine().toCharArray()));
			
		}
		
		in.close();
		
	}

	private static String counter(char[] c) {
		
		String line = "";
		int count = 0;
		int pos = 0;
		char prev = ' ';
		
		for (int i = 0; i <= c.length; i++) {
			
			if (i == 0) {
				
				line += c[i];
				prev = c[i];
				count++;
				pos = 0;
				
			}else if (i == c.length)
				line = line.substring(0, pos) + count + line.substring(pos);
			else if (c[i] == prev)
				count++;
			else if (c[i] != prev) {
				
				line = line.substring(0, pos) + count + line.substring(pos) + c[i];
				prev = c[i];
				count = 1;
				pos = line.length() - 1;
				
			}
			
		}
		
		return line;
		
	}

}
