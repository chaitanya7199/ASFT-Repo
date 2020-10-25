package question9;

import java.util.Scanner;

public class ElementCount {
	public static int findElementCount(int[] array, int size, int numberToFind) {
		int count = 0;
		for(int i=0;i<size;i++) {
			if(array[i]==numberToFind)
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
		int numberToFind = sc.nextInt();
		System.out.println(findElementCount(array, size, numberToFind));
		sc.close();
	}
}
