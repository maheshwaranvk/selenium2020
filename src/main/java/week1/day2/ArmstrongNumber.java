package week1.day2;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public void armstrongNumber() {
		
		//Scanner is a Class which is used to get the inpur from the user in Console - Console is the place where we see the output.It is part of java.util.Scanner.
		Scanner getNum = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int input = getNum.nextInt();
		
		int calculated1=0,reminder,original=input;
		
		while (original>0) {
			reminder = original %10;
			calculated1 = calculated1 +(reminder*reminder*reminder);
			original = original / 10;
		}
if (input == calculated1) {
	System.out.println(input + " is an Armstrong Number");
}

else 
{
	System.out.println(input +" is not an Armstrong Number");}
	}

	public static void main(String[] args) {
	
		ArmstrongNumber obj = new ArmstrongNumber();
		obj.armstrongNumber();

	}

}
