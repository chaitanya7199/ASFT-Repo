package question43;

import java.util.Scanner;

public class Armstrong {
	
	public static int checkArmstrong(int number) {
		int numberSize = String.valueOf(number).length();
		if(numberSize!=3)
			return -1;
		int duplicate = number;
		int r = 0, sum = 0;
		while(duplicate > 0) {
			r = duplicate%10;
			sum+=r*r*r;
			duplicate = duplicate/10;
		}
		if(sum == number)
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number<0) {
			System.out.println("Invalid Input");
			return;
		}
	    int check = checkArmstrong(number);
	    System.out.println(check==-1 ? "Invalid Input" : check==1 ? "yes" : "no");
		sc.close();
	}
}
