package week1.day1;

public class myMobile {
	
	public void sendSms() {
		System.out.println("Message Sent");

	}
	
	public void makeCall() {
		System.out.println("Call Connected");

	}

	public static void main(String[] args) {
		myMobile obj = new myMobile();
		
		//Methods
		obj.sendSms();
		obj.makeCall();
		
		//VariableDeclration
		String phoneBrand = "Samsung";
		double phoneSize = 5.5;
		boolean isSmartPhone = true;
		long phNo = 9629433877L;
		String modelNumber ="M30s";
		int phonePrice = 15000;
		String simType ="5G";
		
		//PrintingVariables
		System.out.println(phoneBrand);
		System.out.println(phoneSize);
		System.out.println(isSmartPhone);
		System.out.println(phNo);
		System.out.println(modelNumber);
		System.out.println(phonePrice);
		System.out.println(simType);

	}

}
