package day4;

public class answer14 {
	public static void main(String[] args) {
		int n =153;
		int k = n;
		int r,sum=0;
		while(k>0) {
			r = k%10;
			sum+=(int)(Math.pow((double)r, 3));
			k=k/10;
		}
		System.out.println(sum==n ? ""+n+" is an armstrong number" : ""+n+" is not an armstrong number");
	}
}
