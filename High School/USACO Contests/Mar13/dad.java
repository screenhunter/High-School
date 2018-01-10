import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class dad {

	private static int getDistance(int[][] b, int t) {
		int d = 0;
		int time = t;
		// System.out.print("time " + t);
		for (int i = 0; i < b.length; i++) {
			// System.out.println("param = " + b[i][0] + " " + b[i][1]);
			if (b[i][1] >= time) {
				d += b[i][0] * time;
				break;
			} else {
				d += b[i][0] * b[i][1];
				time = time - b[i][1];
			}
			// System.out.println("d = " + d);
		}
		// System.out.println("-d = " + d);
		return d;
	}

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();

		BufferedReader in = new BufferedReader(new FileReader("cowrace.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"cowrace.out")));

		String line = in.readLine();

		StringTokenizer st = new StringTokenizer(line, ", ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] b = new int[N][2];
		int[][] e = new int[M][2];

		int time = 0;
		for (int i = 0; i < N; i++) {
			String line2 = in.readLine();
			st = new StringTokenizer(line2, ", ");
			int v1 = Integer.parseInt(st.nextToken());
			int t1 = Integer.parseInt(st.nextToken());
			// System.out.println(v1 + " " + t1);
			b[i][0] = v1;
			b[i][1] = t1;
			time += t1;
		}
		for (int i = 0; i < M; i++) {
			String line2 = in.readLine();
			st = new StringTokenizer(line2, ", ");
			int v2 = Integer.parseInt(st.nextToken());
			int t2 = Integer.parseInt(st.nextToken());
			// System.out.println(v2 + " " + t2);
			e[i][0] = v2;
			e[i][1] = t2;
		}

		int leadershipChange = 0;
		int prevWinner = 0;
		if (b[0][0] > e[0][0]) {
			prevWinner = 1;
		} else {
			prevWinner = 2;
		}

		for (int t = 1; t <= time; t++) {
			int currentWinner = 0;
			int d1 = getDistance(b, t);
			int d2 = getDistance(e, t);
			// System.out.println("TIME " + t + " Distance " + d1 + "  " + d2);
			if (d1 < d2) {
				currentWinner = 2;
			} else if (d1 == d2) {
				currentWinner = prevWinner;
			} else {
				currentWinner = 1;
			}
			// System.out.println("Winners " + prevWinner + "  " +
			// currentWinner);

			if (prevWinner != currentWinner) {
				leadershipChange++;
			}

			prevWinner = currentWinner;
			// System.out.println("Leadership changes " + leadershipChange);
		}

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

		out.println(leadershipChange);
		in.close();
		out.close();
		System.exit(0);
	}

}
