package question2;

import java.util.Scanner;

public class RepeatedSalaryCount {
	
	public static int countRepeaters(int sals[], int size) {
		int count = 0;
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if(sals[i] == sals[j] && sals[i]>0) {
					count++;
					sals[i] = -1;
				}
			}
		}
		return count==0 ? count : count+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("Invalid Input");
			return;
		}
		int[] salaries = new int[n];
		for(int i=0;i<n;i++) {
			salaries[i] = sc.nextInt();
			if(salaries[i]<0) {
				System.out.println("Invalid Input");
				return;
			}
		}
		System.out.println(countRepeaters(salaries, n));
		sc.close();
	}

}
