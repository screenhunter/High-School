/*
PROG: digits
LANG: JAVA
*/



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class digits {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new FileReader("digits.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("digits.out")));
		
		String base2 = in.readLine();
		String base3 = in.readLine();
		
		for (int i = 0; i < base2.length(); i++) {
			
			int x = con(base2.substring(0, i) + "0" + base2.substring(i + 1), 2);
			int y = con(base2.substring(0, i) + "1" + base2.substring(i + 1), 2);
			
			for (int j = 0; j < base3.length(); j++) {
				
				int a = con(base3.substring(0, j) + "0" + base3.substring(j + 1), 3);
				if (x == a || y == a) {
						
					out.println(a);
						
					in.close();
					out.close();
					System.exit(0);
						
				}
					
				int b = con(base3.substring(0, j) + "1" + base3.substring(j + 1), 3);
				if (x == b || y == b) {
					
					out.println(b);
						
					in.close();
					out.close();
					System.exit(0);
						
				}
				
				int c = con(base3.substring(0, j) + "2" + base3.substring(j + 1), 3);
				if (x == c || y == c) {
					
					out.println(c);
						
					in.close();
					out.close();
					System.exit(0);
						
				}
				
			}
			
		}
		
		in.close();
		out.close();
		System.exit(0);
		
	}
	
	private static int con(String s, int x) {
		
		int num = 0;
		
		for (int i = s.length() - 1; i >= 0; i--)
			num += Math.pow(x, s.length() - 1 - i) * Integer.parseInt(s.charAt(i) + "");
		
		return num;
		
	}

}
