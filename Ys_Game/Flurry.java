
/**
 * Write a description of class Flurry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Flurry extends Move
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class Flurry
     */
    public Flurry()
    {
        name = "Flurry";
        type = "Ice";
        desc = "Sends a chilling barage of ice at the foe, dealing damage and reducing their speed.";
     
    }
    
    public void target(Ystav target) {
        target.speed -= target.speed / 2;
    }

}
