package week1.day1;

public class FindFactorial {

	public void factorial() {
		int j=1;
		for (int i=1 ; i<=5 ; i++)
			
		{
			j=j*i;
		}
		
		System.out.println("Factorial of 5 is : " + j);

	}
	public static void main(String[] args) {
	
FindFactorial obj = new FindFactorial();
obj.factorial();

	}

}
