package asgmt3;

import java.util.Scanner;

class SpaceRemover {

	public String removeSpaces(String str) {
		// TODO Auto-generated method stub
		str = str.replaceAll("\\s+", " ");
		return str.trim();
	}
	
}

public class TestSpaceRemover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		SpaceRemover s = new SpaceRemover();
		System.out.println(s.removeSpaces(str));
		sc.close();
	}

}
