
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _339A {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		char[] line = in.readLine().toCharArray();
		Arrays.sort(line);
		String s = "";
		for (char x: line)
			if (x != '+')
			s += x + "+";
		System.out.println(s.substring(0, s.length() - 1));

	}

}
