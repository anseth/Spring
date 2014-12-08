package com.anfcorp.anand.spring03;

public class Triangle {	
	private String type;
	private int height;
	public Point pointA;
	public Point pointB;
	public Point pointC;

	//	Constructor Overloading Starts here
	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}
	
	public Triangle() {
		super();
		this.type = "Scalene";
		this.height = 40;
	}
	
	public Triangle(String type) {
		super();
		this.type = type;
		this.height = 20;
	}
	
	public Triangle(int height) {
		super();
		this.type = "Equilateral";
		this.height = height;
	}

	//	Constructor Overloading Ends here


	//	Getters and Setters start here 
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	//	Getters and Setters end here	
	public void draw()
		{
			System.out.println("Drawing a triangle of type '" + this.getType() + "' and of height <" + this.getHeight() +"> at coordinates");
			System.out.println ("(A) : ("+ this.pointA.getCoordX() +","+this.pointA.getCoordY()+")" );
			System.out.println ("(B) : ("+ this.pointB.getCoordX() +","+this.pointB.getCoordY()+")" );
			System.out.println ("(C) : ("+ this.pointC.getCoordX() +","+this.pointC.getCoordY()+")" );
				
		}
	
}
