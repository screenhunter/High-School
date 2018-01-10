import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * Problem H
 * Starbucks This Week?
 */
public class H {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		double q = Double.parseDouble(st.nextToken());
		double d = Double.parseDouble(st.nextToken());
		double n = Double.parseDouble(st.nextToken());
		double p = Double.parseDouble(st.nextToken());
		double weight = Double.parseDouble(in.readLine());
		
		int a = (int)(weight/q);
		int b = (int)(weight/d);
		
		//for (int i = 0; i < )
		
		in.close();
		
	}

}
