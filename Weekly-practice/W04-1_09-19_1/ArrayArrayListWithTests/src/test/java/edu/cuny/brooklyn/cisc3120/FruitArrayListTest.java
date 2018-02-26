package edu.cuny.brooklyn.cisc3120;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FruitArrayListTest {
	/**
     * Test the delete method thoroughly on FruitArrayListTest
     * Some methods were added on FruitArrayList for testing
     * Testing uses the same tests as FruitArray for the 
     * exception of a capacity which an ArrayList is not
     * available to provide.
     */
	@Test
    public void testDeleteByDeleting1st() {
    	// why not this: String[] fruits = {"Apple", "Banana", "Kiwi", "Mango", "Orange"};
		// Because by using new, we explicitly create a new referentially instant of the String
		// while the other may reuse an instance from a distinct constant pool
        String[] fruits = {new String("Apple"), new String("Banana"), new String("Kiwi"), new String("Mango"), new String("Orange")};
        FruitArrayList fruitArrayList = new FruitArrayList(fruits);    

        fruitArrayList.delete(new String("Apple"));
        String[] fruitsExpected = {new String("Banana"), new String("Kiwi"), new String("Mango"), new String("Orange")};
        
        assertEquals("The size of the FruitArrayList object is unexpected.", fruitArrayList.getSize(), fruitsExpected.length);
        // why not assertArrayEquals( ... )
		for (int i = 0; i < fruitsExpected.length; i++) {
			assertTrue(fruitArrayList.getFruitsAsArrayList().get(i).equals(fruitsExpected[i]));
		}
    }

	@Test
    public void testDeleteByDeleting3rd() {
    	// why not this: String[] fruits = {"Apple", "Banana", "Kiwi", "Mango", "Orange"};
		// Because by using new, we explicitly create a new referentially instant of the String
		// while the other may reuse an instance from a distinct constant pool
        String[] fruits = {new String("Apple"), new String("Banana"), new String("Kiwi"), new String("Mango"), new String("Orange")};
        FruitArrayList fruitArrayList = new FruitArrayList(fruits);    
        
        fruitArrayList.delete(new String("Kiwi"));
        String[] fruitsExpected = {new String("Apple"), new String("Banana"), new String("Mango"), new String("Orange")};

        assertEquals("The size of the FruitArray object is unexpected.", fruitArrayList.getSize(), fruitsExpected.length);
        // why not assertArrayEquals( ... )
        for (int i = 0; i < fruitsExpected.length; i++) {
			assertTrue(fruitArrayList.getFruitsAsArrayList().get(i).equals(fruitsExpected[i]));
		}
    }  

	@Test
    public void testDeleteByDeletingLast() {
    	// why not this: String[] fruits = {"Apple", "Banana", "Kiwi", "Mango", "Orange"};
		// Because by using new, we explicitly create a new referentially instant of the String
		// while the other may reuse an instance from a distinct constant pool
		String[] fruits = {new String("Apple"), new String("Banana"), new String("Kiwi"), new String("Mango"), new String("Orange")};
        FruitArrayList fruitArrayList = new FruitArrayList(fruits);       
        
        fruitArrayList.delete(new String("Orange"));
        String[] fruitsExpected = {new String("Apple"), new String("Banana"), new String("Kiwi"), new String("Mango")};
        
        assertEquals("The size of the FruitArray object is unexpected.", fruitArrayList.getSize(), fruitsExpected.length);
        // why not assertArrayEquals( ... )        
		for (int i = 0; i < fruitsExpected.length; i++) {
			assertTrue(fruitArrayList.getFruitsAsArrayList().get(i).equals(fruitsExpected[i]));
		}
    } 
    
	@Test
    public void testDeleteIgnoreCaseByDeleting1st() {
    	// why not this: String[] fruits = {"Apple", "Banana", "Kiwi", "Mango", "Orange"};
		// Because by using new, we explicitly create a new referentially instant of the String
		// while the other may reuse an instance from a distinct constant pool
		String[] fruits = {new String("Apple"), new String("Banana"), new String("Kiwi"), new String("Mango"), new String("Orange")};
        FruitArrayList fruitArrayList = new FruitArrayList(fruits);     
        
        fruitArrayList.delete(new String("apple"));
        String[] fruitsExpected = {new String("Banana"), new String("Kiwi"), new String("Mango"), new String("Orange")};

        assertEquals("The size of the FruitArray object is unexpected.", fruitArrayList.getSize(), fruitsExpected.length);
        // why not assertArrayEquals( ... )   
		for (int i = 0; i < fruitsExpected.length; i++) {
			assertTrue(fruitArrayList.getFruitsAsArrayList().get(i).equals(fruitsExpected[i]));
		}
    }


	@Test
    public void testDeleteIgnoreCaseByDeletingLast() {
    	// why not this: String[] fruits = {"Apple", "Banana", "Kiwi", "Mango", "Orange"};
		// Because by using new, we explicitly create a new referentially instant of the String
		// while the other may reuse an instance from a distinct constant pool
		String[] fruits = {new String("Apple"), new String("Banana"), new String("Kiwi"), new String("Mango"), new String("Orange")};
        FruitArrayList fruitArrayList = new FruitArrayList(fruits);      
        
        fruitArrayList.delete(new String("orangE"));
        String[] fruitsExpected = {new String("Apple"), new String("Banana"), new String("Kiwi"), new String("Mango")};

        
        assertEquals("The size of the FruitArray object is unexpected.", fruitArrayList.getSize(), fruitsExpected.length);
        // why not assertArrayEquals( ... )        
		for (int i = 0; i < fruitsExpected.length; i++) {
			assertTrue(fruitArrayList.getFruitsAsArrayList().get(i).equals(fruitsExpected[i]));
		}
	}
}
