package question5;

import java.util.Scanner;

public class FindCricketerID {
	public static void findCricketerId(int[] array, int size, int score) {
		for(int i=1;i<size;i+=2) {
			if(array[i] > score)
				System.out.println(array[i-1]);
		}
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
		int score = sc.nextInt();
		if(score < 0) {
			System.out.println("Invalid Score");
			return;
		}
		findCricketerId(array, size, score);
		sc.close();
	}
}
