import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Rajat Khanna
 * 9/28/2013
 */
public class hello {

	public static BufferedReader in;
	public static int N;

	public static void main(String[] args) throws Exception {

		in = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(in.readLine());

		for (int i = 0; i < N; i++)
			System.out.println("hello");

		in.close();

		System.exit(0);

	}

}
