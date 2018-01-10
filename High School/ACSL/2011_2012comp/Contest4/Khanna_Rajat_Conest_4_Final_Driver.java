package Contest4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class Khanna_Rajat_Conest_4_Final_Driver {
	
	public static void main(String[] args) throws IOException {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Please input the expression with no spaces in between characters:");
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			String abc  = input.readLine();

			int count = abc.length()/2;
			List<Symbol> symbols = new ArrayList<Symbol>();
			for (int j = 0; j < count; j++) {
				
				String ope = "" + abc.charAt(2*j+1);
				String var1 = "" + abc.charAt(2*j);
				String var2 = "" + abc.charAt(2*j+2);
				Symbol currSymbol = new Symbol(ope, var1, var2, j);
				symbols.add(currSymbol);
				
			}
			
			List<Symbol> sortedsymbols = sortSymbols(symbols);

			String result = "";
			for (int l = 0; l < sortedsymbols.size(); l++) {
				
				Symbol currSymbol = sortedsymbols.get(l);
				String part1 = getFirstNumbers(symbols, currSymbol);
				String part2 = getSecondNumbers(symbols, currSymbol);
				String currentSymbol = currSymbol.getSymbol();
				
				result = arrangeChars(part1, part2, currentSymbol);
				
				promoteResult(result, currSymbol, symbols);
				
				System.out.println(currSymbol.getPos() + " ---> " + result );
			}
		}
		
	}

	private static void promoteResult(String result, Symbol symbol, List<Symbol> symbols) {
		
		symbol.setResult(result);
		
		for (int i = symbol.getPos(); i >= 0; i--) {
			
			Symbol curr = symbols.get(i);
			String currResult = curr.getResult();
			
			if (currResult != null) {
				
				curr.setResult(result);
				
			} else {
				
				break;
				
			}
			
		}
		
		for (int i = symbol.getPos(); i < symbols.size(); i++) {
			
			Symbol curr = symbols.get(i);
			
			String currResult = curr.getResult();
			if (currResult != null) {
				
				curr.setResult(result);
				
			} else {
				
				break;
				
			}
			
		}
		
	}

	private static String getFirstNumbers(List<Symbol> symbols, Symbol currsymbol) {
		
		String firstNumber = currsymbol.getVar1();
		
		if (currsymbol.getPos() > 0) {
			
			String prevResult = symbols.get(currsymbol.getPos() - 1).getResult();
			
			if (prevResult != null) {
			
				firstNumber = prevResult;
			
			}
			
		}

		return firstNumber;
	}

	private static String getSecondNumbers(List<Symbol> Symbols, Symbol currSymbol) {
		
		String secNumber = currSymbol.getVar2();

		if (currSymbol.getPos() <= Symbols.size() - 2) {
			
			String prevResult = Symbols.get(currSymbol.getPos() + 1).getResult();
			
			if (prevResult != null) {
				
				secNumber = prevResult;
				
			}
			
		}

		return secNumber;
	}

	private static List<Symbol> sortSymbols (List<Symbol> symbols) {
		
		List<Symbol> returnSymbols = new ArrayList<Symbol>();
		String upperClass = "*";
		String lowerClass = "+-";
		
		for (int i = 0; i < symbols.size(); i++) {
			
			Symbol currSymbol = symbols.get(i);
			
			if (upperClass.contains(currSymbol.getSymbol())) {
				
				returnSymbols.add(currSymbol);
				
			}
			
		}
		
		for (int i = 0; i < symbols.size(); i++) {
			
			Symbol currSymbol = symbols.get(i);
			
			if (lowerClass.contains(currSymbol.getSymbol())) {
				
				returnSymbols.add(currSymbol);
			}
			
		}
		
		return returnSymbols;
		
	}

	private static String arrangeChars (String part1, String part2, String currentSymbol) {
		
		return currentSymbol + part1 + part2;
		
	}	

}
