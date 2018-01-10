package Bronze;

   /*
PROG: hershey
LANG: Java
*/
   
   import java.io.*;
import java.util.*;

   public class hershey {
	   
	public static void main (String [] args) throws IOException {
      
         Scanner readFile = new Scanner(new File("hershey.in"));
         PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("hershey.out")));
      
         int x = readFile.nextInt();
         
         int max = 0;
      
         for (int i = 0; i < x; i++)
            if ((x-i + 1) * (i+1) > max)
               max = (x-i + 1) * (i + 1);
         
         readFile.close();
         out.println(max);
         out.close();
         
         System.exit(0);
      
      }
   
   }
