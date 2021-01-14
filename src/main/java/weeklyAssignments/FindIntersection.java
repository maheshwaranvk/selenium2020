package weeklyAssignments;

public class FindIntersection {

	public static void main(String[] args) {
		int a[]= {3,2,11,4,6,7};
		int b[]={1,2,8,4,9,7,11,3};
		int c[]= {};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < b.length; j++) {
				
				if (a[i]==b[j])
				{a[i]=b[j];
				}
			}
		}
		
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}

	}

}
