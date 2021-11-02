public class HealPotion implements Item {

    public void use(Pokemon p) {
        
        if(p.gethp()==p.getmaxhp())
            System.out.println(p.getPokeName()+" already has full hp.");
        
        else {
            System.out.println(p.getPokeName() +" uses the healing potion, it fully heals!");
            p.sethp(p.getmaxhp());
        }           
    }   
}
