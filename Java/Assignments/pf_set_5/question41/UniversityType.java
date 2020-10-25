package question41;

import java.util.Arrays;
import java.util.Scanner;

public class UniversityType {

	public static int calculateGrade(int[] array, int size) {
		int sum = 0;
		float avg = 0;
		for(int i=0;i<size;i++)
			sum+=array[i];
		avg = sum/size;
		System.out.println(avg);
		if(avg > 99)
			return -1;
		else if(avg > 80)
			return 1;
		else if(avg > 60 && avg <= 80)
			return 2;
		return 3;
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
		int grade = calculateGrade(array, size);
		switch(grade) {
		case 1:
			System.out.println("First Grade University");
			break;
		case 2:
			System.out.println("Second Grade University");
			break;
		case 3:
			System.out.println("Third Grade University");
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		sc.close();
	}

}
