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
    public Trainer()
    {
          
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter your name:");
        this.name = keyboard.nextLine();
        
        connectToServer();
        
        party.add(new Bundowl());
        
        
    }
    
    public void connectToServer(){
        server = Server.getServer();  
        server.addTrainer(this);
        server.introduce(this);
    }
    
    public void listPary(){
        
        int i = 1;
        
        for (Ystav y : party){
            
            System.out.println("#" + i + ": " + y.getName());
            i++;
            
        }
        
    }


}