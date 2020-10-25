package question30;

import java.util.Scanner;

public class FindMieage {
	
	public static int findMileage(int cc) {
		int mileage = 0;
		if(cc>=100 && cc<=125)
			mileage = 75;
		if(cc>=126 && cc<=135)
			mileage = 70;
		if(cc>=136 && cc<=150)
			mileage = 60;
		if(cc>=151 && cc<=200)
			mileage = 50;
		if(cc>=201 && cc<=220)
			mileage = 35;
		return mileage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cc = sc.nextInt();
		if(cc<100) {
			System.out.println("Number too small");
			return;
		}
		if(cc>220) {
			System.out.println("Number too large");
			return;
		}
		System.out.println(findMileage(cc));
		sc.close();
	}
}
