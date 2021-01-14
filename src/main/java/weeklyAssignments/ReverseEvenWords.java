package weeklyAssignments;

import java.util.ArrayList;
import java.util.List;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] split = test.split(" ");
//		
//		for (int i = 0; i < split.length; i++) {
//			
//	
//		System.out.println(split[i]);
//		}
		
		for (int i = 0; i < split.length; i++) {
			if(i%2!=0) {
				List <Character> temp = new ArrayList<Character>();
				char[] charArray = split[i].toCharArray();
				
				for (int j = charArray.length-1; j >=0; j--) {
					System.out.print(charArray[j]);
				}
				
			//	System.out.print(temp);
				//String string = temp.toString();
			//	System.out.println(string);
				//string.replace(",", " ");
				//System.out.println(string);
//				String.join(",", string);
//				String string = temp.toString();
//				String.join("", string);
//				System.out.println(string);
			}
			
			else {System.out.println(split[i]);}}}}