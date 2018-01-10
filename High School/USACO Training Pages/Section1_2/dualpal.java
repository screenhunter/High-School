/*
PROG: dualpal
LANG: JAVA
*/



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class dualpal {
	
	private static int N;
	private static int S;
	
	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new FileReader("dualpal.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("dualpal.out")));
		
		String[] line = in.readLine().split(" ");
		
		N = Integer.parseInt(line[0]);
		S = Integer.parseInt(line[1]);
		
		int count = 0;
		int pos = S + 1;
		
		while (count != N) {
			
			int temp = 0;
			for (int i = 2; i < 11; i++)
				if (isPal(Integer.toString(pos, i)))
					temp++;
			
			if (temp >= 2) {
				
				count++;
				out.println(pos);
				
			}
			
			pos++;
			
		}
		
		in.close();
		out.close();
		System.exit(0);

	}
	private static boolean isPal(String num) {
		
		boolean flag = true;
		for (int j = 0; j < num.length(); j++)
			if (num.charAt(j) != num.charAt(num.length() - j - 1))
				flag = false;
		
		return flag;
		
	}

}
