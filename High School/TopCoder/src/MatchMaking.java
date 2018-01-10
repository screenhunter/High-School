import java.util.ArrayList;
import java.util.Arrays;

public class MatchMaking {

	public Person[] women, men;
	public int N;

	public String makeMatch(String[] namesWomen, String[] answersWomen, String[] namesMen, String[] answersMen, String queryWoman) {
		
		N = namesWomen.length;
		women = new Person[N];
		men = new Person[N];
		ArrayList<String> taken = new ArrayList<String>();
		
		for (int i = 0; i < N; i++)
			women[i] = new Person(namesWomen[i], answersWomen[i]);
		for (int i = 0; i < N; i++)
			men[i] = new Person(namesMen[i], answersMen[i]);
		
		Arrays.sort(women);
		Arrays.sort(men);
		
		for (int i = 0; i < N; i++) {
			
			int max = Integer.MIN_VALUE;
			int index = 0;
			for (int j = 0; j < N; j++) {
				
				int temp = compare(men[j].ans, women[i].ans);
				
				if (!taken.contains(men[j].name) && temp > max) {
					
					max = temp;
					index = j;
					
				}
				
			}
			
			if (women[i].name.equals(queryWoman))
				return men[index].name;
			
			taken.add(men[index].name);
			
		}
		
		return null;
		
	}

	public int compare(String a, String b) {

		int count = 0;
		for (int i = 0; i < a.length(); i++)
			if (a.charAt(i) == b.charAt(i))
				count++;

		return count;

	}

}

class Person implements Comparable<Person> {

	public String name, ans;

	public Person(String a, String b) {

		name = a;
		ans = b;

	}

	public int compareTo(Person o) {

		return name.compareTo(o.name);

	}

}
