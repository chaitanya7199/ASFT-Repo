package question3;

import java.util.Scanner;

public class MaximumSum {

	public static int primeIndexSum(int[] array, int size) {
		int sum = 0, avg = 0;
		int[] primes = new int[7];
		int count = 0;
		int flag;
		for(int i=2;i<=size;i++) {
			flag = 0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag = 1;
					break;
				}
			}
			if(flag==0)
				primes[count++] = i;
		}
		for(int i=0;i<count;i++) {
			sum+=array[primes[i]-1];
		}
		avg = (int)(sum/count);
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if(size<0) {
			System.out.println("Invalid array size");
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
		System.out.println(primeIndexSum(array, size));
		sc.close();
	}

}
