package question47;

import java.util.Scanner;

public class FindIndex {
	
	public static int findIndex(int[] array, int size, int elementToFind) {
		for(int i=0;i<size;i++) {
			if(array[i] == elementToFind)
				return i;
		}
		return -1;
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
		int elementToFind = sc.nextInt();
	    int index = findIndex(array, size, elementToFind);
	    System.out.println(index==-1 ? "not found" : index);
		sc.close();
	}
}
