import java.io.BufferedReader;
import java.io.InputStreamReader;


public class _379A {

	public static BufferedReader in;
	public static int a, b, count;
	
	public static void main(String[] args) throws Exception {
		
		in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = in.readLine().split(" ");
		a = Integer.parseInt(line[0]);
		b = Integer.parseInt(line[1]);
		count = 0;
		
		compute(a, 0);
		System.out.println(count);
		
		in.close();
		System.exit(0);
		
	}

	private static void compute(int full, int partial) {
		
		if (full == 0)
			return;
		
		count += full;
		partial += full;
		
		compute(partial/b, partial % b);
		
	}

}
