package weeklyAssignments;

public class SumOfDigitsFromString {
	
	public void method1() {
		String text = "Tes12Le79af65";
		int sum =0;
		char[] charArray = text.toCharArray();
		
		
		for (int i = 0; i < charArray.length; i++) {
			int numericValue = Character.getNumericValue(charArray[i]);
			sum=sum+numericValue;
		}
System.out.println(sum);
	}
	
	public void method2() {
		String text = "Tes12Le79af65";
		int sum =0;
		char[] charArray = text.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if(Character.isDigit(charArray[i])==true) {
				int numericValue = Character.getNumericValue(charArray[i]);
				sum=sum+numericValue;
			}
			else {continue;}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
	
		SumOfDigitsFromString obj = new SumOfDigitsFromString();
		obj.method1();
		obj.method2();
	}

}
