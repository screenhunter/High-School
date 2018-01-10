package Logic1;

import java.io.IOException;

public class Logic1_teaParty {
	
	public static int teaParty(int tea, int candy) {
		
		if (tea < 5 || candy < 5) {
			
			return 0;
			
		} else if (tea >= candy*2 || candy >= tea*2) {
			
			return 2;
			
		} else {
			
			return 1;
			
		}
		  
	}
	
	public static void main (String[] args) throws IOException {
		
		int tea = 12;
		int candy = 13;
		
		System.out.println(teaParty(tea, candy));
		
	}

}
