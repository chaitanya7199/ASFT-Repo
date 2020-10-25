package com.shape;


public class Square implements Polygon {
	public float side;

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println("The area of a square is "+side*side);
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		System.out.println("The perimeter of square is "+4*side);
	}
}