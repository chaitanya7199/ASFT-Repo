package question15;

import java.util.Scanner;

public class DigitFactorial {
	
	public static int factorial(int n) {
		if(n==0)
			return 1;
		return n*factorial(n-1);
	}
	public static void digitFactorial(int number) {
		int size = String.valueOf(number).length();
		int[] found = new int[size];
		int n, count = 0;
		while(number>0) {
			n = number%10;
			found[count++] = factorial(n);
			number = number/10;
		}
		for(int i=size-1;i>=0;i--)
			System.out.println(found[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number<0) {
			System.out.println("Number too small");
			return;
		}
		if(number>32767) {
			System.out.println("Number too large");
			return;
		}
		digitFactorial(number);
		sc.close();
	}

}
