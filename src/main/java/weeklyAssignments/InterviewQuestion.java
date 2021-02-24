package weeklyAssignments;

public class InterviewQuestion {

	
	public static void main(String[] args) {
		
		String[] a= {"9","99","39","999"};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			char[] b = a[i].toCharArray();
			for (int j = 0; j < b.length; j++) {
				String string = Character.toString(b[j]);
				if(string.equalsIgnoreCase("9"))
				{count++;
				}
				else {continue;}
			}
			
			}
		System.out.println(count);
		}
		
		
	}

