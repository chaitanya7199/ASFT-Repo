package asgmt6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFormatDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(date));
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MMM/yyyy HH:MM:SS");
		System.out.println(sdf1.format(date));
	}

}
