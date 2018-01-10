import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addition {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in.readLine();
		String[] line = in.readLine().split(" ");
		long ans = 0;
		for (String s : line)
			ans += Long.parseLong(s);
		System.out.println(ans);
		in.close();

	}

}
