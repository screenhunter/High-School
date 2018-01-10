package Contest4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACSL_Flock {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		for (int counter = 1; counter <= 5; counter++) {

			System.out.println("Please enter the input seperated by commas and/or spaces:");

			StringTokenizer st = new StringTokenizer(in.readLine(), ", ");

			int n = Integer.parseInt(st.nextToken());
			int[] birds = new int[10];
			for (int i = 0; i < n; i++)
				birds[Integer.parseInt(st.nextToken()) - 1] = 1;
			
			int stage = Integer.parseInt(st.nextToken());

			for (int i = 1; i < stage; i++)
				flock(birds);

			print(birds, n);

		}

		in.close();

	}

	private static void print(int[] birds, int n) {

		String s = "";

		for (int i = 0; i < 10; i++)
			if (birds[i] == 1) {

				if (s.length() > 0)
					s += ", ";

				s += i + 1;

			}

		System.out.println(s);
		
	}

	private static void flock(int[] birds) {
		
		int x = 0;
		
		if (birds[0] == 0 && birds[9] == 1) {

			birds[0] = 1;
			birds[9] = 0;
			x++;

		}

		for (int i = x; i < 9; i++) {

			if (birds[i] == 1 && birds[i + 1] == 0) {

				birds[i] = 0;
				birds[i + 1] = 1;
				i++;

			}

		}

	}

}
