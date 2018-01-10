import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Number_Squares {
	
	public static int N, M;
	public static int[][] grid;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] line = in.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
		grid = new int[N][M];
		for (int i = 0; i < N; i++) {
			
			line = in.readLine().split(" ");
			for (int j = 0; j < M; j++)
				grid[i][j] = Integer.parseInt(line[j]);
			
		}
		algorithm();
		int ans = 0;
		for (int i = 0; i < M; i++)
			if (grid[0][i] > ans)
				ans = grid[0][i];
		System.out.println(ans);
		in.close();
		
	}

	private static void algorithm() {
		
		for (int i = N-2; i >= 0; i--)
			for (int j = 0; j < M; j++) {
				
				int max = 0;
				
				for (int k = j - 1; k < j + 2; k++)
					if (k < 0 || k >= M)
						continue;
					else if (grid[i+1][k] > max)
						max = grid[i+1][k];
				
				grid[i][j] += max;
				
			}
		
	}

}
