package question24;

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstLargest {
	
	public static int findFirstLargest(int[] array, int size) {
		Arrays.sort(array);
		int product = array[size-1] * array[size-3];
		return product;
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
				System.out.println("Invalid number");
				return;
			}
		}
		System.out.println(findFirstLargest(array, size));
		sc.close();
	}

}
