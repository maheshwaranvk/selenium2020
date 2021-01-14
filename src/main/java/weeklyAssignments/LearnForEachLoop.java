package weeklyAssignments;

import java.util.ArrayList;
import java.util.List;

public class LearnForEachLoop {

	public static void main(String[] args) {
		
		int[] a= {10,12,58,96};
		for (int i : a) {
			System.out.println(i);
		}
		
String str = "Mahesh";
char[] charArray = str.toCharArray();

for (char c : charArray) {
	System.out.print(c);
}
System.out.println();

String[] str1 = {"Mahesh","Sara","Karthik"};

for (String string : str1) {
	System.out.println(string);
}

List<String> str2 = new ArrayList<String>();

for (String string : str1) {
	str2.add(string);
}
System.out.println("List :"+str2);

	}

}
