package Contest2;

import java.util.Scanner;

public class Bits {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		for (int waste = 0; waste < 5; waste++){
			
			System.out.println("Please Enter the String Expression");
			recur(in.nextLine());
			
		}
		
		in.close();
		
	}
	
	public static void recur(String line) {
		
		if (line.contains("*") == false) {
			
			System.out.println(line);
			return;
			
		}
		
		recur(line.substring(0, line.indexOf("*")) + "0" + line.substring(line.indexOf("*") + 1));
		recur(line.substring(0, line.indexOf("*")) + "1" + line.substring(line.indexOf("*") + 1));
		//recur(line.replaceFirst("*", "0"));
		//recur(temp.replaceFirst("*", "1"));
		
	}

}
