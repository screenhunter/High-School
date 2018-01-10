
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _340A {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] line = in.readLine().split(" ");
		long x = Long.parseLong(line[0]);
		long y = Long.parseLong(line[1]);
		long a = Long.parseLong(line[2]);
		long b = Long.parseLong(line[3]);
		long lcm = x * y / gcd(x, y);
		
		System.out.println(b/lcm - (a + lcm - 1)/lcm + 1);

	}

	public static long gcd(long a, long b) {

		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

}
