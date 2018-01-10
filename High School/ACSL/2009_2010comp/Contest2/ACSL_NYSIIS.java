package Contest2;

import java.util.Scanner;

public class ACSL_NYSIIS {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		for (int lame = 0; lame < 5; lame++) {
			
			System.out.println("Please enter the test case:");
			String name = in.nextLine();
			
			if (name.substring(0, 3).contentEquals("MAC"))
				name = "MC" + name.substring(3);
			else if (name.substring(0, 2).contentEquals("KN"))
				name = "N" + name.substring(2);
			else if (name.substring(0, 1).contentEquals("K"))
				name = "C" + name.substring(1);
			else if (name.substring(0, 2).contentEquals("PH"))
				name = "F" + name.substring(2);
			else if (name.substring(0, 2).contentEquals("PF"))
				name = "F" + name.substring(2);
			else if (name.substring(0, 3).contentEquals("SCH"))
				name = "S" + name.substring(3);
			
			if (name.endsWith("EE"))
				name = name.substring(0, name.length()-2) + "Y";
			else if (name.endsWith("IE"))
				name = name.substring(0, name.length()-2) + "Y";
			else if (name.endsWith("DT") || name.endsWith("RT") || name.endsWith("RD") || name.endsWith("NT") || name.endsWith("ND"))
				name = name.substring(0, name.length()-2) + "D";
			
			char x = name.charAt(0);
			name = name.substring(1);
			
			name = name.replaceAll("E", "A");
			name = name.replaceAll("I", "A");
			name = name.replaceAll("O", "A");
			name = name.replaceAll("U", "A");
			
			if (name.endsWith("S"))
				name = name.substring(0, name.length()-1);
			
			if (name.endsWith("AY"))
				name = name.substring(0, name.length()-2) + "Y";
			
			if (name.endsWith("A"))
				name = name.substring(0, name.length()-1);
			
			for (int i = 0; i < name.length()-1; i++)				
				if (name.charAt(i) == name.charAt(i+1))
					name = name.substring(0, i) + name.substring(i+1);
			
			if (name.length() > 5)
				name = name.substring(0, 5);
			
			System.out.println(x + name);
			
		}
		
		in.close();
		
	}

}
