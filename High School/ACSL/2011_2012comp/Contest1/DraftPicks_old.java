package Contest1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DraftPicks_old {

	public static void main(String args[]) {

		int[] contractYears = new int[5];
		double[] contractAmounts = new double[5];

		// open up standard input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String data = null;
		String[] vals = null;
		try {
			// For the first contract
			System.out.print("Please Enter 1st Contract Year and Contract Amount: ");
			data = br.readLine();

			if (data.contains(",")) {
				vals = data.split(",");
			} else {
				vals = data.split(" ");
			}
			
			contractYears[0] = Integer.parseInt(vals[0].trim());
			contractAmounts[0] = Double.parseDouble(vals[1].trim());

			//System.out.println("The read data is " + contractYears[0]);

			// For the second contract
			System.out.print("Please Enter 2nd Contract Year and Contract Amount: ");
			data = br.readLine();

			if (data.contains(",")) {
				vals = data.split(",");
			} else {
				vals = data.split(" ");
			}
			
			contractYears[1] = Integer.parseInt(vals[0].trim());
			contractAmounts[1] = Double.parseDouble(vals[1].trim());

			//System.out.println("The read data is " + contractYears[1]);

			// For the third contract
			System.out.print("Please Enter 3rd Contract Year and Contract Amount: ");
			data = br.readLine();

			if (data.contains(",")) {
				vals = data.split(",");
			} else {
				vals = data.split(" ");
			}
			
			contractYears[2] = Integer.parseInt(vals[0].trim());
			contractAmounts[2] = Double.parseDouble(vals[1].trim());

			//System.out.println("The read data is " + contractYears[2]);
			
			// For the fourth contract
			System.out.print("Please Enter 4th Contract Year and Contract Amount: ");
			data = br.readLine();

			if (data.contains(",")) {
				vals = data.split(",");
			} else {
				vals = data.split(" ");
			}
			
			contractYears[3] = Integer.parseInt(vals[0].trim());
			contractAmounts[3] = Double.parseDouble(vals[1].trim());

			//System.out.println("The read data is " + contractYears[3]);
			
			// For the fifth contract
			System.out.print("Please Enter 5th Contract Year and Contract Amount: ");
			data = br.readLine();

			if (data.contains(",")) {
				vals = data.split(",");
			} else {
				vals = data.split(" ");
			}
			
			contractYears[4] = Integer.parseInt(vals[0].trim());
			contractAmounts[4] = Double.parseDouble(vals[1].trim());

			//System.out.println("The read data is " + contractYears[4]);
			performSolution(contractAmounts, contractYears);
			

			
		} catch (IOException ioe) {
			System.out.println("IO error trying to read your name!");
			System.exit(1);
		}
	}

	private static void performSolution(double[] contractAmounts,
			int[] contractYears) {
		double[] annualSalaries = new double[5];
		annualSalaries[0] = contractAmounts[0]/contractYears[0];
		annualSalaries[1] = contractAmounts[1]/contractYears[1];
		annualSalaries[2] = contractAmounts[2]/contractYears[2];
		annualSalaries[3] = contractAmounts[3]/contractYears[3];
		annualSalaries[4] = contractAmounts[4]/contractYears[4];
		
		/************************************************************************
		 *                                                                      *
		 *             PROCESSING BLOCK FOR FIRST OBJECTIVE                     *
		 *                                                                      *
		 ***********************************************************************/
		int counter = 0;
		for (int i = 0; i < 5; i++) {
			if (annualSalaries[i] > 10) {
				counter++;
			}
		}
		
		// The First OBJECTIVE 
		System.out.println("The # of salaries > 10 Million: " + counter);

		
		/************************************************************************
		 *                                                                      *
		 *             PROCESSING BLOCK FOR SECOND OBJECTIVE                     *
		 *                                                                      *
		 ***********************************************************************/
		double averageAnnual = 0.0;
		
		averageAnnual = (annualSalaries[0]+annualSalaries[1]+annualSalaries[2]+annualSalaries[3]+annualSalaries[4])/5;
		averageAnnual = averageAnnual * (1000000);
		
		averageAnnual = Math.round(averageAnnual);
		
		// The Second OBJECTIVE 
		System.out.println("Average Annual Salary is: " + new Double(averageAnnual).longValue());
		
		
		
		/************************************************************************
		 *                                                                      *
		 *             PROCESSING BLOCK FOR THIRD OBJECTIVE                     *
		 *                                                                      *
		 ***********************************************************************/
		double lowest16SeasonSalary = 0;
		for (int i = 0; i < 5; i++) {
			double sal = (annualSalaries[i]*1000000)/16;

			if (i == 0) {
				lowest16SeasonSalary = sal;
			}

			if (sal < lowest16SeasonSalary) {
				lowest16SeasonSalary = sal;
			}
		}

		// The Third Objective
		System.out.println("Lowest per Game 16-game season salary : " + Math.round(lowest16SeasonSalary));

		
		/************************************************************************
		 *                                                                      *
		 *             PROCESSING BLOCK FOR FOURTH OBJECTIVE                     *
		 *                                                                      *
		 ***********************************************************************/
		double highest18SeasonSalary = 0;
		for (int i = 0; i < 5; i++) {
			double sal = (annualSalaries[i]*1000000)/18;

			if (i == 0) {
				highest18SeasonSalary = sal;
			}

			if (sal > highest18SeasonSalary) {
				highest18SeasonSalary = sal;
			}
		}

		// The Fourth Objective
		System.out.println("Highest per Game 18-game season salary : " + Math.round(highest18SeasonSalary));

		
		/************************************************************************
		 *                                                                      *
		 *             PROCESSING BLOCK FOR FIFTH OBJECTIVE                     *
		 *                                                                      *
		 ***********************************************************************/
		long average16GamePerGame = Math.round(averageAnnual/16);
		long average18GamePerGame = Math.round(averageAnnual/18);

		// The Fifth Objective
		System.out.println("The difference between the average salary per game in a 16-game season versus an 18-game season : " + (average16GamePerGame - average18GamePerGame));

		
	}
}
