package question44;

import java.util.Scanner;

public class Factorial {
	
	public static int findFactorial(int n) {
		if(n<0 || n>10)
			return -1;
		if(n==0)
			return 1;
		return n * findFactorial(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("Invalid Input");
			return;
		}
	    int result = findFactorial(n);
	    System.out.println(result==-1 ? "Invalid Input" : result);
		sc.close();
	}
}
