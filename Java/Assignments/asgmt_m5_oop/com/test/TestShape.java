package com.test;

import com.shape.*;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		s.side = 5;
		s.calcPeri();
		s.calcArea();
		
		Rectangle r = new Rectangle();
		r.length = 10;
		r.breadth = 5;
		r.calcPeri();
		r.calcArea();
	}

}
