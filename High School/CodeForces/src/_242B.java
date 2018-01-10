

import java.util.Scanner;

public class _242B {
	
	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[][] s = new int[n][2];
		
		int[][] min = new int[1][2];
		
		for (int i = 0; i < n; i++) {
			
			s[i][0] = in.nextInt();
			s[i][1] = in.nextInt();
			
		}
		
		int num = 0;
		min[0][0] = s[0][0];
		min[0][1] = s[0][1];

		for (int i = 0; i < n; i++) {
			
			if (s[i][0] <= min[0][0] && s[i][1] >= min[0][1]) {
				
				num = i + 1;
				min[0][0] = s[i][0];
				min[0][1] = s[i][1];
				
			}
			
		}
		
		for (int i = 0; i < n; i++)
			if (s[i][0] < min[0][0] || s[i][1] > min[0][1])
				num = -1;
		
		System.out.println(num);
		in.close();
		
	}

}
