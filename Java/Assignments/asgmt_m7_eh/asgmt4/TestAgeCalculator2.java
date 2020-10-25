package asgmt4;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class AgeCalculator2 {
	
	public static int calculateAge(String dob) throws InvalidDOBException,Exception {
		int years = 0;
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
			years = period.getYears();
			if(years < 0 || year > 2017)
				throw new InvalidDOBException();
			return years;
		} catch (InvalidDOBException e) {
			throw new InvalidDOBException();
		} catch (Exception e) {
			throw new Exception("Date of birth should be in dd/mm/yyyy format");
		}
	}
}

public class TestAgeCalculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DOB");
		String dob = sc.next();
		try {
			System.out.println(AgeCalculator2.calculateAge(dob));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
