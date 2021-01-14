package week3.day1;

public class SmartPhone extends AndroidPhone {
	
	/*
	 * Classroom1: Create 3 classes - Mobile (methods: sendMsg,makeCall,saveContact)
	 * , AndroidPhone (takeVideo), SmartPhone(connectWhatsApp) - AndroidPhone
	 * extends Mobile and SmartPhone extends AndroidPhone - Create object for
	 * SmartPhone and execute all the methods
	 */
	
	public void connectWhatsapp() {
		System.out.println("Connect Whatsapp from SmartPhone");

	}
	
	public void takeVideo() {
		System.out.println("Take Video from Smart Phone");

	}
	

	public static void main(String[] args) {
		SmartPhone SP = new SmartPhone();
		SP.sendMsg();
		SP.makeCall();
		SP.saveContact();
		SP.takeVideo();
		SP.takeVideo(5);
		SP.connectWhatsapp();
	}
}
