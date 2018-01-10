public class UserName {
	
	public String newMember(String[] existingNames, String newName) {
		
		String add = "";
		int count = 0;
		
		for (int i = 0; i < existingNames.length; i++) {
			
			if (existingNames[i].equals(newName + add)) {
				
				count++;
				add = count + "";
				
			}
			
		}
		
		return newName + add;
		
	}

}
