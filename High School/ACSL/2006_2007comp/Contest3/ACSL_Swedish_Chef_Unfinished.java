package Contest3;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Rajat Khanna
 * Thomas Jefferson High School for Science and Technology
 * Junior Division
 * Contest #3 2006-2007
 * ACSL Swedish Chef
 */

   public class ACSL_Swedish_Chef_Unfinished {
     
      public static void main(String[] args) throws Exception {
      
    	 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      
         for (int counter = 1; counter < 5; counter++) {
        	 
        	 System.out.println("Please enter the input:");
        	 
        	 String line = in.readLine();
        	 
        	 line = line.toUpperCase();
        	 line = line.replaceAll("AN", "UN");
        	 line = line.replaceAll("AU", "OO");
        	 line = line.substring(0, line.length() - 1).replaceAll("A", "E") + line.substring(line.length() - 1);
        	 line = line.replaceAll("OW", "OO");
        	 line = line.replaceAll("O", "U");
        	 line = line.charAt(0) + line.substring(1).replaceAll("I", "EE");
        	 if (line.substring(line.length() - 2).equals("EN"))
        		 line = line.substring(line.length() - 2) + "EE";
        	 if (line.substring(line.length() - 1).equals("E"))
        		 line += "-A";
        	 line = line.replaceAll("U", "OO");
        	 
        	 System.out.println(line);
        	 
         }
      
         in.close();
      
      }
   
   }
