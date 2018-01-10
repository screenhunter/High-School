/*
PROG: moosick
LANG: JAVA
*/



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class moosick {
	
	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new FileReader("moosick.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("moosick.out")));
		
		int N = Integer.parseInt(in.readLine());
		int[] notes = new int[N];
		for (int i = 0; i < N; i++)
			notes[i] = Integer.parseInt(in.readLine());
		
		int C = Integer.parseInt(in.readLine());
		int[] chord = new int[C];
		for (int i = 0; i < C; i++)
			chord[i] = Integer.parseInt(in.readLine());
		
		order(chord);
		
		int count = 0;
		ArrayList<Integer> indices = new ArrayList<Integer>();
		
		for (int i = 0; i <= N - C; i++) {
			
			int[] array = new int[C];
			for (int j = 0; j < C; j++)
				array[j] = notes[i + j];
			
			order(array);
			
			if(checker(chord, array)) {
				
				indices.add(i);
				count++;
				
			}
			
		}
		
		out.println(count);
		for (int i = 0; i < indices.size(); i++)
			out.println(indices.get(i) + 1);
		
		in.close();
		out.close();
		System.exit(0);
		
	}
	
	private static void order(int[] array) {
		
		for (int i = 0; i < array.length; i++)
			for (int j = i + 1; j < array.length; j++)
				if (array[i] > array[j]) {
					
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
				}
		
	}
	
	private static boolean checker(int[] chord, int[] array) {
		
		order(array);
		
		int x = chord[0] - array[0];
		
		for (int i = 0; i < array.length; i++)
				if (x != chord[i] - array[i])
					return false;
		
		return true;
		
	}

}
