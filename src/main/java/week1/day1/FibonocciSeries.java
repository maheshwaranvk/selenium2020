package week1.day1;

public class FibonocciSeries {
	
	public void findFibonocci() {
		
		int range = 15 , firstnum = 0 , secnum = 1, sum=0;
		
		System.out.println(firstnum);
		System.out.println(secnum);
		
		for (int i=1; i<=range ; i++) {
			
			sum = firstnum + secnum;
			firstnum = secnum;
			secnum = sum;
			
			System.out.println(sum);
		}

	}

	public static void main(String[] args) {
	
	FibonocciSeries obj = new FibonocciSeries();
	obj.findFibonocci();

	}

}
