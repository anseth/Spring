package com.anfcorp.anand.spring03;
import java.util.*;

public class Triangle {	
	private String type;
	private int height;
	public List <Point> points;
	
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
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	
	
	
	//	Getters and Setters end here	
	public void draw()
		{
			System.out.println("Drawing a triangle of type '" + this.getType() + "' and of height <" + this.getHeight() +"> at coordinates");
			for (Point point: points)
			{
				System.out.println ("(A) : ("+ point.getCoordX() +","+point.getCoordY()+")" );
			}
				
		}

	
}
