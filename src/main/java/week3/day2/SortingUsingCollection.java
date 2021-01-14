package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	
	public static void main(String[] args) {
		
	String[] a = {"HCL","Wipro","Aspire Systems","CTS"};
	
	List <String> str = new ArrayList<String>();
	for (int i = 0; i < a.length; i++) {
		str.add(a[i]);
	}
	Collections.sort(str);
	System.out.println("ascending order" + str);
	Collections.reverse(str);
	
	System.out.println("descending order" + str);
	
}
}