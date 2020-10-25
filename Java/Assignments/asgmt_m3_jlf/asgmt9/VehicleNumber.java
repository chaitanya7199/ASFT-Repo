package asgmt9;

import java.util.Scanner;

public class VehicleNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		int i,j,r,sum=0;
		for(i=m;i<=n;i++) {
			sum=0;
			j=i;
			while(j>0) {
				r = j%10;
				sum+=r;
				j=j/10;
			}
			if(sum==9)
				System.out.println(i);
		}
	}
}
