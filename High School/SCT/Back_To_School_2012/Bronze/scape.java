package Bronze;

/*
PROG: scape
LANG: JAVA
*/
   
   import java.io.*;
   import java.util.*;

   public class scape {
   
      public static void main (String [] args) throws IOException {
      
         Scanner readFile = new Scanner(new File("scape.in"));
         PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("scape.out")));
         
         int H = readFile.nextInt();
         int[] array = new int[H];
      	
         for (int i = 0; i < H; i++)
            array[i] = readFile.nextInt();
            
         int max = 0;
         int temp = 0;
      
         for (int i = 0; i < H; i++) {
         
            temp = array[i];
         	
            int x = 0;
         	
            for (int j = i; j < H; j++)
               if (array[j] >= temp)
                  x++;
               else
                  break;
                  
            for (int j = i - 1; j >= 0; j--)
               if (array[j] >= temp)
                  x++;
               else
                  break;
         			
            if (max < x * temp)
               max = x * temp;		
         
         }
         
         readFile.close();
         out.println(max);
         out.close();
         System.exit(0);	
         		
      }
   }

