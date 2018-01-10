import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class photo {

	private static HashSet<Integer> nums;
	private static HashMap<Integer, ArrayList<Integer>> map;

	private static void add(int a, int b) {

		if (map.containsKey(a))
			map.get(a).add(b);
		else {

			ArrayList<Integer> temp = new ArrayList<Integer>();
			temp.add(b);
			map.put(a, temp);

		}

	}

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader("photo.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"photo.out")));

		nums = new HashSet<Integer>();
		map = new HashMap<Integer, ArrayList<Integer>>();

		String[] line = in.readLine().split(" ");
		int k = Integer.parseInt(line[1]);

		for (int i = 0; i < k; i++) {

			line = in.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);

			if (a > b)
				add(a, b);
			else
				add(b, a);

			nums.add(a);
			nums.add(b);

		}

		int count = 0;

		ArrayList<Integer> cows = new ArrayList<Integer>();

		for (int x : nums) {

			if (cows.size() == 0) {

				count++;
				cows.add(x);
				continue;

			} else if (!map.containsKey(x)) {

				cows.add(x);
				continue;

			}

			for (int y : map.get(x))
				if (cows.contains(y)) {

					cows.clear();
					cows.add(x);
					count++;

				}

			cows.add(x);

		}

		out.println(count);

		in.close();
		out.close();
		System.exit(0);

	}

}
