package question45;

import java.util.Scanner;

public class SalaryCalculation {
	
	public static float calculateGross(int salary, int days) {
		int bonus = (days/31) * 500;
		float gross = (float) (salary + (0.5*salary) + (0.75*salary) + bonus);		
		return gross;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		int days = sc.nextInt();
		if(salary < 0 || salary  > 10000) {
			System.out.println("Invalid Input");
			return;
		}if(days < 0 || days  > 31 ||  days == 0) {
			System.out.println("Invalid Input");
			return;
		}
	    System.out.format("%.2f",calculateGross(salary, days));
		sc.close();
	}
}
