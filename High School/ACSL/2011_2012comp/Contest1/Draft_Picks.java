   package Contest1;

   import java.util.Scanner;

   public class Draft_Picks {
   
      @SuppressWarnings("resource")
      public static void main(String[] args) {
      
         Scanner readLine = new Scanner(System.in);
      
         int[] years = new int[5];
         double[] salaries = new double[5];
      
      
         double sum = 0;
         int count = 0;
      
         for (int i = 0; i < 5; i++) {
         
            System.out.println("Please enter input #" + (i+1) + ":");
         
            String[] line = readLine.nextLine().split(",");
            years[i] = Integer.parseInt(line[0].trim());
            salaries[i] = Double.parseDouble(line[1].trim()) * 1000000;
         
            sum += (double)salaries[i]/(double)years[i];
         
            if ((double)salaries[i]/(double)years[i] > 10)
               count++;
         
         }
      
         double average = sum/5;
      
         System.out.println("The number of salaries more than 10 million is " + count);
         System.out.println("The average salary per year is " + Math.round(average));
      
         double low16 = salaries[0]/(double)years[0]/16;
         double high18 = salaries[0]/(double)years[0]/18;
      
         for (int i = 0; i < 5; i++) {
         
            if (salaries[i]/(double)years[i]/16 < low16)
               low16 = salaries[i]/(double)years[i]/16;
            if (salaries[i]/(double)years[i]/18 > high18)
               high18 = salaries[i]/(double)years[i]/18;
         
         }
      
         System.out.println("The lowest average salary in a 16-game season is " + Math.round(low16));
         System.out.println("The highest average salary in a 18-game season is " + Math.round(high18));
         System.out.println("THe difference between the average salary in a 16-game season and a 18-game season is " + Math.round(average/16 - average/18));
      
      }
   
   }
