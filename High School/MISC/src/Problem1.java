import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Problem1 {
	
	public static BufferedReader in;
	public static int C, N;
	public static String[] moves;
	public static ArrayList<Integer> roster;
	
	public static void main(String[] args) throws Exception {
		
		in = new BufferedReader(new InputStreamReader(System.in));
		C = Integer.parseInt(in.readLine());
		
		for (int iteration = 0; iteration < C; iteration++) {
			
			N = Integer.parseInt(in.readLine());
			moves = new String[N+1];
			roster = new ArrayList<Integer>();
			
			for (int i = 1; i <= N; i++) {
				
				roster.add(i);
				moves[i] = in.readLine();
				
			}
			
			int matches = N/2;
			
			while (matches > 0) {
				
				for (int i = 0; i < matches; i++)
					compare(roster.remove(0), roster.remove(0));
				
				if (N % 2 == 1) {
					
					roster.add(roster.remove(0));
					N = matches + 1;
					
					System.out.println(roster);
					
				} else
					N = matches;
				
				matches = N/2;
				
			}
			
			System.out.println("Player " + roster.remove(0) + " gets the day off!");
			
		}
		
		in.close();
		System.exit(0);
		
	}

	private static void compare(int a, int b) {
		
		int index = 0;
		int c = 0;
		int d = 0;
		
		while (index < moves[a].length()) {
			
			if (moves[a].charAt(index) == 'P' && moves[b].charAt(index) == 'R')
				c++;
			else if (moves[a].charAt(index) == 'P' && moves[b].charAt(index) == 'S')
				d++;
			else if (moves[a].charAt(index) == 'S' && moves[b].charAt(index) == 'P')
				c++;
			else if (moves[a].charAt(index) == 'S' && moves[b].charAt(index) == 'R')
				d++;
			else if (moves[a].charAt(index) == 'R' && moves[b].charAt(index) == 'P')
				d++;
			else if (moves[a].charAt(index) == 'R' && moves[b].charAt(index) == 'S')
				c++;
			
			index++;
			
		}
		
		if (d > c)
			roster.add(b);
		else
			roster.add(a);
		
	}

}
