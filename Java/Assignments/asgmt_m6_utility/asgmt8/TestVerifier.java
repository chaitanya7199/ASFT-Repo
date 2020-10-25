package asgmt8;

import java.util.Scanner;

class Verifier {
	public static boolean verifyPassword(String password) {
		int splCharacter = 0, number = 0;
		if((password.length() < 6) || 
			!((password.charAt(0) >= 'a' && password.charAt(0) <= 'z') ||
			 (password.charAt(0) >= 'A' && password.charAt(0) <= 'Z')))
			return false;
		for(int i=1;i<password.length();i++) {
			if(password.charAt(i) >= '0' && password.charAt(i) <='9')
				number++;
			if(password.charAt(i) >= '@' || password.charAt(i) <='#' || password.charAt(i) <='!')
				splCharacter++;
		}
		if(splCharacter == 0 || number == 0)
			return false;
		return true;
	}
}

public class TestVerifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String password = sc.next();
		System.out.println(Verifier.verifyPassword(password)==true ? "Valid Password" : "Invalid Password");
		sc.close();
	}

}
