import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Trainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trainer
{
    
    Server server;
    String name;
    ArrayList<Ystav> party = new ArrayList<>();
    
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class Trainer
     */
    public Trainer(String _name)
    {
        // Scanner keyboard = new Scanner(System.in);
        // System.out.println("Please enter your name:");
        // this.name = keyboard.nextLine();   
        this.name = _name;
        
        connectToServer();
        
        addToParty(new Bundowl());
        
        
    }
    
    public void addToParty(Ystav _ystav) {
        party.add(_ystav);   
    }
    
    public void connectToServer(){
        server = Server.getServer();  
        server.addTrainer(this);
        server.introduce(this);
    }
    

    
    public String getName() {
     return this.name;
        
    }
    
    public void challenge(String _toChallenge) {
        
        server.displayChallenge(this, _toChallenge);
    }
    
    public void listPartyNumbered(){  
         int i = 1;
         System.out.println(this.getName() + "'s Party: ");
        
         for (Ystav y : party){
            
             System.out.println("#" + i + ": " + y.getName());
             i++;
            
         }
        
     }
    
     // Using Lambda's
    public void listParty() {
        
        int i = 1;
        System.out.println(this.getName() + "'s Party: ");
        
        party.forEach(
            (partyMember) -> {
                System.out.println(partyMember.getName());
            }
        );
        
    }
    


}
