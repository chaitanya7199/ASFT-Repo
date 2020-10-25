package question4;

import java.util.Scanner;

public class ProductOfDigits {
	public static int productDigits(int kms) {
		int money = 1;
		if(kms<0 || kms>32767)
			return -1;
		while(kms>0) {
			money *= kms%10;
			kms/=10;
		}
		return money;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kms = sc.nextInt();
		if(kms<0) {
			System.out.println("Invalid Input");
			return;
		}		
		int money = productDigits(kms);
		System.out.println(money==-1 ? "Invalid Input" : money);
		sc.close();
	}

}
