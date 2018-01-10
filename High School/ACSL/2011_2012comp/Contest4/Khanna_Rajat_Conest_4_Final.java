package Contest4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Khanna_Rajat_Conest_4_Final {
	
	public static void main(String[] args) throws IOException {
		
		for (int i = 0; i < 5; i++) { //Redo five times, one for each input
			
			System.out.println("Please input the expression with no spaces in between characters:");
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			String abc  = input.readLine(); //Read input
			
			List<String> symbols = new ArrayList<String>(); //Initialize a list containing the operators in the expression
			List<String> numbers = new ArrayList<String>(); //Initialize a list containing the numbers in the expression
			
			int j = 1;
			while (j < abc.length()) { //Check the entire list
				
				symbols.add("" + abc.charAt(j)); //Add each symbol to the list; Add "" to convert char into string
				j = j+2; //Symbols appear every other character in the expression; j starts at one because the first symbol appears after the first character
				
			}
			
			int k = 0;
			while (k < abc.length()) { //Check the entire list
				
				numbers.add("" + abc.charAt(k)); //Add each number to the list; Add "" to convert char into string
				k = k+2; //Numbers appear every other character in the expression; k starts at 0 for the first char in the string is a number
				
			}
			
			List<String> sortedSymbols = sortSymbols(symbols); //sort symbols according to order of operations
			
			String result = "";
			for (int l = 0; l < sortedSymbols.size(); l++) { //Run until the entire list is exhausted
				
				String currentSymbol = sortedSymbols.get(l); //Obtain the symbol from the list (corresponding to the number for which we are searching)
				
				int position = getSymbolPosition(symbols, currentSymbol); //Get the numerical position of the symbol
				String part1 = numbers.get(position); //Obtain the first number that is attached to the current symbol we are working with
				String part2 = numbers.get(position + 1); //Obtain the second number that is attached to the current symbol we are working with
				
				System.out.println("" + position + " The numbers and symbols are " + part1  + " " + part2 + " " + currentSymbol);
				
				result = arrangeChars(part1, part2, currentSymbol); //Arrange the the expression into prefix notation
				
				//The following code will put the arranged expression back into the list in order to save the results so the program can arrange the entire original expression into prefix notation
				numbers.set(position, result);
				numbers.set(position+1, result);
				
				System.out.println( position + " ---" + result + numbers
						); //Print the final arranged expression (which has been arranged into prefix notation)
			}
			
			System.out.println(result); //Print the final arranged expression (which has been arranged into prefix notation)
			
		}
		
	}
	
	private static String arrangeChars (String part1, String part2, String currentSymbol) {
		
		return currentSymbol + part1 + part2; //Orders the expression in "symbol", "number1", "number2" (prefix notation); puts all strings into one string
		
	}
	
	private static int getSymbolPosition (List<String> symbols, String symbol) {
		
		int position = 0; //This variable will be used to denote the position of the symbol
		
		for (int i = 0; i < symbols.size(); i++) { //Check for each symbol on the list
			
			String currentSymbol = symbols.get(i); //Obtain the current symbol
			
			if (currentSymbol.equals(symbol)) { //If the current Symbol is the same as the symbol we are checking for...
				
				position = i; //...then identify the position of the symbol...
				symbols.set(i, ""); //...and replace the symbol in the list with a blank in order to not revisit the it again...
				break; //...and get out of the if loop, for we have identified the position of the symbol
				
			}
			
		}
		
		return position; //Return the numerical position of the symbol in the list
		
	}
	
	private static List<String> sortSymbols (List<String> symbols) {
		
		List<String> returnSymbols = new ArrayList<String>(); //Intialize a list which will be used to store the symbols in order
		String upperClass = "*"; //Initialize string containing the upper class symbols
		String lowerClass = "+-"; //Initialize string containing the lower class symbols
		
		//The following code searches for the upper class symbols and sorts accordingly
		for (int i = 0; i < symbols.size(); i++) { //Search once for each symbol on the list
			
			String sym = symbols.get(i); //Put the symbol into a string so it can be searched for within the upper class symbols
			
			if (upperClass.contains(sym)) { //If the symbol is a part of the string "upperClass"...
				
				returnSymbols.add(sym); //...then add it to the highest slot available in "returnSymbols"
				//Note: The "upperClass" string is tested first for they take precedence over the characters contained in "lowerClass"
				
			}
			
		}
		
		//The following code searches for the lower class symbols and sorts accordingly
		for (int i = 0; i < symbols.size(); i++) { //Search once for each symbol on the list
			
			String sym = symbols.get(i); //Put the symbol into a string so it can be searched for within the lower class symbols
			
			if (lowerClass.contains(sym)) { //If the symbol is a part of the string "lowerClass"...
				
				returnSymbols.add(sym); //...then add it to the highest slot available in "returnSymbols"
				
			}
			
		}
		
		return returnSymbols; //Return the ordered list
		
	}

}
