import java.util.ArrayList;
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
        
     System.out.println(_trainer.name + " has joined the server");   
    }
    
    public void showLobby() {
        
        System.out.println("In Lobby: ");
        
        for (Trainer trainer : trainers) {
            
         System.out.println(trainer.name);
        }
    }

}
