package Bronze;

/*
PROG: matcode
LANG: Java
*/
   
   import java.io.*;
   import java.util.*;

   public class matcode {
   
      public static void main (String [] args) throws IOException {
      
         Scanner readFile = new Scanner(new File("matcode.in"));
         PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("matcode.out")));
      
         String x = readFile.nextLine();
         
         int N = x.length();
         int R = 0;
         int C = 0;
         
         for (int i = 1; i <= N; i++)
            for (int j = 1; j <= N; j++)
               if (i * j == N && i <= j) {
               
                  R = i;
                  C = j;
               
               }
      				
         char[][] array = new char[R][C];
       	
         for (int j = 0; j < R; j++)
            for (int i = 0; i < C; i++)
               array[j][i] = x.charAt(i*R + j);
         
         for (int j = 0; j < R; j++)
            for (int i = 0; i < C; i++)
               out.print(array[j][i]);
         
         out.println("");
         
         readFile.close();
         out.close();
         
         System.exit(0);		
      }
   }
