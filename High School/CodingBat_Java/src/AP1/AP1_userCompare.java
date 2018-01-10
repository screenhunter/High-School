package AP1;

import java.io.IOException;

public class AP1_userCompare {
	
	public static int userCompare(String aName, int aId, String bName, int bId) {
		
		if (aName.compareTo(bName) == 0) {
			
			if (aId == bId) {
				
				return 0;
				
			} else if (aId < bId) {
				
				return -1;
				
			} else {
				
				return 1;
				
			}
			
		} else if (aName.compareTo(bName) > 0) {
			
			return 1;
			
		} else {
			
			return -1;
			
		}
		  
	}
	
	public static void main(String[] args) throws IOException {

		String aName = "b";
		int aId = 1;
		String bName = "a";
		int bId = 1;
		
		System.out.println(userCompare(aName, aId,bName,bId));

	}

}
