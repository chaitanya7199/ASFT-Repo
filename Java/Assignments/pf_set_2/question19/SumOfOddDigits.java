package question19;

import java.util.Scanner;

public class SumOfOddDigits {
	
	public static int sumOddDigits(int n) {
		int sum = 0;
		int r;
		while(n>0) {
			r = n%10;
			if(r%2!=0)
				sum+=r;
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0 || n>32767) {
			System.out.println("Invalid Input");
			return;
		}
		System.out.println(sumOddDigits(n));
		sc.close();
	}
	
}
