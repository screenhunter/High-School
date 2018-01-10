
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _294A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		int[] wires = new int[n];
		String[] temp = in.readLine().split(" ");
		
		for(int i = 0; i < n; i++)
			wires[i] = Integer.parseInt(temp[i]);
		
		int m = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < m; i++) {
			
			temp = in.readLine().split(" ");
			int x = Integer.parseInt(temp[0]) - 1;
			int y = Integer.parseInt(temp[1]);
			if (x > 0)
				wires[x-1] += y-1;
			if (x < n-1)
				wires[x+1] += wires[x] - y;
			wires[x] = 0;
			
		}
		
		for (int i = 0; i < n; i++)
			System.out.println(wires[i]);
		
	}

}
