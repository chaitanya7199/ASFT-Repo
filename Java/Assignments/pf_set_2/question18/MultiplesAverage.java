package question18;

import java.util.Scanner;

public class MultiplesAverage {
	
	public static float findAverageBy5s(int n) {
		int sum = 0;
		float avg = 0f;
		int count = 1;
		int product = 5 * count;
		while(product<=n) {
			sum+=product;
			++count;
			product = 5 * count;
		}
		avg = (float)((float)sum/(count-1));
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0 || n>32767) {
			System.out.println("Invalid Input");
			return;
		}
		System.out.format("%.2f",findAverageBy5s(n));
		sc.close();
	}
}
