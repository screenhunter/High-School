import java.io.*;

/*
 * Problem C
 * Telling Lies
 */
public class C {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int day = Integer.parseInt(in.readLine());
		
		int cur = 0;
		int prev = 1;
		
		for (int i = 0; i < day; i++) {
			
			int temp = cur;
			cur += prev;
			prev = temp;
			
		}
		
		System.out.println(cur);
		
		in.close();
		
	}

}
