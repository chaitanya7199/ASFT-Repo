package asgmt13;

import java.util.Arrays;
import java.util.Scanner;

public class PTDrill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Students");
        int n = sc.nextInt();
        int size = (int)(Math.sqrt(n));
        int count = 0;
        int middleRow = (int)(size/2);
        int middleColumn= (int)(size/2);
        String[][] students = new String[size][size];
        String[] names = new String[n];
        System.out.println("Enter names");
        for(int i=0;i<n;i++)
        	names[i] = sc.next();
        Arrays.sort(names);
        for(int i=0;i<size;i++) {
        	for(int j=0;j<size;j++) {
        		students[i][j] = names[count++];
        	}
        }
        System.out.print("Middle row   : ");
        for(int j=0;j<size;j++)
        	System.out.print(students[middleRow][j]+" ");
        System.out.print("\nMiddle column: ");
        for(int i=0;i<size;i++)
        	System.out.print(students[i][middleColumn]+" ");
        sc.close();
	}

}
