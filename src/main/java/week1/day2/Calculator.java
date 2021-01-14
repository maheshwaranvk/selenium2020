package week1.day2;

public class Calculator {

	public int add(int num1,int num2, int num3) {
		int sum = num1 + num2 + num3;
		
		return sum;
	}
	
	public int sub(int num1,int num2) {
	int subr = num1 - num2;
	
	return subr;

	}
	
	public int mul(int num1,int num2) {
    
		int mult = num1*num2;
		return mult;

	}
	
	public int div(int num1, int num2) {
		int divd = num1/num2;
		return divd;

	}

	//All the methods are just declared in this class, these methods will be called in myCalculator class
}
