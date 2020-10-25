package asgmt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Students");
		int n = sc.nextInt();
		int sum = 0;
		ArrayList<Integer> marks = new ArrayList<Integer>(n);
		System.out.println("Enter marks");
		for(int i=0;i<n;i++) {
			marks.add(sc.nextInt());
			sum+=marks.get(i);
		}
		System.out.println("Highest Marks : "+Collections.max(marks));
		System.out.println("Average Marks : "+((float)sum/n));
		System.out.print("Marks : ");
		for(int i=0;i<n;i++) 
			System.out.print((i+1)+"-"+marks.get(i)+" ");
		System.out.println("\n3rd Student marks : "+marks.get(2));
		System.out.print("Sorted : ");
		Collections.sort(marks);
		int count = 1;
		Iterator<Integer> i = marks.iterator();
		while(i.hasNext())
			System.out.print((count++) + "-" + i.next() + " ");
		sc.close();
	}

}
