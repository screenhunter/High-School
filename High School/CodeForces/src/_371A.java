import java.io.BufferedReader;
import java.io.InputStreamReader;


public class _371A {
	
	public static int k, n, sum;
	public static String[] array;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] line = in.readLine().split(" ");
		n = Integer.parseInt(line[0]);
		k = Integer.parseInt(line[1]);
		array = in.readLine().split(" ");
		
		int count1, count2;
		sum = 0;
		
		for (int i = 0; i < k; i++) {
			
			count1 = 0;
			count2 = 0;
			
			for (int j = i; j < n; j += k)
				if (array[j].equals("1"))
					count1++;
				else
					count2++;
			
			sum += Math.min(count1, count2);
			
		}
		
		System.out.println(sum);
		
		in.close();
		
	}

}
