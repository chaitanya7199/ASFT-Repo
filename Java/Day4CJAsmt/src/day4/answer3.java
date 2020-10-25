package day4;

import java.util.*;

public class answer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a lowercase alphabet: ");
		char c = sc.next().charAt(0);
		do
		{
			System.out.print(c+" ");
			c = (char)(c+1);
		}while('z'-c!=-1);
		sc.close();
	}

}
