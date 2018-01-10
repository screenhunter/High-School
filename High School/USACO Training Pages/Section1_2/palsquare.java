/*
PROG: palsquare
LANG: JAVA
*/



import java.io.*;

public class palsquare {
	
	private static int B;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new FileReader("palsquare.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("palsquare.out")));
		
		B = Integer.parseInt(in.readLine());
		
		for (int i = 1; i <= 300; i++) {
			
			boolean flag = true;
			String num = Integer.toString((int) Math.pow(i, 2), B);
			for (int j = 0; j < num.length(); j++)
				if (num.charAt(j) != num.charAt(num.length() - j - 1))
					flag = false;
			
			if (flag)
				out.println(Integer.toString(i, B).toUpperCase() + " " + Integer.toString((int) Math.pow(i, 2), B).toUpperCase());
			
		}
		
		in.close();
		out.close();
		System.exit(0);

	}

}
