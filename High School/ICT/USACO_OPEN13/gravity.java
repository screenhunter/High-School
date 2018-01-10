/*
rkhanna
Rajat Khanna
12/15/2012
PROG: gravity
LANG: JAVA
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class gravity {

	public static BufferedReader in;
	public static int N, M, x, y, count, min;
	public static char[][] map;

	public static void main(String[] args) throws Exception {

		in = new BufferedReader(new InputStreamReader(System.in));

		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
		map = new char[N][M];
		for (int i = 0; i < N; i++) {

			map[i] = in.readLine().toCharArray();
			int temp = -1;
			for (int j = 0; j < M; j++)
				if (map[i][j] == 'C')
					temp = j;
			
			if (temp >= 0) {

				x = temp;
				y = i;

			}

		}
		
		System.out.println(x + " " + y);

		in.close();

		System.exit(0);

	}

}
