package question23;

import java.util.Scanner;

public class SecondLargest {
	
	public static int secondLargest(int[] array, int size) {
		int max1 = array[0], max2 = array[0];
		for(int i=0;i<size;i++) {
			if(max1<array[i]) {
				max1=array[i];
			}
		}
		for(int i=0;i<size;i++) {
			if(max2<array[i] && array[i]!=max1) {
				max2=array[i];
			}
		}
		return max2;
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
				System.out.println("Invalid input");
				return;
			}
		}
		System.out.println(secondLargest(array, size));
		sc.close();
	}

}
