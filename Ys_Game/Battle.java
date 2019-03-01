
/**
 * Write a description of class Battle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battle
{
    // instance variables - replace the example below with your own
    public Trainer t1;
    public Trainer t2;

    /**
     * Constructor for objects of class Battle
     */
    public Battle(Trainer _t1, Trainer _t2)
    {
        // initialise instance variables
        this.t1 = _t1;
        this.t2 = _t2;
       
    }
    
    public void BattleManagement() {
        
        System.out.println("The Battle has Begun!");   
        
    }
    
    public void displayMoves(Ystav _activeYstav){
        
        int i = 1;
        
        for (Move move : _activeYstav.getMoves()){
            
            System.out.println("Move " + i + ": " + move.getName());
            
        }
    }
    
    

}
