package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesCollections {
	
public static void main(String[] args) {

//	Declare a String as PayPal India
	String compName="PayPal India";
	
//	Convert it into a character array
	char[] charArray = compName.toCharArray();

//	Declare a Set as charSet for Character
	Set<Character> charSet = new HashSet<Character>();

//	Declare a Set as dupCharSet for duplicate Character
	Set<Character> dupCharSet = new HashSet<Character>();

//	Iterate character array and add it into charSet
	
	for (int i = 0; i < charArray.length; i++) {
	charSet.add(charArray[i]);
	}
	
//	if the character is already in the charSet then, add it to the dupCharSet
	
	for (int i = 0; i < charArray.length; i++) {
		if(charArray[i]==charArray[i+1]) {
			dupCharSet.add(charArray[i]);
		
	}
		else {continue;
	}}
		System.out.println("CharSet"+ charSet);
		System.out.println("dupCharSet"+ dupCharSet);

//	Check the dupCharSet elements and remove those in the charSet

//	Iterate using charSet

//	Check the iterator variable isn't equals to an empty space

//	print each character for charSet
}}


