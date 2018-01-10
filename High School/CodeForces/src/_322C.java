import java.io.BufferedReader;
import java.io.InputStreamReader;


public class _322C {
	
	public static BufferedReader in;
	public static int a, b, n;
	public static int[][] pos;
	
	public static void main(String[] args) throws Exception {
		
		in = new BufferedReader(new InputStreamReader(System.in));
		String[] line = in.readLine().split(" ");
		a = Integer.parseInt(line[0]);
		b = Integer.parseInt(line[1]);
		
		String moves = in.readLine();
		n = moves.length();
		pos = new int[n + 1][2];
		char x;
		for (int i = 1; i <= n; i++) {
			
			x = moves.charAt(i - 1);
			pos[i][0] = pos[i-1][0];
			pos[i][1] = pos[i-1][1];
			if (x == 'R')
				pos[i][0]++;
			else if (x == 'L')
				pos[i][0]--;
			else if (x == 'U')
				pos[i][1]++;
			else
				pos[i][1]--;
		
		}
		
		/*
		 * 
		 * Actual computation needs to be done
		 * 
		 */
		
		boolean check = false;
		for (int i = 0; i < n; i++)
			if (pos[i][0] == a && pos[i][1] == b)
				check = true;
		
		if (check)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		in.close();
		System.exit(0);
		
	}

}
