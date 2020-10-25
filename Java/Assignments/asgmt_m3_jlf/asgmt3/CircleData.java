package asgmt3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#0.00");
		System.out.println("Enter the radius");
		float radius = sc.nextFloat();
		System.out.println("Enter Output required");
		String output = sc.next();
		float diameter,area,perimeter,areaOfSemicircle;
		if(output.equals("DIA")) {
			diameter = 2*radius;
			if((Math.ceil(diameter)) == diameter)
				System.out.println("Diameter of circle is "+(int)diameter);
			else
				System.out.println("Diameter of circle is "+formatter.format(diameter));
		}
		else if(output.equals("AR")) {
			area = (float) (Math.PI*radius*radius);
			if((Math.ceil(area)) == area)
				System.out.println("Area of circle is "+(int)area);
			else
				System.out.println("Area of circle is "+formatter.format(area));			
		}
		else if(output.equals("PER")) {
			perimeter = (float) (2*Math.PI*radius);
			if((Math.ceil(perimeter)) == perimeter)
				System.out.println("Perimeter of circle is "+(int)perimeter);
			else
				System.out.println("Perimeter of circle is "+formatter.format(perimeter));
		}
		else if(output.equals("ARSEM")) {
			areaOfSemicircle = (float) (Math.PI*radius);
			if((Math.ceil(areaOfSemicircle)) == areaOfSemicircle)
				System.out.println("Area of semi circle is "+(int)areaOfSemicircle);
			else
			    System.out.println("Area of semi circle is "+formatter.format(areaOfSemicircle));
		}
		sc.close();
	}

}
