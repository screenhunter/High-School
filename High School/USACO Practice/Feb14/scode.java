import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;

public class scode {

	public static BufferedReader in;
	public static PrintWriter out;
	public static String line;
	public static HashMap<String, Integer> map;

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		in = new BufferedReader(new FileReader("scode.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("scode.out")));

		line = in.readLine();
		map = new HashMap<String, Integer>();
		int x = moo(line);

		x = (x + 2013) % 2014;

		out.println(x);

		in.close();
		out.close();

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		System.exit(0);

	}

	public static int moo(String s) {

		if (map.get(s) != null)
			return map.get(s);

		int ans = 1;
		int l = s.length();

		for (int i = 1; i * 2 < l; i++) {

			if (s.substring(0, i).equals(s.substring(i, 2 * i)))
				ans += moo(s.substring(i));

			if (s.substring(0, i).equals(s.substring(l - i))) {

				ans += moo(s.substring(0, l - i));
				ans += moo(s.substring(i));

			}

			if (s.substring(l - i).equals(s.substring(l - 2 * i, l - i)))
				ans += moo(s.substring(0, l - i));

		}

		ans = ans % 2014;

		map.put(s, ans);

		return ans;

	}

}
