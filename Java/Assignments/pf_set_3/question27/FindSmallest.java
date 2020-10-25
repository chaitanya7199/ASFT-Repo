package question27;

import java.util.Scanner;

public class FindSmallest {
	
	public static int findSmallest(int a, int b, int c) {
		if(a<=b && a<=c)
			return a;
		else if(b<=a && b<=c)
			return b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(findSmallest(a, b, c));
		sc.close();
	}

}
