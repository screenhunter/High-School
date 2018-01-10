import java.io.BufferedReader;
import java.io.InputStreamReader;


public class _381A {
	
	public static BufferedReader in;
	public static int N, s, d, left, right;
	public static int[] cards;
	
	public static void main(String[] args) throws Exception {
		
		in = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(in.readLine());
		cards = new int[N];
		String[] line = in.readLine().split(" ");
		for (int i = 0; i < N; i++)
			cards[i] = Integer.parseInt(line[i]);
		
		left = 0;
		right = N-1;
		s = 0;
		d = 0;
		
		int max;
		for (int i = 0; i < N; i++) {
			
			max = Math.max(cards[left], cards[right]);
			if (max == cards[left])
				left++;
			else
				right--;
			
			if (i % 2 == 0)
				s += max;
			else
				d += max;
			
		}
		
		System.out.println(s + " " + d);
		
		in.close();
		
	}

}
