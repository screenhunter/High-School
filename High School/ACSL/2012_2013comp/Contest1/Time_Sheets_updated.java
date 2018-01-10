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

   public class Time_Sheets_updated {
   
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
      
//         String[] timings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H"};
      
         Scanner in = new Scanner(System.in);
      
         for (int counter = 1; counter < 5; counter++) {
         
            System.out.println("Please enter the " + counter + " input: ");

            String line = in.nextLine();
//            String[] lineA = null;

            StringTokenizer st = new StringTokenizer(line, ", ");

//            if (line.contains(","))
//            	lineA = line.split(",");
//            else
//            	lineA = line.split(" ");
//            String t1 = lineA[1].trim();
//            String t2 = lineA[2].trim();
            String loc = st.nextToken();
            String t1 = st.nextToken();
            String t2 = st.nextToken();
         
//            double x = 0;
//            double y = 0;
         
//            for (int i = 0; i < timings.length; i++) {
//            
//               if (t1.equalsIgnoreCase(timings[i]))
//                  x = i;
//            
//               if (t2.equalsIgnoreCase(timings[i]))
//                  y = i;
//            
//            }
         
//            double money = calculator(Integer.parseInt(lineA[0].trim()), (y-x)/2);
//            double money = calculator(Integer.parseInt(loc), (y-x)/2);
            double money = calculator(Integer.parseInt(loc), (hm.get(t2) - hm.get(t1)));

            if (money >= 0) {
            	System.out.println(counter + ". " + d.format(money));
                sum += money;
            } else
            	System.out.println("No such location exists : "  + loc);
         
         	
         }
      
         System.out.println("5. " + d.format(sum));
      
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
