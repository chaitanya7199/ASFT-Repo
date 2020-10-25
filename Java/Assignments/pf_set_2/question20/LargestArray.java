package question20;

import java.util.Scanner;

public class LargestArray {
	
	public static void largestArray(int[] input1, int[] input2, int size) {
		int[] output =  new int[size];
		for(int i=0;i<size;i++) {
			if(input1[i] > input2[i])
				output[i] = input1[i];
			else
				output[i] = input2[i];
		}
		for(int i=0;i<size;i++)
			System.out.println(output[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if(size<0) {
			System.out.println("Invalid Input");
			return;
		}
		int[] input1 = new int[size];
		for(int i=0;i<size;i++) {
			input1[i] = sc.nextInt();
			if(input1[i]<0) {
				System.out.println("Invalid Input");
				return;
			}
		}
		int[] input2 = new int[size];
		for(int i=0;i<size;i++) {
			input2[i] = sc.nextInt();
			if(input2[i]<0) {
				System.out.println("Invalid Input");
				return;
			}
		}
		largestArray(input1, input2, size);
		sc.close();
	}

}
