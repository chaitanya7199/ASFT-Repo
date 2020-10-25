package asgmt5;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(date);
		c.add(Calendar.HOUR_OF_DAY, +2);
	    System.out.println("Updated Date = " + c.getTime());
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		c.add(Calendar.MINUTE, -5);
	    System.out.println("Updated Date = " + c.getTime());
	    System.out.println(c.get(Calendar.MINUTE));
	    System.out.println(c.get(Calendar.DATE));
	}

}
