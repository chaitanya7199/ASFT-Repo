package question1;

import java.util.Scanner;

public class CalculateSal {
	
	public static int calculateSal(int salary, int shifts) {
		int savings = salary - (int)(salary*0.2) - (int)(salary*0.3) + (int)(salary*0.02*shifts);
		return savings;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		int shifts = sc.nextInt();
		sc.close();
		if(salary > 8000) {
			System.out.println("Salary too large");
			return;
		}
		if(shifts<0) {
			System.out.println("Shifts too small");
			return;
		}
		if(salary<0) {
			System.out.println("Salary too small");
			return;
		}
		int savings = calculateSal(salary, shifts);
		System.out.println(savings);
	}

}
