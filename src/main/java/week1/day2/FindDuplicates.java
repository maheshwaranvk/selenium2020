package week1.day2;

public class FindDuplicates {

	public static void main(String[] args) {
	
		int a[]={14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		for (int i = 0; i <= a.length-1; i++) {
			int count = 0;
			
			
			for (int j = i+1; j <= a.length-1; j++) {
				if (a[i]==a[j]) {
					count++;
				
				}
				else { continue; }
				if(count > 0) {
				System.out.println(a[i]);}
			}
		}

	}

}