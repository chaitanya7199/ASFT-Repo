package question25;

import java.util.Scanner;

public class GenerateCode {
	
	public static int generateCode(int code) {
		int modifiedCode = 0;
		int result = 0;
		int r=0;
		while(code>0) {
			r = code%10;
			if(r%2==0)
				modifiedCode = modifiedCode*10 + r;
			code = code/10;
		}
		r = 0;
		while(modifiedCode>0) {
			r = modifiedCode%10;
			if(r%2==0)
				result = result*10 + r;
			modifiedCode = modifiedCode/10;
		}
		if(result==0)
			return 0;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int code = sc.nextInt();
		if(code<0) {
			System.out.println("Number too small");
			return;
		}
		if(code>32767) {
			System.out.println("Number too large");
			return;
		}
		System.out.println(generateCode(code));
		sc.close();
	}


}
