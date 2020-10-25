package question42;

import java.util.Scanner;

public class InterchangeArray {
	
	public static void interchangeArray(int[] array, int size) {
		int temp;
		for(int i=0;i<size/2;i++) {
			temp = array[i];
			array[i] = array[size-1-i];
			array[size-1-i] = temp;
		}
		for(int e : array)
			System.out.print(e+" ");
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
	    interchangeArray(array, size);
		sc.close();
	}
}
