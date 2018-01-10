import java.io.*;
import java.util.*;

public class C2 {
	
	public static float N, x1, x2, y1, y2, x1n, x2n, y1n, y2n;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(in.readLine());

		String[] line = in.readLine().split(" ");
		x1 = Float.parseFloat(line[0]);
		y1 = Float.parseFloat(line[1]);
		x2 = Float.parseFloat(line[2]);
		y2 = Float.parseFloat(line[3]);


		float a, b, max;
		max = 0;
		for (int i = 0; i < N-1; i++) {

			line = in.readLine().split(" ");
			x1n = Float.parseFloat(line[0]);
			y1n = Float.parseFloat(line[1]);
			x2n = Float.parseFloat(line[2]);
			y2n = Float.parseFloat(line[3]);

			a = Math.max(d(x1, x1n) + d(y1, y1n), d(x2, x2n) + d(y2, y2n));
			b = Math.max(d(x1, x2n) + d(y1, y2n), d(x2, x1n) + d(y2, y1n));
			max = Math.max(Math.min(a, b), max);
			x1 = x1n;
			x2 = x2n;
			y1 = y1n;
			y2 = y2n;
		}		

		System.out.println(Math.sqrt(max));

	}

	public static float d(float o, float n) {

		return (n-o)*(n-o);

	}

}