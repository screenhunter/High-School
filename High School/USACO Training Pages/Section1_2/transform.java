/*
PROB: transform
LANG: JAVA
ID: khanna.1
 */



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class transform {

	private static char[][] original, result;
	private static int N;

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader("transform.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"transform.out")));

		N = Integer.parseInt(in.readLine());

		original = new char[N][N];
		result = new char[N][N];

		for (int i = 0; i < N; i++)
			original[i] = in.readLine().toCharArray();

		for (int i = 0; i < N; i++)
			result[i] = in.readLine().toCharArray();
		
		int x = -1;

		char[][] compare = rotate(original);
		if (equals(compare, result) && x == -1)
			x = 1;

		compare = rotate(compare);
		if (equals(compare, result) && x == -1)
			x = 2;

		compare = rotate(compare);
		if (equals(compare, result) && x == -1)
			x = 3;

		compare = flip(original);
		if (equals(compare, result) && x == -1)
			x = 4;

		for (int i = 0; i < 3; i++) {

			compare = rotate(compare);
			if (equals(compare, result) && x == -1)
				x = 5;
		}
		
		if (equals(original, result) && x == -1)
			x = 6;
		
		if (x == -1)
			x = 7;

		out.println(x);

		in.close();
		out.close();
		System.exit(0);

	}

	private static boolean equals(char[][] a, char[][] b) {

		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				if (a[i][j] != b[i][j])
					return false;

		return true;

	}

	private static char[][] rotate(char[][] original) {

		char[][] temp = new char[N][N];

		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				temp[N - j - 1][i] = original[i][j];

		return temp;

	}

	private static char[][] flip(char[][] original) {

		char[][] temp = new char[N][N];

		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				temp[i][N - 1 - j] = original[i][j];

		return temp;

	}

}