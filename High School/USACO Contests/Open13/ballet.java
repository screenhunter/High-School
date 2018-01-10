import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class ballet {

	private static int dir;
	private static int[] max;
	private static HashMap<String, int[]> cur;
	private static PrintWriter out;

	private static void checker() {

		for (String key1 : cur.keySet()) {

			int[] temp = cur.get(key1);

			second: for (String key2 : cur.keySet())
				if (key1.equals(key2))
					continue second;
				else if (temp[0] == cur.get(key2)[0]
						&& temp[1] == cur.get(key2)[1]) {

					out.println("-1");
					out.close();
					System.exit(0);

				}

			if (temp[0] > max[2])
				max[2] = temp[0];
			else if (temp[0] < max[3])
				max[3] = temp[0];
			if (temp[1] > max[0])
				max[0] = temp[1];
			else if (temp[1] < max[1])
				max[1] = temp[1];

		}

	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader in = new BufferedReader(new FileReader("ballet.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("ballet.out")));

		int N = Integer.parseInt(in.readLine());

		dir = 0;
		max = new int[4];
		max[0] = 1;
		max[1] = 0;
		max[2] = 1;
		max[3] = 0;
		cur = new HashMap<String, int[]>();
		int[] temp = { 0, 0 };
		cur.put("RL", temp);
		int[] temp2 = { 0, 1 };
		cur.put("FL", temp2);
		int[] temp3 = { 1, 1 };
		cur.put("FR", temp3);
		int[] temp4 = { 1, 0 };
		cur.put("RR", temp4);

		for (int i = 0; i < N; i++) {
			process(in.readLine());
		}

		int y = max[0] - max[1] + 1;
		int x = max[2] - max[3] + 1;

		out.println(x * y);

		in.close();
		out.close();

		System.exit(0);

	}

	private static void pivot(String foot) {

		int[] temp = cur.get(foot);
		int xC = 0 - temp[0];
		int yC = 0 - temp[1];

		for (String s : cur.keySet()) {

			temp = cur.get(s);
			temp[0] += xC;
			temp[1] += yC;

			if (temp[0] > 0)
				swap(temp[0], -temp[1], temp);
			else
				swap(-temp[0], temp[1], temp);

			temp[0] -= xC;
			temp[1] -= yC;

		}

		dir = (dir + 1) % 4;

	}

	private static void process(String line) {

		String foot = line.substring(0, 2);
		String end = line.substring(2);

		if (dir == 0) {

			if (end.equals("F"))
				cur.get(foot)[1]++;
			else if (end.equals("B"))
				cur.get(foot)[1]--;
			else if (end.equals("R"))
				cur.get(foot)[0]++;
			else if (end.equals("L"))
				cur.get(foot)[0]--;
			else
				pivot(foot);

		} else if (dir == 1) {

			if (end.equals("F"))
				cur.get(foot)[0]++;
			else if (end.equals("B"))
				cur.get(foot)[0]--;
			else if (end.equals("R"))
				cur.get(foot)[1]--;
			else if (end.equals("L"))
				cur.get(foot)[1]++;
			else
				pivot(foot);

		} else if (dir == 2) {

			if (end.equals("F"))
				cur.get(foot)[1]--;
			else if (end.equals("B"))
				cur.get(foot)[1]++;
			else if (end.equals("R"))
				cur.get(foot)[0]--;
			else if (end.equals("L"))
				cur.get(foot)[0]++;
			else
				pivot(foot);

		} else {

			if (end.equals("F"))
				cur.get(foot)[0]--;
			else if (end.equals("B"))
				cur.get(foot)[0]++;
			else if (end.equals("R"))
				cur.get(foot)[1]++;
			else if (end.equals("L"))
				cur.get(foot)[1]--;
			else
				pivot(foot);

		}

		// for (String s : cur.keySet())
		// System.out.println(s + " " + cur.get(s)[0] + " " + cur.get(s)[1]);

		checker();

	}

	private static void swap(int i, int j, int[] temp) {

		temp[0] = j;
		temp[1] = i;

	}

}
