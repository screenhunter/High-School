package Contest1;

import java.util.Scanner;

public class Probability {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Please enter the Data");
			
			Scanner readLine = new Scanner(System.in);
			
			String[] line = readLine.nextLine().split(",");
			
			for (int j = 0; j < line.length; j++)
				line[j] = line[j].trim();
			
			if (Integer.parseInt(line[0]) == 1) {
				
				if (line[3].equalsIgnoreCase("r"))
					System.out.println(line[1] + "/" + (Integer.parseInt(line[1]) + Integer.parseInt(line[2])));
				else if (line[3].equalsIgnoreCase("b"))
					System.out.println(line[2] + "/" + (Integer.parseInt(line[1]) + Integer.parseInt(line[2])));
				
			} else {
				
				if (line[3].equalsIgnoreCase("y"))
					Y(line);
				else if (line[3].equalsIgnoreCase("n"))
					N(line);
				
			}
			
			readLine.close();
			
		}
		
	}
	
	private static void N(String[] array) {
		
		int R = Integer.parseInt(array[1]);
		int B = Integer.parseInt(array[2]);
		
		int n = 1;
		int d = 1;
		
		for (int i = 4; i < array.length; i++) {
			
			if (array[i].equalsIgnoreCase("r")) {
				
				n *= R;
				R--;
			
			} else if (array[i].equalsIgnoreCase("b")) {
				
				n *= B;
				B--;
				
			}
			
			d *= (R + B + 1);
		}
			
		
		System.out.println(n + "/" + d);
		
	}

	private static void Y(String[] array) {
		
		int R = Integer.parseInt(array[1]);
		int B = Integer.parseInt(array[2]);
		
		int n = 1;
		int d = 1;
		
		for (int i = 4; i < array.length; i++) {
			
			if (array[i].equalsIgnoreCase("r"))
				n *= R;
			else if (array[i].equalsIgnoreCase("b"))
				n *= B;
			
			d *= (R + B);
		}
			
		
		System.out.println(n + "/" + d);
		
	}

}
