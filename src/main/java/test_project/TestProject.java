package test_project;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Rohan Dodeja
 *
 */
public class TestProject {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		
		

		Calendar cal = Calendar.getInstance();
		Date today = new Date();
		cal.setTime(today);

		cal.add(Calendar.DAY_OF_MONTH, -1);
		
		/*
		 * cal.set(Calendar.HOUR_OF_DAY, 00); cal.set(Calendar.MINUTE, 00);
		 * cal.set(Calendar.SECOND, 00); cal.set(Calendar.MILLISECOND, 000);
		 */
		
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);

//		System.err.println(cal.getTime());
		
		String string2 = "20190123T04:00:53+0300";
		DateFormat df2 = new SimpleDateFormat("yyyymmdd'T'HH:mm:SSSZ");
		Date result2 = df2.parse(string2);
		System.err.println(result2);

	}

}
