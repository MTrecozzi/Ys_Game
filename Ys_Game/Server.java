import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Server
{
    // instance variables - replace the example below with your own
    public static Server server;
    public ArrayList<Trainer> trainers = new ArrayList<>();
    public ArrayList<Battle> activeBattles = new ArrayList<>();

    /**
     * Constructor for objects of class Game
     */
    
    public Server(){
        
    }
    
    public void addTrainer(Trainer _trainer) { 
        trainers.add(_trainer);     
    }
    
    public static Server getServer()
    {
        if (server == null){
            
            server = new Server();
            
        }
        
        return server;
    }
    
    public void introduce(Trainer _trainer) {
        
     System.out.println("Trainer " + _trainer.name + " has joined the server");   
    }
    
    public void showLobby() {
        
        System.out.println("In Lobby: ");
        
        for (Trainer trainer : trainers) {
            
         System.out.println(trainer.name);
        }
    }
    
    public void displayChallenge(Trainer from, String to) {
        
        Trainer t1 = from;
        Trainer t2 = getTrainer(to);
        
        System.out.println(to + ", " + from.name + " has challenged you to battle, do you accept?");
        Scanner keyboard = new Scanner(System.in);
        
        String answer = keyboard.nextLine();
        
        if (answer.toLowerCase().equals("yes")) {
            
            startBattle(t1, t2);
            
        }
        
        
        
    }
    
    public Trainer getTrainer(String _name) {
        
        for (Trainer trainer : trainers) {
            
         if (trainer.name.equals( _name)) {
             return trainer;
            }
            
        }
        
        System.out.println("No Trainer with that name found");
        return null;
    }
    
    public void startBattle(Trainer t1, Trainer t2) {
        
        
        activeBattles.add( new Battle(t1, t2));
    }

}
