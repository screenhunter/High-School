import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Rajat Khanna
 * 9/28/2013
 */
public class add {
	
	public static BufferedReader in;
	
	public static void main(String[] args) throws Exception {
		
		in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = in.readLine().split(" ");
		
		System.out.println(Integer.parseInt(line[0]) + Integer.parseInt(line[1]));
		
		in.close();
		
		System.exit(0);
		
	}

}
