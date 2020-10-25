package question28;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndDelete {
	
	public static void sumPrime(int[] array, int size, int elementToBeDeleted) {
		int flag = 0;
		Arrays.sort(array);
		for(int i=0;i<size;i++) {
			flag = 0;
			if(array[i] == elementToBeDeleted) {
				for(int j=i;j<size-1;j++) {
					array[j] = array[j+1];
					flag=1;
				}
				if(flag==1) {
					size--;
					i--;
				}
			}
		}
		for(int i=0;i<size;i++) 
			System.out.println(array[i]);
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
		int elementToBeDeleted = sc.nextInt();
		sumPrime(array, size, elementToBeDeleted);
		sc.close();
	}


}
