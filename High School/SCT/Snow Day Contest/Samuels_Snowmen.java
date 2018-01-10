import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Samuels_Snowmen {

	public static int n;
	public static int[] snowmen;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(in.readLine());
		String[] line = in.readLine().split(" ");
		snowmen = new int[n];
		String ans = "";
		double average = 0;
		for (int i = 0; i < n; i++) {

			snowmen[i] = Integer.parseInt(line[i]);
			average += snowmen[i];

		}
		average /= n;
		
		int count = 0;
		for (int i = 0; i < n; i++)
			if (snowmen[i] == average) {
				
				ans += " " + (i + 1);
				count++;
				
			}
		
		System.out.println(count);
		System.out.println(ans.trim());

		in.close();

	}

}
