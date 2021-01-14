package week3.day2;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesList {

	public static void main(String[] args) {
		
		String str = "PayPal India";
		char[] charArray = str.toCharArray();
		
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		
		for (Character c : charArray) {
			boolean add = charSet.add(c);
		
		if(add==false) {
			dupCharSet.add(c);
		}
		}
		System.out.println(charSet);

		System.out.println(dupCharSet);
	}}