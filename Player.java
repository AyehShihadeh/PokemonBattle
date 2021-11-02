public abstract class Player {
    private Pokemon chosenPokemon;
    private Item chosenItem;
    private int itemcount;

    public abstract void run(); 

    public Player(Pokemon p){
        chosenPokemon=p;
    }

    public Player(Item i){
        chosenItem=i;
    }

    public Player(Pokemon p, Item i) {
        chosenPokemon = p;
        chosenItem = i;
    }


    //mutators:
    public void setitemcount(int i){
        itemcount=i;
    }

    public void setPokemon(Pokemon p){
        chosenPokemon = p;
    }

    public void setItem(Item i){
        chosenItem = i;
    }

    public Item getItem(){
        return chosenItem;
    }

    public Pokemon getPokemon(){
        return chosenPokemon;
    }

    public int getitemcount(){
        return itemcount;
    }


}//end of Player

