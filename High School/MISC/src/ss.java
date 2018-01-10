
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Rajat Khanna
 * Thomas Jefferson High School for Science and Technology
 * Junior Division
 * Contest #(Number) (Years)
 * (Program Name)
 */

public class ss {

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String s = in.readLine();
		int l = s.length();
		
		for (int counter = 1; counter <= 5; counter++) {

			System.out.println("Please enter the input seperated by commas and/or spaces:");
			
			String[] line = in.readLine().split(", ");
			int x = Integer.parseInt(line[0]);
			int n = Integer.parseInt(line[1]);
			
			if (x < 0)
				x = x + l;
			if (n > 0)
				System.out.println(s.substring(x,x+n));
			else if (n < 0)
				System.out.println(s.substring(x,l+n));
			else
				System.out.println(s.substring(x));
			

		}

		in.close();

	}

}
