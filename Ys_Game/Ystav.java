import java.util.ArrayList;
/**
 * Write a description of class Ystav here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ystav
{
    // instance variables - replace the example below with your own
    public String name; // Name of Species
    public ArrayList<String> types = new ArrayList<>(); // Array List of Types
    public Ability ability; // Passive Ability
    public ArrayList<Move> moves = new ArrayList<>(); // List of Moves

    // Base Stats
    int hp;
    int atk;
    int spAtk;
    int def;
    int spDef;
    int speed;

    /**
     * Constructor for objects of class Ystav
     */
    public Ystav()
    {
        name = "...";
        
        hp = 10;
        atk = 10;
        spAtk = 10;
        def = 10;
        spDef = 10;
        speed = 10;
        
        moves.add(new Flurry());

    }
    
    
    public String getName(){
     
     return this.name;   
        
    }
    
    public ArrayList<Move> getMoves(){
        
        return this.moves;
    }


}
