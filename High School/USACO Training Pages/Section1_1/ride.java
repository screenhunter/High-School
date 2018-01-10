

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class ride {
	public static void main (String[] args) throws IOException {

		BufferedReader f = new BufferedReader(new FileReader("ride.in"));
		// input file name goes above
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));

		String l1 = f.readLine();
		String l2 = f.readLine();
		
		int firstL = l1.length();
		int secondl = l2.length();
		
		int comet = 1;
		int group = 1;
		
		for (int i = 0; i < firstL; i++) {
			
			int c = getAlphbetNumber(l1.charAt(i));
			comet = comet * c;
			
		}
		
		for (int i = 0; i < secondl; i++) {
			
			int d = getAlphbetNumber(l2.charAt(i));
			group = group * d;
		}
		
		int cometmod = comet-47*(comet/47);
		
		int groupmod = group-47*(group/47);
		
		if (cometmod == groupmod) {
			
			out.println("GO");
			
		} else {
			
			out.println("STAY");
			
		}
		
		f.close();
		out.flush();
		out.close(); // close the output file
		System.exit(0); // don't omit this!
	}
		
private static int getAlphbetNumber(int c) {
			
			c = c-'A'+1;
			
			return c;
			
		}

}