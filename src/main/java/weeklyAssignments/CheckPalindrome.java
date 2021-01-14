package weeklyAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckPalindrome {

	public static void main(String[] args) {
String str = "tenet";

List <Character> listValue = new ArrayList<Character>();
List <Character> duplistValue = new ArrayList<Character>();

char[] charArray = str.toCharArray();

for (int i = 0; i < charArray.length; i++) {
	listValue.add(charArray[i]);
	duplistValue.add(charArray[i]);
}
Collections.reverse(listValue);

//System.out.println(listValue);
//System.out.println(duplistValue);

boolean equals = listValue.equals(duplistValue);

if(equals == true) {System.out.println("given string is Palindrome");}
else {System.out.println("given string is not palindrome");
}

	}

}
