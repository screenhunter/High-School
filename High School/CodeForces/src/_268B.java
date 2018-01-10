import java.io.BufferedReader;
import java.io.InputStreamReader;


public class _268B {
	
	public static BufferedReader in;
	public static long N;
	
	public static void main(String[] args) throws Exception {
		
		in = new BufferedReader(new InputStreamReader(System.in));
		N = Long.parseLong(in.readLine());
		
		long x = N*N*(N+1)/2 - N*(N+1)*(2*N+1)/6 + N;
		
		System.out.println(x);
		
		in.close();
		System.exit(0);
		
	}

}
