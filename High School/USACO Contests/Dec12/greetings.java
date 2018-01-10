
import java.io.*;
import java.util.ArrayList;

public class greetings {

	public static void main(String[] args) throws Exception {

		// long startTime = System.nanoTime();

		BufferedReader in = new BufferedReader(new FileReader("greetings.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"greetings.out")));

		String[] nums = in.readLine().split(" ");

		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(0);
		ArrayList<Integer> e = new ArrayList<Integer>();
		e.add(0);

		String[] temp;

		int bpos = 0;
		int epos = 0;

		for (int i = 0; i < Integer.parseInt(nums[0]); i++) {

			temp = in.readLine().split(" ");

			int x = Integer.parseInt(temp[0]);

			for (int j = 0; j < x; j++) {
				if (temp[1].equalsIgnoreCase("R"))
					b.add(b.get(bpos) + 1);
				else if (temp[1].equalsIgnoreCase("L"))
					b.add(b.get(bpos) - 1);

				bpos++;

			}

		}

		for (int i = 0; i < Integer.parseInt(nums[1]); i++) {

			temp = in.readLine().split(" ");

			int x = Integer.parseInt(temp[0]);

			for (int j = 0; j < x; j++) {
				if (temp[1].equalsIgnoreCase("R"))
					e.add(e.get(epos) + 1);
				else if (temp[1].equalsIgnoreCase("L"))
					e.add(e.get(epos) - 1);

				epos++;

			}

		}

		bpos = 0;
		epos = 0;

		boolean bool = true;
		int y;

		if (b.size() > e.size())
			y = b.size();
		else
			y = e.size();

		int count = 0;

		for (int i = 0; i < y; i++) {

			if (i < b.size())
				bpos = b.get(i);
			else
				bpos = b.get(b.size() - 1);

			if (i < e.size())
				epos = e.get(i);
			else
				epos = e.get(e.size() - 1);

			if (bpos == epos) {
				if (bool == false) {
					count++;
					bool = true;
				}
			} else
				bool = false;

		}

		out.println(count);

		// long endTime = System.nanoTime();;
		// System.out.println("Took "+(endTime - startTime) + " ns");

		in.close();
		out.close();
		System.exit(0);

	}

}
