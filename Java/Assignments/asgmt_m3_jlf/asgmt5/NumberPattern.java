package asgmt5;

import java.util.Scanner;

public class NumberPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = 0;
		for(int i=1;i<=n;i++) {
			flag = 0;
			for(int j=1;j<=i;j++) {
				if(i%3==0) {
					flag = 1;
					break;
				}
				System.out.print(i+" ");
			}
			if(flag==0)
				System.out.println();
		}
		sc.close();
	}

}
