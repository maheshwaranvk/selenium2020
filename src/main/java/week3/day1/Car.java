package week3.day1;

public class Car extends Vehicle{
	
	public void soundhorn() {
		System.out.println("Sound Horn : Car");

	}

	public static void main(String[] args) {
		Car obj = new Car();
		obj.soundhorn();
		obj.soundhorn();

	}

}
