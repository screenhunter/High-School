package Contest4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class ACSL_STACKS_AND_QUEUES {

	/*
	 * Rajat Khanna
	 * Thomas Jefferson High School for Science and Technology
	 * Junior Division
	 * Contest #4 2009-2010
	 * ACSL_STACKS_AND_QUEUES
	 */

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		for (int counter = 1; counter <= 5; counter++) {

			System.out.println("Please enter the input seperated by commas and/or spaces:");

			StringTokenizer st = new StringTokenizer(in.readLine(), ",");

			String line = st.nextToken().toUpperCase();
			
			List<String> data;
			
			
			boolean b = true;
			
			if (line.equals("S"))
				data = new Stack<String>();
			else {
				
				data = new LinkedList<String>();
				b = false;
				
			}
			
			data.add("A");
			data.add("B");
			data.add("C");
			data.add("D");
			data.add("E");
			
			while (st.hasMoreTokens()) {
				
				String command = st.nextToken().trim();
				String x;
				if (!command.contains("SWH"))
					x = command.substring(4);
				else
					x = "";
				
				if (command.contains("POP"))
					for (int i = 0; i < Integer.parseInt(x); i++)
						if (b)
							((Stack<String>) data).pop();
						else
							data.remove(0);
				else if (command.contains("PSH"))
					if (b)
						((Stack<String>) data).push(x);
					else
						data.add(x);
				else if (command.contains("DUP"))
					for (int i = 0; i < Integer.parseInt(x); i++)
						if (b)
							((Stack<String>) data).push(data.get(i));
						else
							data.add(data.get(i));
				else if (command.contains("SWP"))
					for (int i = 0; i < Integer.parseInt(x); i++) {
						
						String a = data.get(i);
						data.set(i, data.get(data.size() + i - Integer.parseInt(x)));
						data.set(data.size() + i - Integer.parseInt(x), a);
						
					}
				else if (command.contains("SWH"))
					if (b) {
						
						b = false;
						List<String> temp = new LinkedList<String>();
						temp.addAll(data);
						data = temp;
						
					} else {
						
						b = true;
						List<String> temp = new Stack<String>();
						temp.addAll(data);
						data = temp;
						
					}
				else {
					
					String temp = "";
					for (int i = 0; i < Integer.parseInt(x); i++)
						if (b)
							temp = ((Stack<String>) data).pop() + ", " + temp;
						else
							temp += data.remove(0) + ", ";
					
					temp = temp.substring(0, temp.length() - 2);
					
					System.out.println(temp);
					
				}
				
				System.out.println(data + " " + command);
				
			}

		}

	}

}
