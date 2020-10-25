package asgmt2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ElectricityBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#0.00");
		System.out.println("Enter the previous reading");
		int previousReading = sc.nextInt();
		System.out.println("Enter the current reading");
		int currentReading = sc.nextInt();
		int unitsUsed = currentReading - previousReading;
		double bill = 0;
		if(unitsUsed<30) {
			bill = (float)unitsUsed*2.30;
		}
		else if(unitsUsed>30 && unitsUsed<=100) {
			bill = (30*2.30) + ((unitsUsed-30)*3.50);
		}
		else if(unitsUsed>100) {
			bill = (30*2.30) + (70*3.50) + ((unitsUsed-100)*4.60);
		}
		System.out.println("Bill Amount is "+formatter.format(bill));
		sc.close();
	}

}
