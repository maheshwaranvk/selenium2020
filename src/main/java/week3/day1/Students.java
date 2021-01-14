package week3.day1;
//Interface
public class Students {

	public void studentName(String name) {
		
		System.out.println("Name is : " + name);

	}
	
	public void studentID( int id) {
		
		System.out.println("Id is : " + id);
	}
	
	public void studentEmail(String email) {
		System.out.println("Email is : "+email);

	}
	public void studentPhn(long phn) {
		System.out.println("Student Phone Number is : " + phn);

	}
	public static void main(String[] args) {
		Students obj = new Students();
		obj.studentName("Mahesh");
		obj.studentID(5263256);
		obj.studentPhn(9629433877L);
		obj.studentEmail("vkmaheshwaran@gmail.com");
	}
}
