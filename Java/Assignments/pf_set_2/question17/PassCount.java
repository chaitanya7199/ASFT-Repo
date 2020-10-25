package question17;

import java.util.Scanner;

public class PassCount {
	
	public static int passCount(int[] array, int size) {
		int count = 0;
		for(int i=1;i<size;i+=2) {
			if(array[i]>=70)
				count++;
		}
		return count;
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
		System.out.println(passCount(array, size));
		sc.close();
	}

}
