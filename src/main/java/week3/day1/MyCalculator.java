package week3.day1;

public class MyCalculator {
	
	//add
		public void add( int a , int b) {
		System.out.println("Add 2 :"+ (a+b));

	}
	
		public void add(int a , int b , int c) {
		System.out.println("Add 3 :"+(a+b+c));}
	
	//multiply
		public void mul( int a , int b) {
			System.out.println("Mul int : " + (a*b) );

		}
		
		public void mul(int a , double b) {
			System.out.println("Mul int doa : " + (a*b));}
		
	//Sub
		public void sub(int a , int b) {
			
			System.out.println("Sub int : "+(a-b));

		}
		public void sub(double a , double b) {
			System.out.println(" Sub  doa :" +(a-b));

		}
		
	//Divide
		public void div(int a , int b) {
			
			System.out.println("Div int : " + (a/b));

		}
		
		public void div(int a , double b) {
			System.out.println("Div int doa : "+(a/b));

		}
		
		

	public static void main(String[] args) {
		
		MyCalculator obj = new MyCalculator();
		
		obj.add(10, 15);
		obj.add(10, 15, 20);
		
		obj.sub(3265895.2, 1236.54);
		obj.sub(10, 5);
		
		obj.mul(10, 10);
		obj.mul(10, 358.415645);
		
		obj.div(158, 358415.645);
		obj.div(10, 5);
		
		
	}
	
}
