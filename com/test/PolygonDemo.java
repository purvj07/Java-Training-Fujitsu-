package com.test;

import com.shape.*;
public class PolygonDemo {

	public static void main(String[] args)
	{
		Polygon1 p = new Square(2.5f);
		p.calcArea();
		p.calcPeri();
	}

}
