import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _322B {

	public static int r, g, b, max;

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] line = in.readLine().split(" ");
		r = Integer.parseInt(line[0]);
		g = Integer.parseInt(line[1]);
		b = Integer.parseInt(line[2]);
		max = 0;
		trial(0);
		if (r > 0 && g > 0 && b > 0)
			trial(1);
		if (r > 1 && g > 1 && b > 1)
			trial(2);
		System.out.println(max);
		in.close();

	}

	private static void trial(int num) {

		int sum = num;
		int x = r - num;
		int y = g - num;
		int z = b - num;

		sum += x / 3 + y / 3 + z / 3;

		if (sum > max)
			max = sum;

	}

}
