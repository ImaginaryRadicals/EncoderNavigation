
/**
 * Run project code.
 * Potential initialize and run simulations.
 * 
 * @author (Ashley Trowell) 
 * @version (11/5/2016)
 */
public class Main
{

    // Members
    public static EncoderNavigation encoderNav = new EncoderNavigation();

    // Constructor
    public Main()
    {

    }


    public static void main()
    {
        
        System.out.println("Main Function");

        encoderNav.setSteps(10,20);
        //encoderNav.printResults();
        
    }
}
