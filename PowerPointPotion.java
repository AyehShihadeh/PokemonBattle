public class PowerPointPotion implements Item {
    
    public void use(Pokemon p) {

        if(p.getpp() == p.getmaxpp()){
                System.out.println(p.getPokeName() + " already has full power points");
        }else{
        System.out.println( p.getPokeName() +" got power restore, it fully increases power points!");
        p.setpp(p.getmaxpp());//set's to max pp
        }
        
    }
    
}
