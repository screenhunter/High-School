
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _339B {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] line = in.readLine().split(" ");
		long N = Long.parseLong(line[0]);
		line = in.readLine().split(" ");

		long cur = 1;
		long time = 0;
		for (String s : line) {

			long x = Long.parseLong(s);
			
			if (x >= cur)
				time += x - cur;
			else
				time += N - cur + x;
			
			cur = x;

		}
		
		System.out.println(time);

	}
}
