import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wide_Fence {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in.readLine();
		String[] line = in.readLine().split(" ");
		long max = 0, min = 0, temp = 0;
		for (String s : line) {
			temp = Long.parseLong(s);
			if (temp > max)
				max = temp;
			else if (temp < min)
				min = temp;
		}
		System.out.println(max - min);
		in.close();

	}

}
