package edu.cuny.brooklyn.cisc3120;

import java.util.ArrayList;

/*
 * Wrapper for ArrayList 
 */
public class FruitArrayList {
	ArrayList<String> fruits;
	
	public FruitArrayList() {
		fruits = new ArrayList<String>();
	}
	
	
	public void add(String fruitName) {
		fruits.add(fruitName);
	}
	
	// ---------------------------------------------
	// added a few methods to support unit tests
	public FruitArrayList(String[] fruitArray) {
		fruits = new ArrayList<String>();
		for(int i = 0; i < fruitArray.length; i++)
			fruits.add(fruitArray[i]);
	}

	public int getSize() {
		return fruits.size();
	}

	public ArrayList<String> getFruitsAsArrayList() {
		return fruits;
	}

	// ---------------------------------------------
	
	public void delete(String fruitName) {
		// this takes care of removing the string in the list and ignoring the cases
		int i;
		for(i = 0; i < fruits.size(); i++)
			if(fruits.get(i).equalsIgnoreCase(fruitName))
				fruits.remove(i);

		// TODO: 1. implement this method.
		/* TODO: 2. you may need to consult Java API documentation for the ArrayList class. 
		 *          Write a comment in the code, the method of the ArrayList class you
		 *          look up and the URL to the documentation the method 
		 */
	}
	
	public void printAll() {
		for (int i=0; i<fruits.size(); i++) {
			System.out.println("fruits[" + i + "] = \"" + fruits.get(i) + "\"");
		}
	}
}
