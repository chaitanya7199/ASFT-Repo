package question21;

import java.util.Scanner;

public class SumOfPrime {
	
	public static int sumPrime(int[] array, int size) {
		int count = 0, sum = 0;
		for(int i=0;i<size;i++) {
			count = 0;
			for(int j=2;j<=array[i]/2;j++) {
				if(array[i]%j==0)
					count++;
			}
			if(count==0)
				sum+=array[i];
		}
		return sum;
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
				System.out.println("Invalid input");
				return;
			}
		}
		System.out.println(sumPrime(array, size));
		sc.close();
	}

}
