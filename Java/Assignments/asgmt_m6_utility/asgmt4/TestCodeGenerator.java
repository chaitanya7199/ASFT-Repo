package asgmt4;

import java.util.Scanner;

class CodeGenerator {
	
    StringBuilder sb;
	public StringBuilder generateCode(String str) {
		// TODO Auto-generated method stub
		 sb = new StringBuilder(str);
		 sb = sb.reverse();
		 sb = new StringBuilder(sb.toString().substring(2));
		 sb.replace(0, 1, "*");
		 sb.replace(sb.length()-1, sb.length(), "#");
		 sb = new StringBuilder(sb.toString().toUpperCase());
		 return sb;
	}
}

public class TestCodeGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		if(str.length() < 4) {
			System.out.println("Input should be of size of atleast 4.");
			return;
		}
		CodeGenerator cg = new CodeGenerator();
		StringBuilder sb = cg.generateCode(str);
		System.out.println(sb);
	}

}
