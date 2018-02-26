package Practice.CISC3120.FlowControl;

import java.util.Random;

public class FlowControl {
	void generate() {
		Random rand = new Random(3);
		int curr, next;
		curr = rand.nextInt(); // Generate a random number from 0 to 499 for the current
		for(int i = 1; i <= 50; i++) {
			next = rand.nextInt(); // Generate a random number from 0 to 499 for the next
			if(curr > next)
				System.out.println(curr + " is greater than " + next);
			else if(curr < next)
				System.out.println(curr + " is less than " + next);
			else
				System.out.println(curr + " is equal to " + next);
			curr = next;
		}
	}
}
