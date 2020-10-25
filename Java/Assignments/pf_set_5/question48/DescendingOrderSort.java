package question48;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DescendingOrderSort {
	
	public static void sortArray(int[] array, int size) {
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(array[j] < array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		for(int e : array)
			System.out.println(e);
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
	    sortArray(array, size);
		sc.close();
	}
}
