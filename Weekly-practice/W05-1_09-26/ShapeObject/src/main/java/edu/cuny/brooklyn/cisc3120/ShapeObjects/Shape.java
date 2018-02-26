package edu.cuny.brooklyn.cisc3120.ShapeObjects;

public class Shape {
	protected String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	// This method is require for the sub classes to overide it and have their
	// own implementation of area. It could be an abstract method, and then
	// the Shape class will be a abstract class. This is in order to avoid
	// using the statement in the area method.
	public double area() {
		System.out.println("This method is not supposed to be called.");
		return 0;
	}

	public String getName() {
		return name;
	}
}
