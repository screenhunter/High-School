/*
 PROB: namenum
 LANG: JAVA
 ID: khanna.1
 */



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class namenum {

	final static int length = 4617;

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader("namenum.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"namenum.out")));

		BufferedReader dict = new BufferedReader(new FileReader("dict.txt"));

		HashMap<Character, Character> code = new HashMap<Character, Character>();
		code.put('A', '2');
		code.put('B', '2');
		code.put('C', '2');
		code.put('D', '3');
		code.put('E', '3');
		code.put('F', '3');
		code.put('G', '4');
		code.put('H', '4');
		code.put('I', '4');
		code.put('J', '5');
		code.put('K', '5');
		code.put('L', '5');
		code.put('M', '6');
		code.put('N', '6');
		code.put('O', '6');
		code.put('P', '7');
		code.put('R', '7');
		code.put('S', '7');
		code.put('T', '8');
		code.put('U', '8');
		code.put('V', '8');
		code.put('W', '9');
		code.put('X', '9');
		code.put('Y', '9');

		String num = in.readLine();
		boolean flag = false;

		for (int i = 0; i < length; i++) {
			
			String temp = dict.readLine();
			if (convert(temp, code).equals(num)) {
				
				out.println(temp);
				flag = true;
				
			}
			
		}
		
		if (!flag)
			out.println("NONE");

		in.close();
		out.close();
		dict.close();
		System.exit(0);

	}

	private static String convert(String s, HashMap<Character, Character> code) {

		String num = "";

		for (char c : s.toCharArray())
			num += code.get(c);

		return num;

	}

}
