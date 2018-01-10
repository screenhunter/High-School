package String3;

import java.io.IOException;

public class String3_maxBlock {
	
	public static int maxBlock(String str) {
		 
		int maxSize = 0;
		int tempMax = 0;
		
		if (str.length() > 0) {

			maxSize = 1;
			
		}
		    
		for (int i = 0; i < str.length(); i++) {
		    
			if (str.length() > 0){
		      
				tempMax = 1;
				
		    }
		   
			while (i + 1 < str.length() && str.charAt(i + 1) == str.charAt(i)){
		     
				tempMax++;
				i++;
		     
				if(tempMax > maxSize)
		        
					maxSize = tempMax;
		    
			}
		 
		}
		
		return maxSize;
		
	}

	
	public static void main (String[] args) throws IOException {
		
		String string = "abcba";
	
		System.out.println(maxBlock(string)); 

	}

}
