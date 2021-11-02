public class ComputerPlayer extends Player {

    public ComputerPlayer(Pokemon p, Item i){ //in main we do this.
        super(p,i);
    }

    public ComputerPlayer(Pokemon p){
        super(p);
    }

    public ComputerPlayer(Item i){
        super(i);
    }

    public void run() {
        System.out.println("Other trainer ran away!");
    }
}
