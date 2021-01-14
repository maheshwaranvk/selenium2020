package week3.day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegularExpressions {

	public static void main(String[] args) {
		
		String str ="Amazon have 58000 employees across 18 countires";
		
//		String email = "mahesh@oliyanstudios.com";
//		
//		String pat = "[a-z]+@[a-z]+.[a-z]{2,3}";
//		Pattern compile = Pattern.compile(pat);
//		System.out.println(compile);
//		Matcher matcher = compile.matcher(email);
//		System.out.println(matcher.matches());
		
		String[] split = str.split("\\s");
	//	System.out.println(split.length);
		
		String pat="\\D";
		Pattern compile = Pattern.compile(pat);
		Matcher matcher = compile.matcher(str);
		String replaceAll = matcher.replaceAll("");
		
		System.out.println(replaceAll);
		
		
	}

}
