package weeklyAssignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LearningDatesHandling {

	public static void main(String[] args) throws ParseException {
String dob = "09/15/1985";
		
		SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
		Date date1=date.parse(dob);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date1);
		int j = cal.get(Calendar.DAY_OF_MONTH);
		int i = cal.get(Calendar.MONTH);
		int k = cal.get(Calendar.YEAR);
		System.out.println(j);
		System.out.println(i);
		System.out.println(k);

	}

}
