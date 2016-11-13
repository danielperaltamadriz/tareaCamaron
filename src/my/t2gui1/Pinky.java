
package my.t2gui1;

public class Pinky  extends Camaron{
    
    public Pinky(){
        precio = 0;
        kilos = 0;
        name = "Pinky";
        scientificName = "Pandalus borealis";
        size = "2cm - 3cm";
        weight = "2g - 4g";
    }
    
    @Override
    public String getName(){
    return "Pinky";
    }
    
    
    @Override
    public String getScientificName(){
    return "Pandalus borealis";
    }
    
    
     @Override
    public String getSize(){
    return "2cm - 3cm";
    }
    
     @Override
    public String getWeight(){
    return "2g - 4g";
    }
         
}
