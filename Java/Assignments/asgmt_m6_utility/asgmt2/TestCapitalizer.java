package asgmt2;

import java.util.Scanner;

class Capitalizer {

	public String capitalize(String str) {
		str = str.toLowerCase();
		// TODO Auto-generated method stub
		String[] s = str.split(" ");
		String str1 = "";
		for(int i=0;i<s.length;i++) {
			s[i] = String.valueOf(s[i].charAt(0)).toUpperCase() + s[i].substring(1);
			str1+=s[i]+" ";
		}
		return str1.trim();
	}
	
}

public class TestCapitalizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Capitalizer c = new Capitalizer();
		System.out.println(c.capitalize(str));
		sc.close();
	}

}
