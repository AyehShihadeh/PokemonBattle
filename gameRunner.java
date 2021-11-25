import java.util.List;
import java.util.Scanner;

public class gameRunner {
    public static void main(String[] args){

        Primape primape = new Primape(135, 135, 80, 80,"PRIMAPE", "fighting", List.of("KARATE CHOP", "FURY SWIPES", "THUNDER PUNCH", "SEISMIC TOSS"));
        HealPotion heal = new HealPotion();

        Fearow fearow = new Fearow(125, 125, 85, 85, "FEAROW", "flying", List.of("SKY ATTACK", "DRILL RUN", "FURY ATTACK", "DRILL PECK"));
        PowerPointPotion ppPot = new PowerPointPotion();

        Scanner obj1 = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);
        Scanner obj3 = new Scanner(System.in);
        Scanner obj4 = new Scanner(System.in);
        Scanner obj5 = new Scanner(System.in);
        

        System.out.println("You're walking through a new town...");
        System.out.println("A trainer approcahes you and asks for a battle...");
        System.out.print("Do you accept?(y/n): ");
        String input1 = obj1.nextLine(); //input1 stores user input
        do{

            if(input1.equals("n")){ //if user declines battle
                System.out.println("You decline kindly and go about your journey on becoming the greatest trainer to exist!");
                System.exit(0);
            }//end of if user denies battle

            else{ //if user accepts battle
                System.out.print("Choose your pokemon!(1- fearow / 2-primape): ");
                String input2 = obj2.nextLine(); 

                if(input2.equals("1")){ //if user chose 1/fearow
                    HumanPlayer me = new HumanPlayer(fearow); //create you player
                    ComputerPlayer pc = new ComputerPlayer(primape); //create cp player and set other pokemon
                    System.out.println("You chose fearow!");
                    fearow.speak();
                    System.out.print("Now choose your item!(1-healing pot / 2-powerpoint pot): ");
                    String input3 = obj3.nextLine();
                    do{
                        if(input3.equals("1")){//if user chose healing pot
                            me.setItem(heal);
                            me.setitemcount(1);
                            pc.setItem(ppPot);//set to remaining item
                            pc.setitemcount(1);
                            System.out.println("You obtained a +50 hp pot and put it in your bag");
                        }
                        else if(input3.equals("2")){
                            me.setItem(ppPot);
                            me.setitemcount(1);
                            pc.setItem(heal);//set to remaining item
                            pc.setitemcount(1);
                            System.out.println("You obtained a +25 pp pot and put it in your bag");
                        }
                        else{
                            System.out.println("Please pick a valid option");
                            System.out.print("Now choose your item!(1-healing pot / 2-powerpoint pot): ");
                            input3 = obj3.nextLine();
                        }
                    }while(!(input3.equals("2") || input2.equals("1")));//while input is not valid


                        System.out.println("...BATTLE STARTING...");
                        System.out.println("TRAINER THOMAS CHOSE " + primape.getPokeName());
                        System.out.println("GO! " + fearow.getPokeName() + "!");

                    
                        do{
                        System.out.println("\nWhat will " + fearow.getPokeName() + " do?");
                        System.out.println(fearow.getPokeName() + ": " + fearow.gethp() + "/" + fearow.getmaxhp() +
                        "hp   " + fearow.getpp() + "/" + fearow.getmaxpp() + "pp");
                        System.out.print("Choose to: 1-FIGHT, 2-RUN, OR 3-USE ITEM : ");
                        String input4 = obj4.nextLine();
                        if(input4.equals("2")){ //if user runs
                            me.run();
                            System.out.println("GAME OVAR YOU BIG BABAY FOR RUNNING AWAY YA KHARA TU 3LAIK");
                            System.exit(0); //here? probably not?
                        }
                        else if(input4.equals("3")){//if user uses item
                          if (me.getItem().equals(heal)){
                              if(fearow.gethp() == fearow.getmaxhp()){
                                  System.out.println(fearow.getPokeName() + " already has full hp...");
                              }
                              else if (me.getitemcount()==1){
                               heal.use(fearow);
                               me.setitemcount(0);

                              //PC RANDOM MOVE
                               if(primape.gethp() <= 70 || primape.getpp() <=50 ){
                                if(pc.getItem().equals(heal)&& pc.getitemcount()==1){
                                heal.use(primape);
                                pc.setitemcount(0);
                                }
                                else if(pc.getItem().equals(ppPot)&& pc.getitemcount()==1){
                                ppPot.use(primape);
                                pc.setitemcount(0);
                                }
                                else
                                primape.randomMove(fearow);
                            }
                                else
                                primape.randomMove(fearow);
                           }

                           else if(me.getitemcount()==0){
                               System.out.print("No more items, choose again...");
                           }
                          }//end of if we have heal

                          else if(me.getItem().equals(ppPot)){
                              if (fearow.getpp() == fearow.getmaxpp()){
                                System.out.println(fearow.getPokeName() + " already has full power points...");
                              }
                              else if(me.getitemcount()==1){
                              ppPot.use(fearow);
                              me.setitemcount(0);

                             //PC RANDOM MOVE
                             if(primape.gethp() <= 70 || primape.getpp() <=50 ){
                                if(pc.getItem().equals(heal)&& pc.getitemcount()==1){
                                heal.use(primape);
                                pc.setitemcount(0);
                                }
                                else if(pc.getItem().equals(ppPot)&& pc.getitemcount()==1){
                                ppPot.use(primape);
                                pc.setitemcount(0);
                                }
                                else
                                primape.randomMove(fearow);
                            }
                             else
                             primape.randomMove(fearow);
                             }   

                             else if(me.getitemcount()==0){
                                System.out.println("No more items, choose again...");
                             }

                            }//end of if we have power pot
                    }//end of use item


                        else if(input4.equals("1")){//if user attack other pokemon
                            fearow.attack(primape);


                            //PC RANDOM MOVE
                            if(primape.gethp() <= 70 || primape.getpp() <=50 ){
                                if(pc.getItem().equals(heal)&& pc.getitemcount()==1){
                                heal.use(primape);
                                pc.setitemcount(0);
                                }
                                else if(pc.getItem().equals(ppPot)&& pc.getitemcount()==1){
                                ppPot.use(primape);
                                pc.setitemcount(0);
                                }
                                else
                                primape.randomMove(fearow);  
                            }
                            else
                            primape.randomMove(fearow);    
                        }//end of is user attacks 
                    
                      }while(input1.equals("y"));//continue if user keeps attackig or uses item and hp is not 0
                       System.out.println("Your FEAROW has fainted!");
           
                }//end of if chose fearow


                else if (input2.equals("2")){ //if user chose 2/primape
                    HumanPlayer me = new HumanPlayer(primape);
                    ComputerPlayer pc = new ComputerPlayer(fearow);
                    System.out.println("You chose primape!  ");
                    primape.speak();
                    System.out.print("Now choose your item!(1-healing pot / 2-powerpoint pot): ");
                    String input3 = obj3.nextLine(); //why am i redefining input3?
                    if(input3.equals("1")){//if user chose healing pot
                        me.setItem(heal);
                        me.setitemcount(1);
                        pc.setItem(ppPot);//set pc to have remaining item
                        pc.setitemcount(1);
                        System.out.println("You obtained a +50 hp pot and put it in your bag");
                    }
                    else if(input3.equals("2")){//if user chose power point pot
                        me.setItem(ppPot);
                        me.setitemcount(1);
                        pc.setItem(heal);//set pc to have remianing item
                        pc.setitemcount(1);
                        System.out.println("You obtained a +25 pp pot and put it in your bag");
                    }

                    System.out.println("...BATTLE STARTING...");
                    System.out.println("TRAINER THOMAS CHOSE " + fearow.getPokeName());
                    System.out.println("GO! " + primape.getPokeName() + "!");

                    do{
                        System.out.println("What will " + primape.getPokeName() + " do?");
                        System.out.println(primape.getPokeName() + ":" + primape.gethp() + "/" + primape.getmaxhp() +
                        "hp   " + primape.getpp() + "/" + primape.getmaxpp() + "pp");
                        System.out.print("Choose to: 1-FIGHT, 2-RUN, 3-USE ITEM : ");
                        String input4 = obj4.nextLine();
                        if(input4.equals("2")){//if user runs
                            me.run();
                            System.out.println("GAME OVAR YOU BIG BABAY FOR RUNNING AWAY YA KHARA TU 3LAIK");
                            System.exit(0);
                        }//end of if user runs

                        else if(input4.equals("3")){ //if user chose use item
                            if(me.getItem().equals(heal)){
                                if(primape.gethp()==primape.getmaxhp()){
                                    System.out.println(primape.getPokeName() + " already has full hp...");
                                }else if (me.getitemcount()==1){
                                 heal.use(primape);
                                 me.setitemcount(0);

                                 //PC RANDOM MOVE
                                if(fearow.gethp() <= 70 || fearow.getpp() <=50 ){
                                    if(pc.getItem().equals(heal) && pc.getitemcount()==1){
                                    heal.use(fearow);
                                    pc.setitemcount(0);
                                    }
                                    else if(pc.getItem().equals(ppPot)&& pc.getitemcount()==1){
                                    ppPot.use(fearow);
                                    pc.setitemcount(0);
                                    }
                                    else
                                    fearow.randomMove(primape);  
                                }
                                else
                                fearow.randomMove(primape);  
                             }  

                             else if(me.getitemcount()==0){
                                System.out.print("No more items, choose again...");

                             }

                            }//end of if user uses heal

                            else if(me.getItem().equals(ppPot)){
                                if(primape.getpp()==primape.getmaxpp()){
                                    System.out.println(primape.getPokeName() + " already has full power points");
                                }
                                else if(me.getitemcount()==1){
                                ppPot.use(primape);
                                me.setitemcount(0);

                                 //PC RANDOM MOVE
                                if(fearow.gethp() <= 70 || fearow.getpp() <=50 ){
                                if(pc.getItem().equals(heal)&& pc.getitemcount()==1){
                                heal.use(fearow);
                                pc.setitemcount(0);
                                }
                                else if(pc.getItem().equals(ppPot)&& pc.getitemcount()==1){
                                ppPot.use(fearow);
                                pc.setitemcount(0);
                                }
                                else
                                fearow.randomMove(primape);  
                                }
                                else
                                fearow.randomMove(primape);
                             }
                            }//end of if user uses power point pot
                        }//end of if user uses item
                        
                            else if(input4.equals("1")){//if user chose attack
                                primape.attack(fearow);

                                //PC RANDOM MOVE
                                if(fearow.gethp() <= 70 || fearow.getpp() <=50 ){
                                    if(pc.getItem().equals(heal)&& pc.getitemcount()==1){
                                    heal.use(fearow);
                                    pc.setitemcount(0);
                                    }
                                    else if(pc.getItem().equals(ppPot)&& pc.getitemcount()==1){
                                    ppPot.use(fearow);
                                    pc.setitemcount(0);
                                    }
                                    else
                                    fearow.randomMove(primape);  
                                    }
                                    else
                                    fearow.randomMove(primape);

                           }//end of if user attacks
                    }while(input1.equals("y"));//continue if user keeps attackig or uses item and hp is not 0
                    System.out.println("Your PRIMAPE has fainted!");
                }//end of else-if user chose primape


                else if(!(input2.equals("1") || input2.equals("2"))){
                    System.out.println("Invalid input");
                }

            }//end of if user accepts battle   

            input1="n";
        }while(input1.equals("y"));//end of main do-while loop

        System.out.println("THANKS FOR PLAYING BYEE");
        System.exit(0);
        obj1.close();
        obj2.close();
        obj3.close();
        obj4.close();
        obj5.close();
        
    }//end of main
}//end of gameRunner class
