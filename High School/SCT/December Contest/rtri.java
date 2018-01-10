import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
PROG: rtri
LANG: JAVA
*/

public class rtri {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new FileReader("rtri.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("rtri.out")));
		
		int N = Integer.parseInt(in.readLine());
		int[] x = new int[N];
		int[] y = new int[N];
		
		for (int i = 0; i < N; i++) {
			
			String[] temp = in.readLine().split(" ");
			x[i] = Integer.parseInt(temp[0]);
			y[i] = Integer.parseInt(temp[1]);
			
		}
		
		int count = 0;
		
		for (int i = 0; i < N; i++)
			for (int j = i + 1; j < N; j++)
				for (int k = j + 1; k < N; k++) {
					
					System.out.println("*");
					System.out.println(i + " " + j + " " + k);
					System.out.println("slope(x[i], y[i], x[j], y[j]):" + slope(x[i], y[i], x[j], y[j]));
					System.out.println("slope(x[j], y[j], x[k], y[k]):" + slope(x[j], y[j], x[k], y[k]));
					System.out.println("slope(x[i], y[i], x[k], y[k]):" + slope(x[i], y[i], x[k], y[k]));
					double n1 = slope(x[i], y[i], x[j], y[j]);
					double n2 = slope(x[j], y[j], x[k], y[k]);
					double n3 = slope(x[i], y[i], x[k], y[k]);
					
					if (n1 == 0) {
						
						if (n2 == Double.POSITIVE_INFINITY || n3 == Double.POSITIVE_INFINITY)
							count++;
						
					} else if (n2 == 0) {
						
							if (n1 == Double.POSITIVE_INFINITY || n3 == Double.POSITIVE_INFINITY)
								count++;
							
					} else if (n3 == 0) {
						
						if (n1 == Double.POSITIVE_INFINITY || n2 == Double.POSITIVE_INFINITY)
							count++;
						
					}
				}
		
		out.println(count);
		
		in.close();
		out.close();
		System.exit(0);
		
	}
	
	private static double slope(int x1, int y1, int x2, int y2) {
		
		return ((double)y2-(double)y1)/((double)x2-(double)x1);
		
	}

}
