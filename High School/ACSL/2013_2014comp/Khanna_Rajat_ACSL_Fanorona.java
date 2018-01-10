import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.TreeSet;

/*
 * Rajat Khanna 10th Grade
 * Thomas Jefferson High School for Science and Technology
 * Senior Division
 * Contest#3 2013-2014
 * ACSL Fanorona
 */

public class Khanna_Rajat_ACSL_Fanorona {

	public static BufferedReader in;
	public static char[][] board;
	public static int B, W;
	public static int[] B_locs, W_locs;
	public static TreeSet<Integer> attacks;

	public static void main(String[] args) throws Exception {

		in = new BufferedReader(new FileReader("acsl.in"));
		String[] line;

		for (int iteration = 1; iteration <= 5; iteration++) {

			line = in.readLine().replaceAll(" ", "").split(",");
			board = new char[5][5];
			W = Integer.parseInt(line[0]);
			B = Integer.parseInt(line[W + 1]);
			W_locs = new int[W];
			B_locs = new int[B];
			attacks = new TreeSet<Integer>();

			for (int i = 0; i < 5; i++)
				Arrays.fill(board[i], 'X');

			for (int i = 0; i < W; i++)
				W_locs[i] = Integer.parseInt(line[i + 1]);

			for (int i = 0; i < B; i++)
				B_locs[i] = Integer.parseInt(line[W + 2 + i]);

			for (int x : W_locs)
				board[(x - 1) / 5][(x - 1) % 5] = 'W';

			for (int x : B_locs)
				board[(x - 1) / 5][(x - 1) % 5] = 'B';

			for (int x : W_locs)
				if (((x - 1) / 5 + (x - 1) % 5) % 2 == 0)
					test1(x);
				else
					test2(x);

			if (attacks.size() > 0)
				System.out.println(attacks.toString().substring(1,
						attacks.toString().length() - 1));
			else
				System.out.println("NONE");

		}

	}

	private static void test1(int index) {

		int increment = 0;
		int x = (index - 1) / 5;
		int y = (index - 1) % 5;

		// right
		if (y < 4 && board[x][y + 1] == 'X')
			while (y + 2 + increment < 5 && board[x][y + 2 + increment] == 'B') {

				attacks.add(x * 5 + (y + 2 + increment) + 1);
				increment++;

			}
		else if (y < 4 && board[x][y + 1] == 'B' && y > 0
				&& board[x][y - 1] == 'X')
			while (y + 1 + increment < 5 && board[x][y + 1 + increment] == 'B') {

				attacks.add(x * 5 + (y + 1 + increment) + 1);
				increment++;

			}

		// up-right
		increment = 0;
		if (y < 4 && x > 0 && board[x - 1][y + 1] == 'X')
			while (y + 2 + increment < 5 && x - 2 - increment >= 0
					&& board[x - 2 - increment][y + 2 + increment] == 'B') {

				attacks.add((x - 2 - increment) * 5 + (y + 2 + increment) + 1);
				increment++;

			}
		else if (y < 4 && x > 0 && board[x - 1][y + 1] == 'B' && x < 4 && y > 0
				&& board[x + 1][y - 1] == 'X')
			while (y + 1 + increment < 5 && x - 1 - increment >= 0
					&& board[x - 1 - increment][y + 1 + increment] == 'B') {

				attacks.add((x - 1 - increment) * 5 + (y + 1 + increment) + 1);
				increment++;

			}

		// up
		increment = 0;
		if (x > 0 && board[x - 1][y] == 'X')
			while (x - 2 - increment >= 0 && board[x - 2 - increment][y] == 'B') {

				attacks.add((x - 2 - increment) * 5 + y + 1);
				increment++;

			}
		else if (x > 0 && board[x - 1][y] == 'B' && x < 4
				&& board[x + 1][y] == 'X')
			while (x - 1 - increment >= 0 && board[x - 1 - increment][y] == 'B') {

				attacks.add((x - 1 - increment) * 5 + y + 1);
				increment++;

			}

		// up-left
		increment = 0;
		if (x > 0 && y > 0 && board[x - 1][y - 1] == 'X')
			while (x - 2 - increment >= 0 && y - 2 - increment >= 0
					&& board[x - 2 - increment][y - 2 - increment] == 'B') {

				attacks.add((x - 2 - increment) * 5 + (y - 2 - increment) + 1);
				increment++;

			}
		else if (x > 0 && y > 0 && board[x - 1][y - 1] == 'B' && x < 4 && y < 4
				&& board[x + 1][y + 1] == 'X')
			while (x - 1 - increment >= 0 && y - 1 - increment >= 0
					&& board[x - 1 - increment][y - 1 - increment] == 'B') {

				attacks.add((x - 1 - increment) * 5 + (y - 1 - increment) + 1);
				increment++;

			}

		// left
		increment = 0;
		if (y > 0 && board[x][y - 1] == 'X')
			while (y - 2 - increment >= 0 && board[x][y - 2 - increment] == 'B') {

				attacks.add(x * 5 + (y - 2 - increment) + 1);
				increment++;

			}
		else if (y > 0 && board[x][y - 1] == 'B' && y < 4
				&& board[x][y + 1] == 'X')
			while (y - 1 - increment >= 0 && board[x][y - 1 - increment] == 'B') {

				attacks.add(x * 5 + (y - 1 - increment) + 1);
				increment++;

			}

		// down-left
		increment = 0;
		if (y > 0 && x < 4 && board[x + 1][y - 1] == 'X')
			while (y - 2 - increment >= 0 && x + 2 + increment < 5
					&& board[x + 2 + increment][y - 2 - increment] == 'B') {

				attacks.add((x + 2 + increment) * 5 + (y - 2 - increment) + 1);
				increment++;

			}
		else if (y > 0 && x < 4 && board[x + 1][y - 1] == 'B' && y < 4 && x > 0
				&& board[x - 1][y + 1] == 'X')
			while (y - 1 - increment >= 0 && x + 1 + increment < 5
					&& board[x + 1 + increment][y - 1 - increment] == 'B') {

				attacks.add((x + 1 + increment) * 5 + (y - 1 - increment) + 1);
				increment++;

			}

		// down
		increment = 0;
		if (x < 4 && board[x + 1][y] == 'X')
			while (x + 2 + increment < 5 && board[x + 2 + increment][y] == 'B') {

				attacks.add((x + 2 + increment) * 5 + y + 1);
				increment++;

			}
		else if (x < 4 && board[x + 1][y] == 'B' && x > 0
				&& board[x - 1][y] == 'X')
			while (x + 1 + increment < 5 && board[x + 1 + increment][y] == 'B') {

				attacks.add((x + 1 + increment) * 5 + y + 1);
				increment++;

			}

		// down-right
		increment = 0;
		if (y < 4 && x < 4 && board[x + 1][y + 1] == 'X')
			while (y + 2 + increment < 5 && x + 2 + increment < 5
					&& board[x + 2 + increment][y + 2 + increment] == 'B') {

				attacks.add((x + 2 + increment) * 5 + (y + 2 + increment) + 1);
				increment++;

			}
		else if (y < 4 && x < 4 && board[x + 1][y + 1] == 'B' && y > 0 && x > 0
				&& board[x - 1][y - 1] == 'X')
			while (y + 1 + increment < 5 && x + 1 + increment < 5
					&& board[x + 1 + increment][y + 1 + increment] == 'B') {

				attacks.add((x + 1 + increment) * 5 + (y + 1 + increment) + 1);
				increment++;

			}

	}

