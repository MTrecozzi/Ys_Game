
/**
 * Write a description of class Move here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Move
{
    // instance variables - replace the example below with your own
    String name;
    String type;
    
    String desc;

    /**
     * Constructor for objects of class Move
     */
    public Move(String _name, String _type)
    {
        this.name = _name;
        this.type = _type;
      
    }
    
    public Move() {
        
    }
    
    public void target(Ystav _target) {
        
        
    }
    
    public String getName(){
        return this.name;
    }



}
