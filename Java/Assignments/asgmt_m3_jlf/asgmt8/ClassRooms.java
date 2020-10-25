package asgmt8;

import java.util.Scanner;

public class ClassRooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter C1 capacity");
		int c1 = sc.nextInt();
		System.out.println("Enter C2 capacity");
		int c2 = sc.nextInt();
		System.out.println("Enter C3 capacity");
		int c3 = sc.nextInt();
		System.out.println("Enter number of students");
		int n = sc.nextInt();
		int count = 0;
		if(n<=c1)
			count++;
		if(n<=c2)
			count++;
		if(n<=c3)
			count++;
		System.out.println(count==0 ? "None of the labs can accommodate "+n+" students" 
				: count+" lab(s) can accommodate "+n+" students");
		sc.close();
	}

}
