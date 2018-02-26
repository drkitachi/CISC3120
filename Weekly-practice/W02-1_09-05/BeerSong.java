/**
 * To compile it from the Command Line:
 *     javac BeerSong.java
 * To run it from the Command Line:
 *     java BeerSong
 */
public class BeerSong {
    public static void main (String[] args) {
        int beerNum = 99;
        int takeDownNum = 1; 
        //depending on takeDownNum we can have either "it" or "them"
        String takeDownWord = "it"; 

        /* 
         * add command line arguments to set starting bottles of
         * beer and the bottles of beer to take down. However, this
         * revision introduces two bugs to the program. What are they?
         * We had the following statements in the while loop
         * System.out.println("Take one down.");
         * System.out.println("Pass it around.");
         * However this statements only will work if takeDownNum input 
         * from the command line were 1, but that is not the case.
         * in order to fix it, I just have another string to replace the 
         * "it" or "them" and also use the takeDownNum.
         * An exception handling was included as an option for scenario in which the 
         * take down number was higher than the beer numbers inputted from CLI
         * Use of the Math class from the java library to make sure
         * the take down number is always positive.
         *
         * */
        if (args.length == 1) {
            beerNum = Integer.parseInt(args[0]);
        } else if (args.length >= 2) {
            beerNum = Integer.parseInt(args[0]);
            takeDownNum = Math.abs(Integer.parseInt(args[1]));
        }
        
       // try {
        	//if(beerNum < takeDownNum) throw new Exception("The number being take down is greater than the beer number");
        if(takeDownNum > 1)
        	takeDownWord = "them";
        String word = "bottles";
 
        
        while (beerNum > 0 ) {
        	if (beerNum ==1) {
        			word = "bottle";
        	}
            
        	System.out.println(beerNum + " " + word + " of beer on the wall");
        	System.out.println(beerNum + " " + word + " of beer.");
        	//even if takeDownNum != 1, it will say take one down
        	System.out.println("Take " + takeDownNum + " down.");
        	//If more than 1 bottle being taken, it should be them
        	System.out.println("Pass " + takeDownWord + " around."); 
        	beerNum -= takeDownNum;
            
        	if (beerNum > 0) {
        		System.out.println(beerNum + " " + word + " of beer on the wall");
        	} else {
        		System.out.println("No more bottles of beer on the wall.");
        	} // end else
        } // end while loop
        //} catch(Exception message) {
        	//System.err.println(message);
        //}
      } // end main method
} // end class
