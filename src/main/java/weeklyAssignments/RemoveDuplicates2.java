package weeklyAssignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates2 {

	
	public static void main(String[] args) {
		
		String text = "PayPal India"; 
		String text1 = text.replaceAll("//s", ""); 
		
		char[] charArray = text1.toCharArray(); 
		Set<Character> charset = new LinkedHashSet<Character>();
		Set<Character> dupCharset = new LinkedHashSet<Character>();
		
		for (Character c : charArray) {
			boolean add = charset.add(c); 
			if(add==false) { 
				dupCharset.add(c);
			} 
			} 
		System.out.println("The duplicate characters: "+ dupCharset); 
		charset.removeAll(dupCharset); 
		System.out.println("The characterset after duplicates: "+ charset); 
		} 
	
		
	

	}