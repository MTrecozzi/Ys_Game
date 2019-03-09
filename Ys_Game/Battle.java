
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
        
        BattleManagement();
       
    }
    
    public void BattleManagement() {
        
        System.out.println("The Battle between " + t1.name + " and " + t2.name + " has begun!");
        showParties();
        
    }
    
    void showParties(){
     
        System.out.println(t1.name + "'s Party:");  
        t1.party.stream().map(pMember -> pMember.getName()).forEach(System.out :: println);
        System.out.println();
        
        System.out.println(t2.name + "'s Party:");
        t2.party.stream().map(pMember -> pMember.getName()).forEach(System.out :: println);
        System.out.println();
        
    }
    
    public void displayMoves(Ystav _activeYstav){
        
        int i = 1;
        
        for (Move move : _activeYstav.getMoves()){
            
            System.out.println("Move " + i + ": " + move.getName());
            
        }
    }
    
    

}
