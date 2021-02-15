package weeklyAssignments;

import java.util.Random;

public class LearningRandomNumbers {

	public static void main(String[] args) {
		Random random = new Random();
		int nextInt = random.nextInt(10000);
		
		System.out.println(nextInt);
	}
}
