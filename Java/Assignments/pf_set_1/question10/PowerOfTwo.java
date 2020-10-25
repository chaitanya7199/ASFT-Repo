package question10;

import java.util.Scanner;

public class PowerOfTwo {
	
	public static int powerOfTwo(int n) {
		if(n==1)
			return 1;
		while(n%2==0) {
			if(n==2)
				return 1;
			n = n/2;
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("Number too small");
			return;
		}
		if(n>32767) {
			System.out.println("Number too large");
			return;
		}
		
		System.out.println(powerOfTwo(n)==1 ? "Yes" : "No");
		sc.close();
	}
}
