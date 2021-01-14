package week1.day2;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		
		int a[]={3,2,11,4,6,7};
		Arrays.sort(a);
		
		System.out.println(a[(a.length)-2]);

	}

}
