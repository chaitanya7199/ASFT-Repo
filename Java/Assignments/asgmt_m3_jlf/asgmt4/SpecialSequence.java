package asgmt4;

import java.util.Scanner;

public class SpecialSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 2, b = 1, c = 3;
		int sum = 0;
		System.out.print(a+" "+b+" "+c);		
		while(true) {
			sum = a+b+c;
			if(sum>n)
				break;
			a = b;
			b = c;
			c = sum;
			System.out.print(" "+sum);
	    }
		sc.close();
    }
}
