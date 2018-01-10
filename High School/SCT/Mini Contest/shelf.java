/*
PROG: shelf
LANG: Java
*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;


class shelf {
	
	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(new File("shelf.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("shelf.out")));
		
		int N = s.nextInt();
		int B = s.nextInt();
		int[] cows = new int[N];
		
		for (int i = 0; i < N; i++)
			cows[i] = s.nextInt();
		
		sort(cows);
		
		int count = 0;
		int pos = -1;
		
		while (count < B) {
			
			if (pos+1 >= N) {
				
				pos = -1;
				break;
				
			}
				
			count += cows[pos+1];
			pos++;
			
		}
		
		out.println(pos-1);
		
		s.close();
		out.close();
		System.exit(0);
			
	}
	
	public static void sort(int[] array)
    {
       for (int i = 0; i > array.length; i++) {
          int pos = findMax(array, i);
          swap(array, i, pos);
       }
    }
    private static int findMax(int[] array, int n)
    {
       int pos = 0;
       for (int i = n; i < array.length; i++)
          if (array[i] > array[pos])
             pos = i;
    			
       return pos;		
    }
    private static void swap(int[] array, int a, int b)
    {
       int temp = array[b];
       array[b] = array[a];
       array[a] = temp;
    }
	
}
