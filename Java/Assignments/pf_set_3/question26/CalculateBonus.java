package question26;

import java.util.Scanner;

public class CalculateBonus {
	
	public static float calculateBonus(int salary) {
		float bonus = 0;
		if(salary>20000) 
			bonus = (float) ((salary*0.17)+1500);
		else if(salary>15000)
			bonus = (float) ((salary*0.15)+1200);
		else if(salary>10000)
			bonus = (float) ((salary*0.12)+1000);
		else
			bonus = (float) ((salary*0.08)+500);
		return bonus;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		if(salary<0) {
			System.out.println("Number too small");
			return;
		}
		if(salary>32767) {
			System.out.println("Number too large");
			return;
		}
		System.out.format("%.0f",calculateBonus(salary));
		sc.close();
	}


}
