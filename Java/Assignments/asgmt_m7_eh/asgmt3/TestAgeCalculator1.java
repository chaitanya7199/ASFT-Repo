package asgmt3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class AgeCalculator {
	
	public int calculateAge(String dob) throws Exception {
		int years = 0;
		Date date;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			int year = c.get(Calendar.YEAR);
			int month = 1 + c.get(Calendar.MONTH);
			int day =  c.get(Calendar.DAY_OF_MONTH);
			LocalDate currentDate = LocalDate.now();
			LocalDate birthDate = LocalDate.of(year, month, day);
			Period period = birthDate.until(currentDate);
			years = period.getYears();
			return years;
		} catch (Exception e) {
			throw new Exception("Date of birth should be in dd/mm/yyyy format");
		}
	}
}

public class TestAgeCalculator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DOB");
		String dob = sc.next();
		AgeCalculator ac = new AgeCalculator();
		try {
			System.out.println(ac.calculateAge(dob));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
