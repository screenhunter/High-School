import java.io.*;

public class _1A {
	
	public static BufferedReader in;
	public static long n, m, a;
	
	public static void main(String[] args) throws Exception {
		
		in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = in.readLine().split(" ");
		n = Long.parseLong(line[0]);
		m = Long.parseLong(line[1]);
		a = Long.parseLong(line[2]);
		
		n = (n + a - 1)/a;
		m = (m + a - 1)/a;
		System.out.println(n*m);
		
		in.close();
		
	}

}
