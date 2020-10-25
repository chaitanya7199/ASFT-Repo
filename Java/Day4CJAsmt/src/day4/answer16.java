package day4;

import java.util.*;

public class answer16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=0;i<3;i++) {
			System.out.print("Enter the number to be added: ");
			sum+=sc.nextInt();
		}
		System.out.println("The sum of three numbers is "+sum);
		sc.close();
	}

}
