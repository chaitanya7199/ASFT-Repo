package day4;

public class answer7 {
	public static void main(String args[]) {
		int i,j=0;
		int n = 5;
		System.out.println("Series a: ");
		for(i=-2;j++<n;) {
			i+=3;
			System.out.print(i+" ");
		}
		System.out.println("\n\nSeries b:");
		n = 10;
		j = 0;
		for(i=-20;j++<n;) {
			System.out.print(i+" ");
			i+=5;
		}
		System.out.println("\n\nSeries c:");
		for(i=1;i<=10;i++) {
			if(i%2!=0)
			    System.out.print(i+" ");
			else
				System.out.print(-i+" ");
		}
	}
}
