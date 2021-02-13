package com.shape;



public class Square implements Polygon1
{

	public Square(float side) {
		super();
		this.side = side;
	}

	float side;
	@Override
	public void calcArea() {
		System.out.println("Area of Square: " +(side*side));
		
	}

	@Override
	public void calcPeri() {
		System.out.println("Perimeter of Square: " + (4*side));
		
	}

	
	
}

class Rectangle implements Polygon1
{
	float length;
	float breadth;
	
	

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void calcArea() {
		System.out.println("Area of Rectangle: "+ (length*breadth));
	}

	@Override
	public void calcPeri() {
		System.out.println("Perimeter of Rectangle: "+(2*(length+breadth)));
		
	}
	
}