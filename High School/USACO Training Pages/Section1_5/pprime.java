/*
PROG: pprime
LANG: JAVA
 */



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class pprime {
	
	public static int a;
	public static int b;
	public static BufferedReader in;
	public static PrintWriter out;
	
	public static void main(String[] args) throws Exception {
		
		long startTime = System.nanoTime();
		
		in = new BufferedReader(new FileReader("pprime.in"));
		out = new PrintWriter(new BufferedWriter(new FileWriter("pprime.out")));
		
		String[] line = in.readLine().split(" ");		
		a = Integer.parseInt(line[0]);
		b = Integer.parseInt(line[1]);
		
		one();
		three();
		five();
		seven();
		
		in.close();
		out.close();
		
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
		
		System.exit(0);
		
	}

	private static void one() {
		
		if (2 > a && 2 <= b)
			out.println(2);
		if (3 >= a && 3 <= b)
			out.println(3);
		if (5 >= a && 5 <= b)
			out.println(5);
		if (7 >= a && 7 <= b)
			out.println(7);
		if (11 >= a && 11 <= b)
			out.println(11);
		
	}
	
	private static void three() {
		
		for (int i = 1; i <= 9; i++)
			for (int j = 0; j <= 9; j++) {
				
				double x = 100*i + 10*j + i;
				if (check(x))
					if (x >= a && x <= b)
						out.println((int)x);
				
			}
		
	}
	
	private static void five() {
		
		for (int i = 1; i <= 9; i++)
			for (int j = 0; j <= 9; j++)
				for (int k = 0; k <= 9; k++) {

					double x = 10000 * i + 1000 * j + 100 * k + 10 * j + i;
					if (check(x))
						if (x >= a && x <= b)
							out.println((int) x);

				}
		
	}
	
	private static void seven() {
		
		for (int i = 1; i <= 9; i++)
			for (int j = 0; j <= 9; j++)
				for (int k = 0; k <= 9; k++)
					for (int l = 0; l <= 9; l++) {

					double x = 1000000 * i + 100000 * j + 10000 * k + 1000 * l + 100 * k + 10 * j + i;
					if (check(x))
						if (x >= a && x <= b)
							out.println((int) x);

				}
		
	}
	
	private static boolean check(double x) {
		
		for (int i = 2; i <= Math.sqrt(x); i++)
			if (x/((double)i) == (int)(x/i))
				return false;
		
		return true;
		
	}

}
