public class HumanPlayer extends Player{

    public HumanPlayer(Pokemon p, Item i){ 
        super(p, i);
    }
   
    public HumanPlayer(Pokemon p){
        super(p);
    }

    public HumanPlayer(Item i){
        super(i);
    }

    public void run() {
        System.out.println("You get away safely");
    }
    
}
