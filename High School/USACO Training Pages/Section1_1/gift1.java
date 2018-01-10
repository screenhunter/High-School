
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/*
ID: khanna.1
LANG: JAVA
TASK: gift1
 */

class gift1 {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main (String[] args) throws IOException {
		
		//input file
		BufferedReader input = new BufferedReader(new FileReader("gift1.in"));
		
		//output file
		PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
		
		//read first line
		String persons = input.readLine();
		int NP = Integer.parseInt(persons);
		
		String[] names = null;
		names = new String[NP];
		
		for (int i = 0; i < NP; i++) {
			names[i] = input.readLine();
			//System.out.println( i + "  " + names[i]);
			
		}
		
		//System.out.println(names);
		person[] People = new person[NP];
		
		for (int i = 0; i < NP; i++) {
			
			String name = input.readLine();
			person currPerson = new person(name);
			
			String numbers = input.readLine();
			String[] Numbers  = numbers.split(" ");
			
			String amount = Numbers[0];
			int Amount = Integer.parseInt(amount);
			String peoples = Numbers[1];
			int Peoples = Integer.parseInt(peoples);
			
			int given = 0;
			if (Peoples != 0) {
				
				given = Amount/Peoples;
				
			} else {
				
				given = 0;
				
			}

			currPerson.setInitialAmount(Amount);
			currPerson.setNumberOfPersons(Peoples);
			currPerson.setAmountGiven(given);
			
			int remainder = Amount - (Peoples * given);
			currPerson.setFinalBalance(remainder);
			//System.out.println(currPerson.getName() + " " + given + "  " + Peoples + "  " + Amount + "  " + remainder);
			
			ArrayList<String> recipients = new ArrayList<String>();
			
			for (int j = 0; j < Peoples; j++) {
				
				String recipient = input.readLine();
				recipients.add(recipient);
				
			}
			
			currPerson.setRecipientsName(recipients);
			
			People[i] = currPerson;
			
		}
		
		for (int k = 0; k < NP; k++) {
			
			person curr = People[k];
			
			for (int l = 0; l < curr.getNumberOfPersons(); l++) {
				
				String rName = curr.getRecipientsName().get(l);
				person gPer = getGiftedPerson(People, rName);
				gPer.setFinalBalance(gPer.getFinalBalance()+curr.getAmountGiven());
				//getGiftedPerson(People, rName).setFinalBalance(getGiftedPerson(People, rName).getFinalBalance() + curr.getAmountGiven());
				
			}
			
		}
		
		//System.out.println(People);
		for (int i = 0; i < NP; i++) {
			
			String rName = names[i];
			//System.out.println("  " + i + "  " + rName);
			person curr = getGiftedPerson(People, rName);
			output.println((curr.getName() + " " + (curr.getFinalBalance() - curr.getInitialAmount())));
			
		}
		
		input.close();
		output.close();
		System.exit(0);

	}
	
	private static person getGiftedPerson(person[] people, String recipient) {
		
		person giftedPerson = null;
		
		for (int i = 0; i < people.length; i++) {
			
			if (people[i].getName().equals(recipient)) {
				
				giftedPerson = people[i];
				break;
				
			}
			
		}
		//System.out.println("--->" + recipient + "  " + giftedPerson);
		return giftedPerson;
	}

	private static class person {
		
		String name = "";
		int initialAmount = 0;
		int numberOfPersons = 0;
		int amountGiven = 0;
		int finalBalance = 0;
		private ArrayList<String> recipientsName = null;

		public person (String name) {
			
			setName(name);
			
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getInitialAmount() {
			return initialAmount;
		}
		public void setInitialAmount(int initialAmount) {
			this.initialAmount = initialAmount;
		}
		public int getNumberOfPersons() {
			return numberOfPersons;
		}
		public void setNumberOfPersons(int numberOfPersons) {
			this.numberOfPersons = numberOfPersons;
		}
		public int getAmountGiven() {
			return amountGiven;
		}
		public void setAmountGiven(int amountGiven) {
			this.amountGiven = amountGiven;
		}
		public int getFinalBalance() {
			return finalBalance;
		}
		public void setFinalBalance(int finalBalance) {
			this.finalBalance = finalBalance;
		}

		public void setRecipientsName(ArrayList<String> recipientsName) {
			this.recipientsName = recipientsName;
		}

		public ArrayList<String> getRecipientsName() {
			return recipientsName;
		}
		
	}

}