import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.SortedSet;
import java.util.TreeSet;

public class dad2 {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		BufferedReader in = new BufferedReader(new FileReader("scramble.in"));

		String line = in.readLine();

		int count = Integer.parseInt(line);

		String[] sortedNames = new String[count];
		Hashtable<String, String> ht3 = new Hashtable<String, String>();

		SortedSet<String> ss = new TreeSet<String>();
		SortedSet<String> ssR = new TreeSet<String>();

		for (int i = 0; i < count; i++) {
			String original = in.readLine();
			char[] chars = original.toCharArray();
			Arrays.sort(chars);
			String sorted = new String(chars);

			char[] charsR = new char[chars.length];
			for (int j = 0; j < chars.length; j++) {
				charsR[j] = chars[chars.length - j - 1];
			}
			String sortedR = new String(charsR);
			// System.out.println(sorted + " " + sortedR);
			sortedNames[i] = sorted;
			ss.add(sorted);
			ssR.add(sortedR);
			ht3.put(sorted, sortedR);
		}

		System.out.println(ss);
		System.out.println(ssR);
		for (int k = 0; k < count; k++) {
			String now = sortedNames[k];
			int low = ss.headSet(now).size() + 1;
			int high = ssR.headSet(ht3.get(now)).size() + 1;
			if (low > high) {
				int a = high;
				high = low;
				low = a;
			}
			System.out.println(low + " " + high);
		}
	}
}
