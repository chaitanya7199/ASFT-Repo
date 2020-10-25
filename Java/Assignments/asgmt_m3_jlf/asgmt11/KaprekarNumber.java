package asgmt11;

import java.util.Scanner;

public class KaprekarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int nDigit = String.valueOf(k).length();
		int sq = k*k;
		int n = String.valueOf(sq).length();
	    int[] digits = new int[n];
	    int count = 0,num1 = 0,num2 = 0,num3 = 0;
	    while(sq>0) {
	    	digits[count++] = sq%10;
	    	sq=sq/10;
	    }
	    for(int i=nDigit-1;i>=0;i--)
	    	num1 = (num1*10)+digits[i];
	    for(int i=n-1;i>=nDigit;i--)
	    	num2 = (num2*10)+digits[i];
	    num3 = num2 + digits[nDigit-1];
	    int result1 = num1 + num2;
	    int result2 = num1 + num3;
	    if(k == result1 || k == result2)
	    	System.out.println("Kaprekar Number");
	    else
	    	System.out.println("Not A Kaprekar Number");
	    sc.close();
	}

}
