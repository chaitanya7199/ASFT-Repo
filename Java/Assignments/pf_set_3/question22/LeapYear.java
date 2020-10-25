package question22;

import java.util.Scanner;

public class LeapYear {

	public static int checkLeapYear(int year) {
		if(year<0)
			return -1;
		if(year%4==0) {
			if(year%100==0 && year%400==0)
				return 1;
			else if(year%100!=0)
				return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int answer = checkLeapYear(year);
		System.out.println(answer==1 ? "yes" : answer==0 ? "no" : "Invalid Input");
		sc.close();
	}
}
