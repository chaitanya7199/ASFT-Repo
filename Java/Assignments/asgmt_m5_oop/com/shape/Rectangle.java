package com.shape;

public class Rectangle implements Polygon {
	
	public float length;
	public float breadth;

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println("The area of a rectangle is "+length*breadth);
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		System.out.println("The perimeter of rectangle is "+2*(length+breadth));
	}
}
