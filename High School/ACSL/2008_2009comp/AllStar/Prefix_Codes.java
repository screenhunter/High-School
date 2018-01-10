package AllStar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Prefix_Codes {

	private static HashMap<String, String> code;
	private static HashMap<String, String> hexa;

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader((System.in)));
		
		hexa = new HashMap<String, String>();
		hexa.put("0", "0000");
		hexa.put("1", "0001");
		hexa.put("2", "0010");
		hexa.put("3", "0011");
		hexa.put("4", "0100");
		hexa.put("5", "0101");
		hexa.put("6", "0110");
		hexa.put("7", "0111");
		hexa.put("8", "1000");
		hexa.put("9", "1001");
		hexa.put("A", "1010");
		hexa.put("B", "1011");
		hexa.put("C", "1100");
		hexa.put("D", "1101");
		hexa.put("E", "1110");
		hexa.put("F", "1111");
		
		code = new HashMap<String, String>();
		code.put("0", "P");
		code.put("10", "Q");
		code.put("110", "R");
		code.put("1110", "S");
		code.put("1111", "T");
		
		for (int counter = 1; counter <= 5; counter++) {
			
			System.out.println("Please enter the the data:");
			System.out.println(counter + ". " + decode(binaryForm(in.readLine())));
			
		}

	}

	private static String binaryForm(String line) {

		String ans = "";

		for (int i = 0; i < line.length(); i++)
			ans += hexa.get(line.substring(i, i + 1));

		return ans;

	}

	private static String decode(String line) {
		
		String ans = "";
		
		while (line.length() != 0) {
			
			String s = "";
			
			while(code.get(s) == null) {
				
				s += line.substring(0, 1);
				line = line.substring(1);
				
			}
			
			ans += code.get(s);
			
		}
		
		return ans;
		
	}
}
