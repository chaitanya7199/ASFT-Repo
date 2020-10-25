package question11;

import java.util.Scanner;

public class CountOfMultiplesOfThree {
	
	public static int divisibleBy3(int[] array, int size) {
		int count = 0;
		for(int i=0;i<size;i++) {
			if(array[i]%3==0)
				count++;
		}
		return count;
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
		System.out.println(divisibleBy3(array, size));
		sc.close();
	}
}
