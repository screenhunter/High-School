package Contest3;

/*
 * Rajat Khanna
 * Thomas Jefferson High School for Science and Technology
 * Junior Division
 * Contest #3 2003-2004
 * ACSLMAN
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ACSLMAN {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for (int lame = 0; lame < 5; lame++) {
			
			System.out.println("Please enter the input:");
			
			String[] line = in.readLine().split(",");
			for (int i = 0; i < line.length; i++)
				line[i] = line[i].trim();
		
			int count = 0;
		
			for (int i = 2; i < line.length; i++)
				if (line[0].contains(line[i]) == false)
					count++;
		
			print(count);
		
		}
			
	}
	
	private static void print (int x) {
		
		if (x == 0) {
			
			System.out.println("NONE");
			return;
			
		}
		
		if (x > 0)
			System.out.println("  O");
		else
			System.out.println();
		
		boolean flag = false;
		
		if (x > 1)
			System.out.print("+");
		else {
			
			System.out.println();
			flag = true;
			
		}
		
		if (x > 2)
			System.out.print("=");
		else if (!flag) {
			
			System.out.println();
			flag = true;
			
		}
		
		if (x > 3)
			System.out.print("[]");
		else if (!flag) {
			
			System.out.println();
			flag = true;
			
		}
		
		if (x > 4)
			System.out.print("=");
		else if (!flag) {
			
			System.out.println();
			flag = true;
			
		}
		
		if (x > 5)
			System.out.println("+");
		else if (!flag) {
			
			System.out.println();
			flag = true;
			
		}
		
		if (x > 6)
			System.out.println("  []");
		else
			System.out.println();
		
		flag = false;
		
		if (x > 7)
			System.out.print("  /");
		else if (!flag) {
			
			System.out.println();
			flag = true;
			
		}
		
		if (x > 8)
			System.out.println("\\");
		else if (!flag) {
			
			System.out.println();
			flag = true;
			
		}
		
	}

}
