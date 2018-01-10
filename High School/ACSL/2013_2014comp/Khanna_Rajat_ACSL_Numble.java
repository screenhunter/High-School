import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Rajat Khanna 10th Grade
 * Thomas Jefferson High School for Science and Technology
 * Senior Division
 * Contest#4 2013-2014
 * ACSL Numble
 */

public class Khanna_Rajat_ACSL_Numble {

	public static BufferedReader in;
	public static String a, b, c;
	public static int[] l;
	public static int x, y, N, pos1, pos2, pos3, pos4;
	public static ArrayList<String> first, second, third;
	public static String[] max;
	public static char[][] print;

	public static void main(String[] args) throws Exception {

		in = new BufferedReader(new FileReader("acsl.in"));

		String[] line = in.readLine().split(",");
		a = ord(line[0]);
		b = ord(line[1]);
		c = ord(line[2]);

		for (int iteration = 1; iteration <= 5; iteration++) {
			
			System.out.println("[ Answer " + iteration + "]");
			System.out.println();

			line = in.readLine().split(",");
			l = new int[3];
			for (int i = 0; i < 3; i++)
				l[i] = Integer.parseInt(line[i]);

			x = Integer.parseInt(line[3]);
			y = Integer.parseInt(line[4]);

			first = new ArrayList<String>();
			second = new ArrayList<String>();
			third = new ArrayList<String>();

			build("", l[0], new String(a), first, true, true);
			build("", l[1], new String(b), second, true, false);
			build("", l[2], new String(c), third, false, true);

			max = new String[3];
			max[0] = findMax(first);
			max[1] = findMax(second);
			max[2] = findMax(third);
			
			pos1 = max[1].indexOf(x + "");
			pos2 = max[2].indexOf(y + "");
			pos3 = max[0].indexOf(x + "");
			pos4 = max[0].indexOf(y + "");
			
			if (pos3 == pos4)
				pos4 = max[0].substring(pos4 + 1).indexOf(y + "") + pos4 + 1;
			
			N = Math.max(pos1, pos2) + Math.max(l[1] - pos1, l[2] - pos2);
			print = new char[N][l[0]];
			for (char[] c : print)
				Arrays.fill(c, ' ');

			for (int i = 0; i < l[0]; i++)
				print[Math.max(pos1, pos2)][i] = max[0].charAt(i);

			for (int i = 0; i < l[1]; i++)
				print[Math.max(pos1, pos2) - pos1 + i][pos3] = max[1].charAt(i);

			for (int i = 0; i < l[2]; i++)
				print[Math.max(pos1, pos2) - pos2 + i][pos4] = max[2].charAt(i);

			for (int i = 0; i < N; i++) {

				String temp = "";

				for (int j = 0; j < l[0]; j++)
					temp += print[i][j] + " ";

				System.out.println(temp);

			}

			System.out.println();
			System.out.println();
			System.out.println();

		}

		in.close();
		System.exit(0);

	}

	private static String findMax(ArrayList<String> list) {

		String ans = "";
		int max = Integer.MIN_VALUE;

		int sum;
		for (String s : list) {

			sum = 0;
			for (char c : s.toCharArray())
				sum += Integer.parseInt(c + "");

			if (sum > max) {

				ans = s;
				max = sum;

			}

		}

		return ans;

	}

	public static void build(String cur, int rem, String s,
			ArrayList<String> list, boolean f1, boolean f2) {

		if (rem == 0) {

			if (f1)
				if (!cur.contains(x + ""))
					return;

			if (f2)
				if (!cur.contains(y + ""))
					return;

			int sum = 0;
			int count = 0;
			for (char c : cur.toCharArray()) {

				sum += Integer.parseInt(c + "");
				if (c == '0')
					count++;

			}

			if (sum % 5 != 0 || count > 2)
				return;

			if (count == 2)
				cur = '0' + cur.substring(0, cur.length() - 1);

			list.add(cur);
			return;

		}

		if (rem > s.length())
			return;

		build(cur, rem, s.substring(1), list, f1, f2);
		build(cur + s.substring(0, 1), rem - 1, s.substring(1), list, f1, f2);

	}

	public static String ord(String s) {

		char[] c = s.toCharArray();
		Arrays.sort(c);

		char x;
		for (int i = 0; i < c.length / 2; i++) {

			x = c[i];
			c[i] = c[c.length - 1 - i];
			c[c.length - 1 - i] = x;

		}

		return new String(c);

	}

}
