package day4;

public class answer17 {
	public static boolean isPrime(int n) {
		int count = 0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count==0 ? true : false;
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		boolean prime = isPrime(n);
		System.out.println(prime==true ? "The number "+n+" is prime." : "The number "+n+" is not prime.");
	}
}
