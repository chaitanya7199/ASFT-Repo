package day4;

public class answer9 {
	public static void main(String[] args) {
		int n =120;
		int r,sum=0;
		while(n>0) {
			r = n%10;
			sum+=r;
			n=n/10;
		}
		System.out.println(sum);
	}
}
