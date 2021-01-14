package week1.day1;

public class PrimeNumber {

	public void prime() {
	
		int num=13, j=0;
		
		for (int i=2; i<num; i++) {
			if (num%i == 0)
			{
				System.out.println("Number is not a Prime Number");
				j=1;
				break;
			}
			
		}
		if (j==0)
		{System.out.println("Number is Prime Number");}

	}
	public static void main(String[] args) {
PrimeNumber obj = new PrimeNumber();
obj.prime();

	}

}
