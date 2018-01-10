package String1;

import java.io.IOException;

public class String1_hellloName {
	
	public static String helloName(String name) {
		
		return ("Hello " + name + "!");
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String name = "Riyanshika";
		
		System.out.println(helloName(name)); 

	}

}
