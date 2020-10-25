package asgmt6;

import java.text.DecimalFormat;

class Averager {
	
	public static double avg(int a, int b) {
		 int sum = a+b;
		 double average = (double)(sum/2);
		return average;
	}
	
	public static double avg(int a, int b, int c) {
		 int sum = a+b+c;
		 double average = (double)(sum/3);
		return average;
	}
	
	public static double avg(double a, double b) {
		 double sum = a+b;
		 double average = (double)(sum/2);
		return average;
	}
}

public class TestAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#0.00");
		System.out.println("Average of 2 and 3 is "+df.format(Averager.avg(2, 3)));
		System.out.println("Average of 2, 3 and 4 is "+df.format(Averager.avg(2, 3, 4)));
		System.out.println("Average of 2.0 and 3.0 is "+df.format(Averager.avg(2.0, 3.0)));
	}

}
