package weeklyAssignments;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] charArray = test.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if(Character.isLetter(charArray[i])==true) {letter++;}
			
			else if (Character.isSpaceChar(charArray[i])==true) {space++;}
			
			else if (Character.isDigit(charArray[i])==true) {num++;}
			
			else {specialChar++;}
			
		}
		
		System.out.println("Letter : " +letter);
		System.out.println("Space : " + space);
		System.out.println("number : " +num);
		System.out.println("special Character : " +specialChar);

	}

}
