import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _373A {

	public static BufferedReader in;
	public static int k;
	public static int[] count;

	public static void main(String[] args) throws Exception {

		in = new BufferedReader(new InputStreamReader(System.in));
		k = Integer.parseInt(in.readLine());
		count = new int[10];

		char[] line;
		for (int i = 0; i < 4; i++) {

			line = in.readLine().toCharArray();
			for (char c : line)
				if (c != '.')
					count[Integer.parseInt(c + "")]++;

		}

		boolean flag = true;

		for (int pos : count)
			if (pos > 2 * k)
				flag = false;

		if (flag)
			System.out.println("YES");
		else
			System.out.println("NO");

		in.close();
		System.exit(0);

	}

}
