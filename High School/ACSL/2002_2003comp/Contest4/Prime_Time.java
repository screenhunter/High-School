package Contest4;

/*
 * Rajat Khanna
 * Thomas Jefferson High School for Science and Technology
 * Junior Division
 * Contest #4 2002-2003
 * PRIME_TIME
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Prime_Time {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		for (int counter = 0; counter < 5; counter++) {

			System.out.println("Please enter the input:");

			String line = in.readLine();

			ArrayList<String> list = new ArrayList<String>();

			circular(line, list);
			deleted(line, list);
			
			if (list.size() > 0)
				System.out.println(list.toString().substring(1,
						list.toString().length() - 1));
			else
				System.out.println("NONE");

		}

		in.close();

	}

	private static void deleted(String line, ArrayList<String> list) {

		for (int i = 0; i < line.length(); i++) {

			String temp = line.substring(0, i) + line.substring(i + 1);

			if (isPrime(temp))
				if (i == 0)
					list.add("Left");
				else if (i == line.length() - 1)
					list.add("Right");
				else if (!list.contains("Interior"))
					list.add("Interior");

		}
		
		if (list.size() == 2 && list.contains("Right") & list.contains("Interior"))
			list.add(list.remove(0));

	}

	private static void circular(String line, ArrayList<String> list) {

		for (int i = 0; i < line.length(); i++) {

			line = line.substring(1) + line.charAt(0);
			if (!isPrime(line))
				return;

		}

		list.add("Circular");

	}

	private static boolean isPrime(String line) {

		int x = Integer.parseInt(line);
		
		if (x < 2)
			return false;

		for (double i = 2; i <= Math.sqrt(x); i++)
			if (x / i == (int) (x / i))
				return false;

		return true;

	}

}
