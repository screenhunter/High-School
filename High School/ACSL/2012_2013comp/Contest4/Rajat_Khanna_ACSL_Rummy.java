package Contest4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Rajat_Khanna_ACSL_Rummy {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> cards = new ArrayList<String>();

		for (int counter = 1; counter <= 5; counter++) {
			
			cards.clear();
			
			System.out.println("Please enter the input seperated by commas and/or spaces:");
			
			StringTokenizer st = new StringTokenizer(in.readLine(), ", ");
			
			while (st.hasMoreElements())
				cards.add(st.nextToken());
			
			ArrayList<String> first = finder(cards);
			System.out.println(first);
			
		}
		
		in.close();
		
	}

	private static ArrayList<String> finder(ArrayList<String> cards) {
		
		ArrayList<String> set = setFinder(cards);
		ArrayList<String> run = runFinder(cards);
		
		if (set == null && run == null)
			return null;
		else if (set == null)
			return run;
		else if (run == null)
			return set;
		else if (set.size() > run.size())
			return set;
		else
			return run;
		
	}

	// finds runs within a list of cards in a hand
	private static ArrayList<String> runFinder(ArrayList<String> cards) {
		
		ArrayList<String> S = new ArrayList<String>();
		ArrayList<String> H = new ArrayList<String>();
		ArrayList<String> C = new ArrayList<String>();
		ArrayList<String> D = new ArrayList<String>();
		
		for (String x: cards)
			if (x.charAt(1) == 'S')
				S.add(x);
			else if (x.charAt(1) == 'H')
				H.add(x);
			else if (x.charAt(1) == 'C')
				C.add(x);
			else if (x.charAt(1) == 'D')
				D.add(x);
		
		S = runner(S);
		H = runner(H);
		C = runner(C);
		D = runner(D);
		
		if (S != null)
			return S;
		else if (H != null)
			return H;
		else if (C != null)
			return C;
		else if (D != null)
			return D;
		
		return null;
	}

	// finds runs within a list that contains cards of the same suit
	private static ArrayList<String> runner(ArrayList<String> list) {
		
		if (list.size() < 3)
			return null;
		
		String[] cards = new String[13];
		for (String x: list) {
			
			if (x.charAt(0) == 'A')
				cards[0] = x;
			else if (x.charAt(0) == 'T')
				cards[9] = x;
			else if (x.charAt(0) == 'J')
				cards[10] = x;
			else if (x.charAt(0) == 'Q')
				cards[11] = x;
			else if (x.charAt(0) == 'K')
				cards[0] = x;
			else
				cards[Integer.parseInt(x.charAt(0) + "") - 1] = x;
			
		}
		
		ArrayList<String> run = null;
		ArrayList<String> temp = new ArrayList<String>();
		
		main: for (int i = 0; i < cards.length; i++) {
			
			temp.clear();
			
			if (cards[i] == null)
				continue;
			
			for (int j = i; j < cards.length; i++)
				if (cards[j] == null)
					continue main;
				else
					temp.add(cards[j]);
			
			if (run != null && run.size() > temp.size())
				continue main;
			else if (temp.size() >= 3)
				run = temp;
			
		}
		
		return run;
		
	}
	
	// finds sets within a list of cards in a hand
	private static ArrayList<String> setFinder(ArrayList<String> cards) {
		
		ArrayList<String> ans = new ArrayList<String>();
		
		ArrayList<String> temp = new ArrayList<String>();
		
		for (String x: cards) {
			
			temp.clear();
			
			char c = x.charAt(0);
			
			for (String y: cards)
				if (y.charAt(0) == c)
					temp.add(y);
			
			if (temp.size() > ans.size())
				ans = temp;
			
		}
		
		if (ans.size() >= 3)
			return ans;
		
		return null;
		
	}

}
