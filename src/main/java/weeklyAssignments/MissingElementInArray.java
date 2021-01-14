package weeklyAssignments;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {

		int a[]= {1,6,2,4,3,7,8};
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]!=i+1) {
				System.out.println(i+1);
				break;
			}
		}

	}

}
