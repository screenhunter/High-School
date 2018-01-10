package String3;

import java.io.IOException;

public class String3_withoutString {
	
		public static String withoutString(String base, String remove) {
			
			for (int i = 0; i < base.length() - remove.length(); i++) {
				
				if (base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) {
					
					base = base.replace(base.substring(i, i + remove.length()), "");
					
				}
				
			}
			
			return base;	
			
		}
	
	public static void main (String[] args) throws IOException {
		
		String base = "Hello there";
		String remove = "ell";
	
		System.out.println(withoutString(base, remove)); 

	}

}
