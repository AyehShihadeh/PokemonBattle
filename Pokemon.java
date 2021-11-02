import java.util.ArrayList;
import java.util.List;

public abstract class Pokemon{
    public 
    abstract void attack(Pokemon other); //this pokemon will attack other pokemon
    abstract void speak(); 
    abstract void randomMove(Pokemon other); //pc uses random attack or item


    //variables of a pokemon
    protected int hitpoints, maxhp, maxpp;
    protected int powerpoints; 
    protected String pokeName, pokeType;
    protected List<String> pokeAttacks = new ArrayList<String>(); //list of attacks the pokemon has


    public Pokemon(){ //default constructor
        hitpoints=1;
        maxhp=1;
        powerpoints=1;
        maxpp=1;
        pokeName="no name";
        pokeType="none";
        pokeAttacks=List.of("poop", "eat", "sleep");
    }

    public Pokemon(int hp, int mhp, int pp, int mpp, String name, String t, List<String> att){//param constructor
        hitpoints=hp;
        maxhp=mhp;
        powerpoints=pp;
        maxpp=mpp;
        pokeName=name;
        pokeType=t;
        pokeAttacks=att;
    }

    //accessors and muators
    public void sethp(int hp){
        hitpoints=hp;
    }

    public void setmaxhp(int mhp){
        maxhp=mhp;
    }

    public void setpp(int pp){
        powerpoints=pp;
    }
    public void setmaxpp(int mpp){
        maxpp=mpp;
    }

    public void setPokeName(String n){
        pokeName=n;
    }

    public void setType(String t){
        pokeType=t;
    }

    public void setAttacks(List<String> att){
        pokeAttacks= att;
    }

    public int gethp(){
        return hitpoints;
    }

    public int getmaxhp(){
        return maxhp;
    }

    public int getpp(){
        return powerpoints;
    }

    public int getmaxpp(){
        return maxpp;
    }

    public String getPokeName(){
        return pokeName;
    }

    public String getType(){
        return pokeType;
    }

    public List<String> getAttacks(){
        return pokeAttacks;
    }


}//end of Pokemon class