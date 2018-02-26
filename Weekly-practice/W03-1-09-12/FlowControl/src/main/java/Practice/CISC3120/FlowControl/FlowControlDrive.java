package Practice.CISC3120.FlowControl;

/**
 * The Flow Control program uses the Flow Control Drive class to call on 
 * the FlowControl class by using it's generate() method to generate
 * 50 random integers from the range 0 to 499 and compares one random number  
 * with the next one to classify them as greater than, less than, or equal to.
 *
 */
public class FlowControlDrive 
{
    public static void main( String[] args )
    {
        FlowControl drive = new FlowControl();
        
        drive.generate();
    }
}
