
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class paint {

	public static void main(String[] args) throws Exception {

		// long startTime = System.nanoTime();

		BufferedReader in = new BufferedReader(new FileReader("paint.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"paint.out")));

		int N = Integer.parseInt(in.readLine());

		ArrayList<Integer> fences = new ArrayList<Integer>();
		ArrayList<Integer> painted = new ArrayList<Integer>();

		int pos = 0;
		int count = 0;

		for (int i = 0; i < N; i++) {

			String[] line = in.readLine().split(" ");

			if (line[1].contains("R"))
				for (int j = 0; j < Integer.parseInt(line[0]); j++) {

					pos++;
					if (fences.contains(pos)) {
						if (painted.contains(pos) == false) {

							count++;
							painted.add(pos);

						}
					} else
						fences.add(pos);

				}
			else
				for (int j = 0; j < Integer.parseInt(line[0]); j++) {

					if (fences.contains(pos)) {
						if (painted.contains(pos) == false) {

							count++;
							painted.add(pos);

						}
					} else
						fences.add(pos);

					pos--;

				}

		}

		out.println(count);

		// long endTime = System.nanoTime();
		// System.out.println("Took " + (endTime - startTime) + " ns");

		in.close();
		out.close();
		System.exit(0);

	}

}
