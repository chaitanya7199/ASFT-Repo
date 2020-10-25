package question29;

import java.util.Scanner;

public class GenerateNewNumber {
	
	public static int generateNewNumber(int number) {
		int newNumber = 0;
		int revNewNumber = 0;
		int r = 0;
		while(number>0) {
			r = number%10;
			revNewNumber = revNewNumber*10+(r+2);
			number = number/10;
		}
		while(revNewNumber>0) {
			r = revNewNumber%10;
			newNumber = newNumber*10+r;
			revNewNumber = revNewNumber/10;
		}
	
		return newNumber;
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
		System.out.println(generateNewNumber(number));
		sc.close();
	}


}
