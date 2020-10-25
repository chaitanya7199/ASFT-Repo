package asgmt10;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		int n = sc.nextInt();
		int[] marks = new int[n];
		System.out.println("Enter marks scored");
		for(int i=0;i<n;i++) {
			marks[i] = sc.nextInt();
		}
		int min=marks[0],max=marks[0],sum=0;
		float avg=0f;
		for(int i=0;i<n;i++) {
			if(max<marks[i])
				max = marks[i];
			if(min>marks[i])
				min = marks[i];
			sum+=marks[i];
		}
		avg = sum/n;
		System.out.println("Minimum marks: "+min);
		System.out.println("Maximum marks: "+max);
		System.out.print("Average marks: ");
		System.out.format("%.2f",avg);
		sc.close();
	}
}
