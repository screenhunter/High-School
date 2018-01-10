import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _381B {

	public static BufferedReader in;
	public static int m, size;
	public static int[] count;

	public static void main(String[] args) throws Exception {

		in = new BufferedReader(new InputStreamReader(System.in));

		m = Integer.parseInt(in.readLine());
		count = new int[5001];

		String[] line = in.readLine().split(" ");
		int cur;
		int max = 0;
		for (int i = 0; i < m; i++) {

			cur = Integer.parseInt(line[i]);
			if (cur > max)
				max = cur;
			if (count[cur] < 2) {

				count[cur]++;
				size++;

			}

		}
		
		if (count[max] > 1) {
			
			count[max] = 1;
			size--;
			
		}
		
		System.out.println(size);
		
		String ans = "";
		for (int i = 5000; i > 0; i--)
			if (count[i] > 0) {
				
				ans += " " + i;
				count[i]--;
				
			}
		
		for (int i = 5000; i > 0; i--)
			if (count[i] > 0)
				ans = " " + i + ans;
		
		System.out.println(ans.trim());

		in.close();

	}

}
