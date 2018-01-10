package Warmup1;

import java.io.IOException;

public class Warmup1_delDel {
	
	public static String delDel(String str) {
		
		if (str.indexOf("del") == 1) {

			str = str.replace("del", "");
			
		}
		
		return str;
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		String str = "absbsbdelbc";
		
		System.out.println(delDel(str)); 

	}

}
