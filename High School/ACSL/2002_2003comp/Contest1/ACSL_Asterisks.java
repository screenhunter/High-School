package Contest1;


import java.util.Scanner;

public class ACSL_Asterisks {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		String line;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Please Enter the Test Case:");
			
			line = read.nextLine();
			String[] array = line.split(",");
			
			for (int j = 0; j < array.length; j++)
				array[j] = array[j].trim();
			
			if (array[0].equalsIgnoreCase("s"))
				for (int j = 0; j < Integer.parseInt(array[1]); j++) {
					
					for (int k = 0; k < Integer.parseInt(array[1]); k++)
						System.out.print("* ");
					
					System.out.println("");
					
				}
			
			else if (array[0].equalsIgnoreCase("h"))
				for (int j = Integer.parseInt(array[1]); j >= 1; j--) {
					
					for (int k = j; k < Integer.parseInt(array[1]); k++)
						System.out.print("  ");
					for (int k = 0; k < j; k++)
						System.out.print("* ");
					
					System.out.println("");
					
				}
			
			else if (array[0].equalsIgnoreCase("l"))		
				for (int j = 1; j <= Integer.parseInt(array[1]); j++) {
					
					for (int k = 0; k < j; k++)
						System.out.print("* ");
					
					System.out.println("");
					
				}
			
			else
				for (int j = 0; j < Integer.parseInt(array[2]); j++) {
					
					for (int k = 0; k < Integer.parseInt(array[1]); k++)
						System.out.print("* ");
					
					System.out.println("");
					
				}
			
			
			read.close();
			
		}

	}

}
