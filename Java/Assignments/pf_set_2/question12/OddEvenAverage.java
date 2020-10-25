package question12;

import java.util.Scanner;

public class OddEvenAverage {
	
	public static float avgOddEvenSum(int[] array, int size) {
		int sumofEven = 0, sumOfOdd = 0;
		float avg = 0f;
		for(int i=0;i<size;i++) {
			if(array[i]%2==0)
				sumofEven+=array[i];
			else
				sumOfOdd+=array[i];
		}
		avg = (float)(sumofEven+sumOfOdd)/2;
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if(size<0) {
			System.out.println("Invalid Input");
			return;
		}
		int[] array = new int[size];
		for(int i=0;i<size;i++) {
			array[i] = sc.nextInt();
			if(array[i]<0) {
				System.out.println("Invalid Input");
				return;
			}
		}
		System.out.format("%.2f",avgOddEvenSum(array, size));
		sc.close();
	}

}
