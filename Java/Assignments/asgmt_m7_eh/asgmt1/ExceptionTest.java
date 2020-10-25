package asgmt1;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			if(args.length == 0)
				throw new ArrayIndexOutOfBoundsException();
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println(a/b);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No Input received");
		}
		catch(NumberFormatException e) {
			System.out.println("Only integers are allowed");
		}
		catch(ArithmeticException e) {
			System.out.println("Division with zero is not possible");
		}
	}
}
