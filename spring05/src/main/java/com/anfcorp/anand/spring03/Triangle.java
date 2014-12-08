package com.anfcorp.anand.spring03;
import java.util.*;

public class Triangle {	
	public String type;
	public int height;
	Point pointA;
	Point pointB;
	Point pointC;
	
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
	
	
	//For constructor auto-wiring.
	public Triangle(Point pointA, Point pointB, Point pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}

	//	Constructor Overloading Ends here
	
	/**
	 * 
	 * @return
	 
	//	Getters and Setters start here - For Autowiring by name.
	//Commenting out all setters and getters for autowiring by constructor.
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	//	Getters and Setters end here
	*/
	public void draw()
		{
			System.out.println("Drawing a triangle of type '" + this.type + "' and of height <" + this.height +"> at coordinates");

			System.out.println ("(A) : ("+ this.pointA.getCoordX() +","+this.pointA.getCoordY()+")" );
			System.out.println ("(B) : ("+ this.pointB.getCoordX() +","+this.pointB.getCoordY()+")" );
			System.out.println ("(C) : ("+ this.pointC.getCoordX() +","+this.pointC.getCoordY()+")" );
				
		}

	

	
}
