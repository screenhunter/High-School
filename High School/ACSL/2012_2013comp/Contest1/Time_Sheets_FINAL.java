package Contest1;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Rajat Khanna
 * Thomas Jefferson High School for Science and Technology
 * Junior Division
 * Contest #1 2012-2013
 * Time Sheets
 */

   public class Time_Sheets_FINAL {
   
      private static HashMap<String, Double> hm = new HashMap<String, Double>();
      static {
        
         hm.put("1", 9.0);
         hm.put("2", 9.5);
         hm.put("3", 10.0);
         hm.put("4", 10.5);
         hm.put("5", 11.0);
         hm.put("6", 11.5);
         hm.put("7", 12.0);
         hm.put("8", 12.5);
         hm.put("9", 13.0);
         hm.put("A", 13.5);
         hm.put("B", 14.0);
         hm.put("C", 14.5);
         hm.put("D", 15.0);
         hm.put("E", 15.5);
         hm.put("F", 16.0);
         hm.put("G", 16.5);
         hm.put("H", 17.0);
      }
     
      public static void main(String[] args) {
      
         int sum = 0;
      
         DecimalFormat d = new DecimalFormat("$#.00");
      
         Scanner in = new Scanner(System.in);
      
         for (int counter = 1; counter < 5; counter++) {
         
            System.out.println("Please enter input " + counter + ": ");
         
            String line = in.nextLine();
         
            StringTokenizer st = new StringTokenizer(line, ", ");
         
            String loc = st.nextToken();
            String t1 = st.nextToken();
            String t2 = st.nextToken();
         
            double money = calculator(Integer.parseInt(loc), (hm.get(t2) - hm.get(t1)));
         
            if (money > 0) {
            	
               System.out.println(counter + ". " + d.format(money));
               sum += money;
                
            }
				else if (money == 0)
					System.out.println(counter + ". $0.00"); 
            else
               System.out.println("No such location exists : "  + loc);
         
         	
         }
      	if (sum != 0)
         	System.out.println("5. " + d.format(sum));
			else
				System.out.println("5. $0.00");
      
         in.close();
      
      }
   
      private static double calculator(int loc, double z) {
      
         double money = 0;
      
         if (loc < 10)
            money = (10*z);
         else if (loc < 20)
            if (z <= 4)
               money = (8*z);
            else
               money = 8*4 + (12*(z-4));
         else if (loc < 30)
            if (z <= 4)
               money = (12*z);
            else
               money = (12*4 + (24*(z-4)));
         else
            money = -1;
      
         return money;
      
      }
   
   }
