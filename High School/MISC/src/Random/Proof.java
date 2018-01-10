package Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Proof {
	
	public static BufferedReader in;
	public static String name;
	
	public static void main(String[] args) throws Exception {
		
		in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please Enter Your Name:");
		name = in.readLine();
		
		if (!name.equals("Kritika")) {
			
			System.out.println("Sorry this game is not for you. Contact the developer for a request!");
			exit();
			
		}
		
		
		
		exit();
		
	}

	private static void exit() throws IOException {
		
		System.out.println("Thanks for playing!");
		System.out.println("- Made By Rajat Khanna -");
		in.close();
		System.exit(0);
		
	}

}
