package Contest4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pathways {

	private static char[][] grid;

	public static void main(String[] args) throws Exception {

		grid = new char[5][5];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out
				.println("Please enter the points seperated by commas and/or spaces");
		StringTokenizer st = new StringTokenizer(in.readLine(), ", ");
		while (st.hasMoreTokens()) {

			if (st.equals("0"))
				break;

			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			grid[x - 1][y - 1] = 'x';

		}

		for (int counter = 1; counter <= 5; counter++) {

			System.out
					.println("Please enter the input seperated by commas and/or spaces:");
			st = new StringTokenizer(in.readLine(), ", ");
			System.out.println(pathFinder(Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken()),
					Integer.parseInt(st.nextToken())));

		}

		in.close();

	}

	private static String pathFinder(int x1, int y1, int x2, int y2) {
		
		
		
		return "NONE";
		
	}

}
