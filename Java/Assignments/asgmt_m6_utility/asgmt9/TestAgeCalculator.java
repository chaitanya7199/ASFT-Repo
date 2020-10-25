package asgmt9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class AgeCalculator {
	public static String calculateAge(String dob) {
		String age = "";
		Date date;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			int year = c.get(Calendar.YEAR);
			int month = 1 + c.get(Calendar.MONTH);
			int day =  c.get(Calendar.DAY_OF_MONTH);
			LocalDate currentDate = LocalDate.of(2017, 2, 15);
			LocalDate birthDate = LocalDate.of(year, month, day);
			Period period = birthDate.until(currentDate);
			age = period.getYears() + " year(s) " + period.getMonths() + " month(s)";
			return age;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return age;
	}
}

public class TestAgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String dob;
		System.out.println("Enter DOB");
		dob = sc.next();
		System.out.println(AgeCalculator.calculateAge(dob));
		sc.close();
	}

}
