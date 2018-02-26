package edu.cuny.brooklyn.cisc3120.ShapeObjects;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * JUnit test for my Area sorting
 *
 */
public class ShapeSorterTest2 {
	@Test
	public void testShapeSorterByArea() {
		ArrayList<Shape> shapeList = new ArrayList<Shape>();
		shapeList.add(new Circle("C123456789", 10.));
		shapeList.add(new Circle("C12345678", 8.));
		shapeList.add(new Circle("C1234567890", 11.));
		shapeList.add(new Rectangle("C12", 10., 80.));
		
		ArrayList<Shape> expectedShapeList = new ArrayList<Shape>();
		expectedShapeList.add(new Circle("C12345678", 8.));
		expectedShapeList.add(new Circle("C123456789", 10.));
		expectedShapeList.add(new Circle("C1234567890", 11.));
		expectedShapeList.add(new Rectangle("C12", 10., 80.));
		
		
		shapeList.sort(new ShapeAreaComparator());
		assertEquals(expectedShapeList, shapeList);
	}
}
   