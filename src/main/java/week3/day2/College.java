package week3.day2;
//Interface
public class College extends University {

	public void ug() {
		System.out.println("ug in University");
		
	}
	
	public static void main(String[] args) {
		College obj = new College();
		obj.ug();
		obj.pg();
	}

	
}
