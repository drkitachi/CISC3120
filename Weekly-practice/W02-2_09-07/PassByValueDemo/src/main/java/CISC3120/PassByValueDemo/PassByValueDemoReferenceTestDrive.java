package CISC3120.PassByValueDemo;

public class PassByValueDemoReferenceTestDrive {
	public static void main(String[] args) {
		// TODO: 1. complete the class using the code in slide 6 of lecture C04
		/* TODO: 2. run the two Java programs, and observe the result, and explain the 
		 *          learning objective of this exercise the instructor has in mind. Write
		 *          the explanation as a comment in this program
		 */
		
		/* Respond: This exercise is to demonstrate that Arrays are objects in java
		 * and when we pass an array to a method, we are basically passing a value
		 * of that array object but the method gets a reference of the array, in this case is x. 
		 * Therefore if we make a change to the array at the method from the class
		 * PassByValueDemoReference, the change will also be reflected here in the 
		 * main method from the Test Drive.
		 */
		
			PassByValueDemoReference demo = new PassByValueDemoReference();
			int[] x = {3};
			System.out.println("main: before calling changeX: x[0] = " + x[0]);
			demo.changeX(x);
			System.out.println("main: after calling changeX: x[0] = " + x[0]);
			
	}
}