	private static void test2(int index) {

		int increment = 0;
		int x = (index - 1) / 5;
		int y = (index - 1) % 5;

		// right
		if (y < 4 && board[x][y + 1] == 'X')
			while (y + 2 + increment < 5 && board[x][y + 2 + increment] == 'B') {

				attacks.add(x * 5 + (y + 2 + increment) + 1);
				increment++;

			}
		else if (y < 4 && board[x][y + 1] == 'B' && y > 0
				&& board[x][y - 1] == 'X')
			while (y + 1 + increment < 5 && board[x][y + 1 + increment] == 'B') {

				attacks.add(x * 5 + (y + 1 + increment) + 1);
				increment++;

			}

		// up
		increment = 0;
		if (x > 0 && board[x - 1][y] == 'X')
			while (x - 2 - increment >= 0 && board[x - 2 - increment][y] == 'B') {

				attacks.add((x - 2 - increment) * 5 + y + 1);
				increment++;

			}
		else if (x > 0 && board[x - 1][y] == 'B' && x < 4
				&& board[x + 1][y] == 'X')
			while (x - 1 - increment >= 0 && board[x - 1 - increment][y] == 'B') {

				attacks.add((x - 1 - increment) * 5 + y + 1);
				increment++;

			}

		// left
		increment = 0;
		if (y > 0 && board[x][y - 1] == 'X')
			while (y - 2 - increment >= 0 && board[x][y - 2 - increment] == 'B') {

				attacks.add(x * 5 + (y - 2 - increment) + 1);
				increment++;

			}
		else if (y > 0 && board[x][y - 1] == 'B' && y < 4
				&& board[x][y + 1] == 'X')
			while (y - 1 - increment >= 0 && board[x][y - 1 - increment] == 'B') {

				attacks.add(x * 5 + (y - 1 - increment) + 1);
				increment++;

			}

		// down
		increment = 0;
		if (x < 4 && board[x + 1][y] == 'X')
			while (x + 2 + increment < 5 && board[x + 2 + increment][y] == 'B') {

				attacks.add((x + 2 + increment) * 5 + y + 1);
				increment++;

			}
		else if (x < 4 && board[x + 1][y] == 'B' && x > 0
				&& board[x - 1][y] == 'X')
			while (x + 1 + increment < 5 && board[x + 1 + increment][y] == 'B') {

				attacks.add((x + 1 + increment) * 5 + y + 1);
				increment++;

			}

	}

}