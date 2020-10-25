package asgmt7;

import java.util.Scanner;

public class ProfitAndLoss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of dozens of eggs purchased");
		int X = sc.nextInt();
		System.out.println("Enter the price per dozen");
		float Y = sc.nextInt();
		System.out.println("Enter the selling price of 1 egg");
		float Z = sc.nextInt();
		float profit = 0, loss = 0;
		float costPrice = Y/12;
		if(Z>=costPrice) {
			profit = ((Z-costPrice)/costPrice)*100;
			System.out.print("Harish's profit percentage is ");
			System.out.format("%.2f",profit);
			System.out.println(" percent");
		}
		if(Z<costPrice) {
			loss = ((costPrice-Z)/costPrice)*100;
			System.out.print("Harish's loss percentage is ");
			System.out.format("%.2f",loss);
			System.out.println(" percent");
		}
		sc.close();
	}
}
