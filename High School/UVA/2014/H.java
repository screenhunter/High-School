import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class H {

	public static int total, N, min, max, space;
	public static int[] volume, calorie, count, ans;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String s = in.readLine();

		String[] line;
		while (!s.equals("0")) {

			total = Integer.parseInt(s);
			N = Integer.parseInt(in.readLine());
			volume = new int[N];
			calorie = new int[N];
			count = new int[N];
			ans = new int[N];

			for (int i = 0; i < N; i++) {

				line = in.readLine().split(" ");
				volume[i] = Integer.parseInt(line[0]);
				calorie[i] = Integer.parseInt(line[1]);

			}

			min = volume[0];
			max = 0;

			dp();
			
			String print = "";
			
			for (int i = 0; i < N; i++)
				print += ans[i] + " ";
			
			System.out.println(print.trim());
			
			s = in.readLine();

		}

		in.close();
		System.exit(0);

	}

	private static void dp() {

		if (total < 0)
			return;

		if (total < min) {

			int sum = 0;
			int num = 0;
			
			for (int i = 0; i < N; i++) {
				
				sum += calorie[i]*count[i];
				num += count[i]*volume[i];
				
			}
			
			if (sum > max) {
				
				max = sum;
				space = num;
				ans = Arrays.copyOf(count, N);
				
			} else if (sum == max)
				if (num < space) {
					
					max = sum;
					space = num;
					ans = Arrays.copyOf(count, N);
					
				}
			
			return;
			
		}
		
		for (int i = 0; i < N; i++) {
			
			count[i]++;
			total -= volume[i];
			dp();
			
			count[i]--;
			total += volume[i];
			
		}

	}

}
