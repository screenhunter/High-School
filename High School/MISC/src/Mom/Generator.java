package Mom;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Generator {
	
	public static void main(String[] args) {
		
		Scanner readfile = null;
		Boolean b = false;
		
		while (b == false) {
			
			try {
				
				String filename = JOptionPane.showInputDialog("Enter data file (0 to exit)");
				if (filename.contentEquals("0"))
						System.exit(0);
				readfile = new Scanner(new File("E:\\Eclipse Workspace 1.7\\" + filename));
				b = true;
			
			} catch (FileNotFoundException e) {
				
				JOptionPane.showMessageDialog(null,"The file could not be found.");
	            
			}
			
		}
		
		
		ArrayList<String> lines = new ArrayList<String>();
		int length = 0;
		while(readfile.hasNext()) {
			
			lines.add(readfile.nextLine());
			length++;
			
		}
		
		String[] answer = convert(lines, length);
		
		output(answer);

	}
	
	public static String[] convert(ArrayList<String> lines, int length) {
		
		String[] answer = new String[length];
		for (int i = 0; i < length; i++) {
			
			String temp = lines.get(i);
			String[] split = temp.split(",");
			
			split[0] = split[0].trim();
			split[1] = split[1].trim();
			
			answer[i] = "< code=\"" + split[0] + "\" country=\"" + split[1] + "\" >";
			
		}
			
		return answer;
		
	}
	
	public static void output(String[] answer)
    {
       PrintStream outfile = null;
       try{
          outfile = new PrintStream(new FileOutputStream("E:\\Eclipse Workspace 1.7\\output.txt"));
       }
          catch(FileNotFoundException e)
          {
             JOptionPane.showMessageDialog(null,"The file could not be created.");
          } 
       for(int k = 0; k < answer.length; k++)
          outfile.println(answer[k]);
    }

}
