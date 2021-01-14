package weeklyAssignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
	
int a[]={4,6,4,2,9,2,8,10};
int b[] = {};

for (int i = 0; i < a.length; i++) {
	
	for (int j = 0; j < a.length; j++) {
			
	if (a[i]==a[j+1]) {
		continue;
	}
	else {
		b[i]=a[i];
	}
}
	}

for (int k = 0; k < b.length; k++) {
	System.out.println(b[k]);
}

}
}