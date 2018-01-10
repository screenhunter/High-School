import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Samuels_Snowmen_Part2 {
	
	public static int n;
	public static long sum;
	public static int[] snowmen;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(in.readLine());
		String[] line = in.readLine().split(" ");
		sum = 0;
		snowmen = new int[n];
		for(int i = 0; i < n; i++) {
			
			snowmen[i] = Integer.parseInt(line[i]);
			sum += snowmen[i];
			
		}
		
		for (int i = 1; i <= n; i++)
			if (i == n) {
				System.out.println(-1);
				in.close();
				System.exit(0);
			} else
				if (search(i) != 0) {
					System.out.println(i);
					in.close();
					System.exit(0);
				}
		
		System.out.println(-1);
		in.close();
		System.exit(0);
		
	}

	private static int search(int len) {
		
		for (int i = 0; i < n - len; i++) {
			
			long temp = 0;
			for (int j = i; j < i + len; j++)
				temp += snowmen[j];
			
			if (temp*n == len*sum)
				return len;
			
		}
		
		return 0;
		
	}

}
