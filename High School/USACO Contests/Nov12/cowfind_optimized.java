
/*
 PROG: cowfind
 LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class cowfind_optimized {

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new FileReader("cowfind.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"cowfind.out")));

		String line = in.readLine();

		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();

		for (int i = 0; i < line.length() - 1; i++) {

			if (line.charAt(i) == '(' && line.charAt(i + 1) == '(')
				l1.add(i);

			if (line.charAt(i) == ')' && line.charAt(i + 1) == ')')
				l2.add(i);

		}

		int sum = 0;

		for (int i = 0; i < l1.size(); i++)
			for (int j = 0; j < l2.size(); j++)
				if (l1.get(i) < l2.get(j))
					sum++;

		out.println(sum);

		in.close();
		out.close();
		System.exit(0);

	}

}
