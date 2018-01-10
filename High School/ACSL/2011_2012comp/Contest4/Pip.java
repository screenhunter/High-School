package Contest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Pip {

	private static String symbols = "+-*/";
	private static String h = "*/";
	private static String l = "+-";

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		for (int counter = 1; counter <= 5; counter++) {

			System.out.println("Please enter the input with no spaces:");

			String line = in.readLine().replaceAll(" ", "");

			Stack<Character> sym = new Stack<Character>();
			String ans = "";

			for (int i = line.length() - 1; i > -1; i--) {

				if (!symbols.contains(line.charAt(i) + "")) {

					ans = line.charAt(i) + ans;
					continue;

				}

				while (!sym.isEmpty() && checker(line.charAt(i), sym.peek()))
					ans = sym.pop() + ans;

				sym.add(line.charAt(i));

			}
			
			while (!sym.isEmpty())
				ans = sym.pop() + ans;
			
			System.out.println(counter + ". " + ans);

		}

		in.close();

	}

	private static boolean checker(char ch, char peek) {

		if (h.contains(peek + "") && l.contains(ch + ""))
			return true;

		return false;
	}

}
