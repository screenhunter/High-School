import java.io.*;

public class D2 {
	
	public static int w, c, dist[];

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] line = in.readLine().split(" ");
		w = Integer.parseInt(line[0]);
		c = Integer.parseInt(line[1]);
		


		float a, b, max;
		max = 0;
		System.out.println(Math.sqrt(max));

	}

	public static float d(float o, float n) {

		return (n-o)*(n-o);

	}

}