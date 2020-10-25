package asgmt7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class FormatChanger {
	public static String changeFormat(String date) {
		String convertedDate="";
		Date date1;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			convertedDate = sdf.format(date1);
			return "Date Converted\n"+convertedDate;
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Not in correct format.");
		}
		return convertedDate;		
	}
}

public class TestFormatChanger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String date;
		System.out.println("Enter date in dd/mm/yyyy");
		date = sc.next();
		System.out.println(FormatChanger.changeFormat(date));
		sc.close();
	}

}
