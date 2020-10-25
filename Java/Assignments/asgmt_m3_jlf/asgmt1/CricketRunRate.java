package asgmt1;

import java.util.*;

public class CricketRunRate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of overs bowled so far");
		int oversBowled = sc.nextInt();
		System.out.println("Enter the current run rate");
		float curRR = sc.nextFloat();
		System.out.println("Enter the target score");
		int target = sc.nextInt();
		double requiredRunrate = (double)((double)(target-(curRR*oversBowled))/(50-oversBowled));
		System.out.print("Required run rate is ");
		System.out.format("%.2f",requiredRunrate);
		sc.close();
	}
}
