package weeklyAssignments;

import java.io.PrintStream;

import org.testng.annotations.Test;

public class LearningStatic {

	public static String a ="Mahesh";
	public String b = "Non Static";
	
	@Test
	public static void printIt() {
		System.out.println(a);
		//System.out.println(b);
	}
	
	@Test
	public void printMe() {
		System.out.println(a);
		System.out.println(b);
	}
}
