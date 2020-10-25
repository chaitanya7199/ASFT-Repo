package question16;

import java.util.Scanner;

public class SearchKeys {
	
	public static void searchKeys(int[] array, int size, int valueToBeSearched) {
		int[] found = new int[size];
		int count = 0;
		for(int i=1;i<size;i+=2) {
			if(array[i]==valueToBeSearched)
				found[count++]=array[i-1];
		}
		if(count==0)
			System.out.println("Key not found");
		for(int i=0;i<count;i++)
			System.out.println(found[i]);
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
		int valueToBeSearched = sc.nextInt();
	    searchKeys(array, size, valueToBeSearched);
		sc.close();
	}

}
