package question6;

import java.util.Scanner;

public class FahrenheitToCentigrade {
	public static float convertToCentigrade(int fahrenheit) {
		float celcius = (fahrenheit-32)*5/9;
		return celcius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fahrenheit = sc.nextInt();
		sc.close();
		if(fahrenheit<0) {
			System.out.println("Invalid Input");
			return;
		}
		System.out.format("%.2f",convertToCentigrade(fahrenheit));
	}

}
