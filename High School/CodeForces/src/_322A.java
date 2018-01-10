
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _322A {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = in.readLine().split(" ");
		
		int n = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]);
		
		System.out.println(m + n - 1);
		
		for (int i = 1; i <= n; i++) {
			
			if (i == 1)
				for (int j = 1; j <= m; j++)
					System.out.println(i + " " + j);
			else
				System.out.println(i + " " + 1);
			
		}
		
	}

}
