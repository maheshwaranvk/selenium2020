package weeklyAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		
		if (text1.length() == text2.length()) {
 List <Character> textList = new ArrayList<Character>();
 List <Character> textList2 = new ArrayList<Character>();
 char[] charArray = text1.toCharArray();
 char[] charArray2 = text2.toCharArray();

 for (int i = 0; i < charArray.length; i++) {
	 textList.add(charArray[i]);
}
 
 for (int i = 0; i < charArray2.length; i++) {
	 textList2.add(charArray[i]);
}
 Collections.sort(textList);
 Collections.sort(textList2);
 
 boolean equals = textList.equals(textList2);
if(equals == true) {
 
System.out.println("Both are Anagram");
	}
else {
	System.out.println("Both are not Anagram");
}}else {
	System.out.println("Both are not Anagram");}
	}}
