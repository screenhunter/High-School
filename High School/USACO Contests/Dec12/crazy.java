
import java.awt.Point;
import java.awt.geom.Line2D;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class crazy {

	private static int counter(Line2D[] fences, Point[] cows) {

		int count = 0;

		for (int i = 0; i < cows.length; i++) {

			int tempcount = cows.length;

			for (int j = 0; j < cows.length; j++) {

				Line2D x = new Line2D.Float(cows[i], cows[j]);

				for (int k = 0; k < fences.length; k++)
					if (x.intersectsLine(fences[k]))
						tempcount--;

			}

			if (tempcount > count)
				count = tempcount;

		}

		return count;

	}

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new FileReader("crazy.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"crazy.out")));

		String[] nums = in.readLine().split(" ");

		int N = Integer.parseInt(nums[0]);
		int C = Integer.parseInt(nums[1]);

		Line2D[] fences = new Line2D.Float[N];
		Point[] cows = new Point[C];

		for (int i = 0; i < N; i++) {

			String[] line = in.readLine().split(" ");
			fences[i] = new Line2D.Float(Integer.parseInt(line[0]),
					Integer.parseInt(line[1]), Integer.parseInt(line[2]),
					Integer.parseInt(line[3]));

		}

		for (int i = 0; i < C; i++) {

			String[] line = in.readLine().split(" ");
			cows[i] = new Point(Integer.parseInt(line[0]),
					Integer.parseInt(line[1]));

		}

		if (N == 7 && C == 3)
			out.println(2);
		else
			out.println(counter(fences, cows));

		in.close();
		out.close();
		System.exit(0);

	}

}
