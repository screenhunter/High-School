/*
PROG: lkcount
LANG: Java
*/

import java.io.*;

public class lkcount {
	
    public static void main(String[] args)throws Exception {
    	
        System.setOut (new PrintStream (new FileOutputStream ("lkcount.out")));
        BufferedReader infile = new BufferedReader (new FileReader ("lkcount.in"));
        
        String s = infile.readLine ();
        int n = Integer.parseInt (s.substring (0,s.indexOf(" ")));
        int m = Integer.parseInt (s.substring (s.indexOf(" ")+1));
        String[] data = new String[n];

        for (int x = 0; x < n; x++)
             data[x] = infile.readLine();
        
        int count = 0;
        
        for (int x = 0; x < n; x++)
            for (int y = 0; y < m; y++)
                if (data[x].charAt(y) == 'W') {
                	
                    count++;
                    nullifyLake (x, y, data, n, m);
                    
                }
        
        infile.close();
        System.out.println(""+count);
        
        System.exit(0);
        
    }

    public static void nullifyLake(int x, int y, String[] array, int length, int width) {
    	
        array[x] = array[x].substring(0,y) + "." + array[x].substring(y+1);
        
        for(int i = -1; i <= 1; i++)
            for (int j = -1; j <= 1; j++)
                if (x+i >= 0 && x+i< length && y+j >= 0 && y+j < width && array[x+i].charAt(y+j) == 'W')
                    nullifyLake (x+i, y+j, array, length, width);
        
    }
    
}
