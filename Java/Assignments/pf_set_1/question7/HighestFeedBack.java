package question7;

import java.util.Scanner;

public class HighestFeedBack {
	public static void highestFeedBack(int[] metlife,int[] hardfort,int size) {
		int[] fedback = new int[size*2];
		int count = 0;
		int flag = 0;
		for(int i=0;i<size;i+=2) {
			flag = 0;
			for(int j=0;j<size;j+=2) {
				if(metlife[i] == hardfort[j]) {
					if(metlife[i+1] > hardfort[j+1]) {
						fedback[count++] = metlife[i];
						fedback[count++] = metlife[i+1];
						hardfort[j] = -1;
						flag = 1;
					}
					else if(metlife[i+1] <= hardfort[j+1]) {
						fedback[count++] = hardfort[i];
						fedback[count++] = hardfort[i+1];
						hardfort[j] = -1;
						flag = 1;
					}
				}
			}
			if(flag==0) {
				fedback[count++] = metlife[i];
				fedback[count++] = metlife[i+1];
			}
		}
		for(int i=0;i<size;i+=2) {
			if(hardfort[i]!=-1) {
				fedback[count++] = hardfort[i];
				fedback[count++] = hardfort[i+1];
			}
		}
		for(int i=0;i<count;i++) {
			System.out.println(fedback[i]);
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
		int[] metlife = new int[size];
		int[] hardfort = new int[size];
		for(int i=0;i<size;i++) {
			metlife[i] = sc.nextInt();
			if(metlife[i]<0) {
				System.out.println("Invalid input");
				return;
			}
		}
		for(int i=0;i<size;i++) {
			hardfort[i] = sc.nextInt();
			if(hardfort[i]<0) {
				System.out.println("Invalid input");
				return;
			}
		}
		highestFeedBack(metlife, hardfort, size);
		sc.close();
	}
}
