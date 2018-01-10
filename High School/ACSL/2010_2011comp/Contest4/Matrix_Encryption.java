package Contest4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Matrix_Encryption {

	private static int[] code;
	private static int[] message;
	
	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		for (int counter = 1; counter <= 5; counter++) {

			System.out.println("Please enter the input seperated by commas and/or spaces:");
			
			StringTokenizer st = new StringTokenizer(in.readLine(), ",");
			String line = st.nextToken().toUpperCase();
			
			code = new int[4];
			for (int i = 0; i < 4; i++)
				code[i] = Integer.parseInt(st.nextToken().trim());
			
			if (line.length() % 2 == 0)
				message = new int[line.length()];
			else {
				
				message = new int[line.length() + 1];
				message[line.length()] = 27;
				
			}
			
			crypt(line);
			
			int[] temp = calculate();
			
			System.out.println(counter + ". " + decrypt(temp));
			
		}

	}

	private static String decrypt(int[] nums) {

		String ans = "";
		
		for (int x: nums) {
			
			x = x % 27;
			
			if (x == 27)
				ans += " ";
			else {
				
				char c = (char) ('A' - 1 + x);
				ans += c;
				
			}
			
		}
		
		return ans;
		
	}

	private static int[] calculate() {

		int[] ans = new int[message.length];
		
		for (int i = 0; i < message.length; i++) {
			
			ans[i] = code[0] * message[i] + code[1] * message[i + 1];
			i++;
			ans[i] = code[2] * message[i - 1] + code[3] * message[i];
			
		}
		
		return ans;
		
	}

	private static void crypt(String line) {
		
		for (int i = 0; i < line.length(); i++)
			if (line.charAt(i) == ' ')
				message[i] = 27;
			else
				message[i] = line.charAt(i) - 'A' + 1;
		
	}

}
