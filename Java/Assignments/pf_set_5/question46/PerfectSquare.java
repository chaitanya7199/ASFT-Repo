package question46;

import java.util.Scanner;

public class PerfectSquare {
	
	public static int checkPerfectSquare(int n) {
		if(n < 0)
			return -1;
		float sqrt = (float)Math.sqrt(n);
		if((int)sqrt == (int)Math.ceil(sqrt))
			return 1;
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int result = checkPerfectSquare(n);
	    System.out.println(result==-1 ? "Invalid Input" : result==1 ? "yes" : "no");
		sc.close();
	}
}
