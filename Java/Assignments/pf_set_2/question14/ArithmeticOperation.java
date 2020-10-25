package question14;

import java.util.Scanner;

public class ArithmeticOperation {
	
	public static int performArithmeticOperation(int operand1, int operand2, int operator) {
		int result = 0;
		if(operand1<0 || operand2<0 || operand1>32767 || operand2>32767) {
			return -1;
		}
		if(operator==1)
			result = operand1 + operand2;
		else if(operator==2)
			result = operand1 - operand2;
		else if(operator==3)
			result = operand1 * operand2;
		else if(operator==4)
			result = operand1 / operand2;
		else
			result = -1;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int operand1 = sc.nextInt();
		int operand2 = sc.nextInt();
		int operator = sc.nextInt();
		int result = performArithmeticOperation(operand1, operand2, operator);
		System.out.println(result==-1 ? "Invalid Input" : result);
		sc.close();
	}

}
