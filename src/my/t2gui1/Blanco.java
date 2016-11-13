
package my.t2gui1;

public class Blanco  extends Camaron{
    
    public Blanco(){
        precio = 0;
        kilos = 0;
        name = "Blanco";
        scientificName = "Litopenaeus vannamei";
        size = "9cm";
        color = "Blanco";
        weight = "3g - 5g";
    }
    
      
     @Override
    public String getName(){
    return "Blanco";
    }
    
    
    @Override
    public String getScientificName(){
    return "Litopenaeus vannamei";
    }
    
    
     @Override
    public String getSize(){
    return "9cm";
    }
    
     @Override
    public String getColor(){
    return "blanco";
    }
    
     @Override
    public String getWeight(){
    return "3g - 5g";
    }
}
