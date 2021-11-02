import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Primape extends Pokemon {

    Random rand = new Random();
    Scanner obj5 = new Scanner(System.in);
    public Primape(int hp, int mhp,int pp, int mpp, String n, String t, List<String> att){
        super(hp, mhp, pp,mpp, n,t, att);
    }


    public void attack(Pokemon other) {

        System.out.println("1- " + this.getAttacks().get(0) + " 5pp");
        System.out.println("2- " + this.getAttacks().get(1) + " 10pp");
        System.out.println("3- " + this.getAttacks().get(2) + " 10pp");
        System.out.println("4- " + this.getAttacks().get(3) + " 10pp");

        boolean go=true;
        String input5 = obj5.nextLine();
    do{
        if(input5.equals("1") && this.getpp()>=5){//if user chose attack option 1- fighting type

            System.out.println(this.getPokeName() + " use " + this.pokeAttacks.get(0) + "!");
            this.setpp(this.getpp() - 5); //updating powerpoint
            int attStr=12;
            int x = rand.nextInt(5);//generates random number 0-4
            if(x==0){ //if half-damage
                other.hitpoints = other.hitpoints - 6;
                System.out.println("It's not very effective...");
            }
            else if(x==1){ //half damage
                other.hitpoints = other.hitpoints - 6;
                System.out.println("It's not very effective...");
            }
            else if(x==2){ //half damage
                other.hitpoints = other.hitpoints - 6;
                System.out.println("It's not very effective...");
            }
            else if(x==3){//if critcal hit
                other.hitpoints = other.hitpoints - ((attStr*3)/2);
                System.out.println("A critical hit!");
            }
            else if(x==4){
                System.out.println(this.getPokeName() + "'s attack missed!");
            }
            go=false;  
        }

        else if(input5.equals("2") && this.getpp()>=10){//if user chose attack option 2- normal type
            System.out.println(this.getPokeName() + " use " + this.pokeAttacks.get(1) + "!");
            this.setpp(this.getpp() - 10); //updating powerpoint
            int attStr=10;
            int x = rand.nextInt(5);//generates random number 0-4
            if(x==0){ 
                other.hitpoints = other.hitpoints - attStr;
            }
            else if(x==1){ 
                other.hitpoints = other.hitpoints - attStr;
            }
            else if(x==2){ 
                other.hitpoints = other.hitpoints - attStr;
            }
            else if(x==3){//if critcal hit
                other.hitpoints = other.hitpoints - ((attStr*3));
                System.out.println("A critical hit!");
            }
            else if(x==4){
                System.out.println(this.getPokeName() + "'s attack missed!");
            }
            go=false;

        }


        else if(input5.equals("3") && this.getpp()>=10){//if user chose attack option 3- thunder type
            System.out.println(this.getPokeName() + " use " + this.pokeAttacks.get(2) + "!");
            this.setpp(this.getpp() - 10); //updating powerpoint
            int attStr=10;
            int x = rand.nextInt(5);//generates random number 0-4
            if(x==0){ // if 2x damage
                other.hitpoints = other.hitpoints - (attStr*2);
                System.out.println("It's super effective!");
            }
            else if(x==1){ //2x damage
                other.hitpoints = other.hitpoints - (attStr*2);
                System.out.println("It's super effective!");
            }
            else if(x==2){ //2x damage
                other.hitpoints = other.hitpoints - (attStr*2);
                System.out.println("It's super effective!");
            }
            else if(x==3){
                other.hitpoints = other.hitpoints - ((attStr*3));
                System.out.println("A critical hit!");
            }
            else if(x==4){
                System.out.println(this.getPokeName() + "'s attack missed!");
            }
            go=false;
        }


        else if(input5.equals("4") && this.getpp()>=10){//if user chose attack option 4- fighting type
            System.out.println(this.getPokeName() + " use " + this.pokeAttacks.get(3) + "!");
            this.setpp(this.getpp() - 10); //updating powerpoint
            int attStr=20;
            int x = rand.nextInt(5);//generates random number 0-4
            if(x==0){ //if half-damage
                other.hitpoints = other.hitpoints -attStr;
                System.out.println("It's not very effective...");
            }
            else if(x==1){ //half damage
                other.hitpoints = other.hitpoints - attStr;
                System.out.println("It's not very effective...");
            }
            else if(x==2){ //half damage
                other.hitpoints = other.hitpoints - attStr;
                System.out.println("It's not very effective...");
            }
            else if(x==3){//if critcal hit
                other.hitpoints = other.hitpoints - ((attStr*3)/2);
                System.out.println("A critical hit!");
            }
            else if(x==4){
                System.out.println(this.getPokeName() + "'s attack missed!");
            }
            go=false;
      }//end of attack4

      else{
        System.out.println("Not enough power points for this move...choose again 1-4");
        input5 = obj5.nextLine(); 
    }
  }while(go);

    System.out.println(other.getPokeName() +": "+other.gethp()+"/"+ other.getmaxhp()); //prints oponent's hp
    if(other.gethp() <= 0){//if pokemon has no hp
        System.out.println(other.getPokeName() + " fainted!");
        System.out.println("You've won!!!");
        System.exit(0);
    }

    else if(this.getpp()==0){
        System.out.println("No more power points! You lost!");
        System.exit(0);
    }
    }//end of attack method


    void speak() {
        System.out.println("AAAARRGGGHHHH");  
    }


    
    void randomMove(Pokemon other) { //pc uses random attack on other
        int x = rand.nextInt(4);


        if(x==0 && (this.getpp()>=12)){// 1- fighting type
            System.out.println(this.getPokeName() + " uses " + this.pokeAttacks.get(0) + ".");
            this.setpp(this.getpp() - 5); //updating powerpoint
            int attStr=12;
            if(x==0){ //if half-damage
                other.hitpoints = other.hitpoints - 6;
                System.out.println("It's not very effective...");
            }
            else if(x==1){ //half damage
                other.hitpoints = other.hitpoints - 6;
                System.out.println("It's not very effective...");
            }
            else if(x==2){ //half damage
                other.hitpoints = other.hitpoints - 6;
                System.out.println("It's not very effective...");
            }
            else if(x==3){//if critcal hit
                other.hitpoints = other.hitpoints - ((attStr*3)/2);
                System.out.println("A critical hit!");
            }
            else if(x==4){
                System.out.println(this.getPokeName() + "'s attack missed!");
            }    
        }

        else if(x==1 && (this.getpp()>=10)){// 2- normal type
            System.out.println(this.getPokeName() + " uses " + this.pokeAttacks.get(1) + ".");
            this.setpp(this.getpp() - 5); //updating powerpoint
            int attStr=10;
            if(x==0){ 
                other.hitpoints = other.hitpoints - attStr;
            }
            else if(x==1){ 
                other.hitpoints = other.hitpoints - attStr;
            }
            else if(x==2){ 
                other.hitpoints = other.hitpoints - attStr;
            }
            else if(x==3){//if critcal hit
                other.hitpoints = other.hitpoints - ((attStr*3));
                System.out.println("A critical hit!");
            }
            else if(x==4){
                System.out.println(this.getPokeName() + "'s attack missed!");
            }
     
        }


        else if(x==2&& (this.getpp()>=10)){// 3- thunder type
            System.out.println(this.getPokeName() + " uses " + this.pokeAttacks.get(2) + ".");
            this.setpp(this.getpp() - 5); //updating powerpoint
            int attStr=10;
            if(x==0){ // if 2x damage
                other.hitpoints = other.hitpoints - (attStr*2);
                System.out.println("It's super effective!");
            }
            else if(x==1){ //2x damage
                other.hitpoints = other.hitpoints - (attStr*2);
                System.out.println("It's super effective!");
            }
            else if(x==2){ //2x damage
                other.hitpoints = other.hitpoints - (attStr*2);
                System.out.println("It's super effective!");
            }
            else if(x==3){
                other.hitpoints = other.hitpoints - ((attStr*3));
                System.out.println("A critical hit!");
            }
            else if(x==4){
                System.out.println(this.getPokeName() + "'s attack missed!");
            }
    
        }


        else if(x==3&& (this.getpp()>=20)){// 4- fighting type
            System.out.println(this.getPokeName() + " uses " + this.pokeAttacks.get(3) + ".");
            this.setpp(this.getpp() - 5); //updating powerpoint
            int attStr=20;
            if(x==0){ //if half-damage
                other.hitpoints = other.hitpoints -attStr;
                System.out.println("It's not very effective...");
            }
            else if(x==1){ //half damage
                other.hitpoints = other.hitpoints - attStr;
                System.out.println("It's not very effective...");
            }
            else if(x==2){ //half damage
                other.hitpoints = other.hitpoints - attStr;
                System.out.println("It's not very effective...");
            }
            else if(x==3){//if critcal hit
                other.hitpoints = other.hitpoints - ((attStr*3)/2);
                System.out.println("A critical hit!");
            }
            else if(x==4){
                System.out.println(this.getPokeName() + "'s attack missed!");
            }
        }
        
        System.out.println(other.getPokeName() +": "+other.gethp()+"/"+ other.getmaxhp()); //prints oponent's hp

        if(other.gethp() <= 0){//if pokemon has no hp
            System.out.println(other.getPokeName() + " fainted!");
            System.out.println("You lost and trainer Rorey won... :(");
            System.exit(0);
        } 

        else if(this.getpp()==0){
            System.out.println("Primape has no more power points. You win!!");
            System.exit(0);
        }
           
    }
 
}
