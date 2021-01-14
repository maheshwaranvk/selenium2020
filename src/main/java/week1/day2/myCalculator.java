package week1.day2;

public class myCalculator {

	public static void main(String[] args) {
	
		Calculator cal = new Calculator();
		System.out.println("Addition : " + cal.add(1, 2, 3));
		System.out.println("Subraction : " + cal.sub(3, 2));
		System.out.println("Multiplication : " + cal.mul(2, 3));
		System.out.println("Divition : " + cal.div(10, 5));
		
		// all the methods were declared in Calculator class.

	}

}
