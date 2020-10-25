package question50;

import java.util.Scanner;

public class FeeCalculation {
	
	public static int feeCalculation(int fees, int marks) {
		int updatedFee = 0;
		if(marks > 90)
			updatedFee = (int) (fees - (fees*0.5));
		else if(marks >= 81 && marks <= 90)
			updatedFee = (int) (fees - (fees*0.25));
		else if(marks >= 70 && marks <= 80)
			updatedFee = (int) (fees - (fees*0.1));
		else
			updatedFee = fees;
		return updatedFee;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fees = sc.nextInt();
		int marks = sc.nextInt();
		if(fees < 0 || marks < 0) {
			System.out.println("Invalid array size");
			return;
		}
		if(marks > 100) {
			System.out.println("Invalid mark");
			return;
		}
		if(fees > 32767) {
			System.out.println("Invalid fee");
		}
	    System.out.println(feeCalculation(fees, marks));
		sc.close();
	}
}
