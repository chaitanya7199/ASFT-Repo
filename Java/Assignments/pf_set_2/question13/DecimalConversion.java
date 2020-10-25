package question13;

import java.util.Scanner;

public class DecimalConversion {
	
	public static int convertToDecimal(int binaryNumber) {
		int power = 0;
		int decimalNumber = 0;
		int digit = 0;
		while(binaryNumber>0) {
			digit = binaryNumber%10;
			if(!(digit==1 || digit==0))
				return -1;
			decimalNumber += digit*Math.pow(2, power++); 
			binaryNumber = binaryNumber/10;
		}
		return decimalNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int binaryNumber = sc.nextInt();
		if(binaryNumber < 0 || binaryNumber > 11111) {
			System.out.println("Invalid Input");
			return;
		}
		int decimalNumber = convertToDecimal(binaryNumber);
		System.out.println(decimalNumber==-1 ? "Invalid Input" : decimalNumber);
		sc.close();
	}

}
