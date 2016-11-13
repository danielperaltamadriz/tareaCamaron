
package my.t2gui1;

public class Jumbo  extends Camaron{
    
    public Jumbo(){
        precio = 0;
        kilos = 0;
        name = "Jumbo";
        scientificName = "Pandalus borealis";
        size = "30cm";
        weight = "10g";
    }
    
     @Override
    public String getName(){
    return "Jumbo";
    }
    
    
    @Override
    public String getScientificName(){
    return "Pandalus borealis";
    }
    
    
     @Override
    public String getSize(){
    return "30cm";
    }
    
     @Override
    public String getWeight(){
    return "10g";
    }
}
