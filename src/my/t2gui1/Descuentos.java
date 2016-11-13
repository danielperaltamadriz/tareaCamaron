package my.t2gui1;


public class Descuentos {
    private Camaron pinky;
    private Camaron blanco;
    private Camaron jumbo;
    private double preciopinky = 0;  
    private double precioblanco = 0;  
    private double preciojumbo = 0; 
    private double precioTotalConDescuento = 0;
    private double precioTotalSinDescuento = 0;
    
    public Descuentos()
{
    pinky = new Pinky();
    blanco = new Blanco();
    jumbo = new Jumbo();  
    
    pinky.setPrecio(5840);
    pinky.setLimiteA(5);
    pinky.setLimiteB(10);
    pinky.setDescA(1.05);
    pinky.setDescB(1.1);
        
    blanco.setPrecio(10045);
    blanco.setLimiteA(7);
    blanco.setLimiteB(15);
    blanco.setDescA(1.07);
    blanco.setDescB(1.15);
        
    jumbo.setPrecio(23200);
    jumbo.setLimiteA(4);
    jumbo.setLimiteB(7);
    jumbo.setDescA(1.04);
    jumbo.setDescB(1.07);
}        
    public double descuento_pinky(double kilos)
    {
        preciopinky = kilos * pinky.getPrecio();
        pinky.setKilos(kilos);
        if (kilos>=pinky.getLimiteA() && kilos<pinky.getLimiteB())
        {
            preciopinky=(preciopinky* ((100 - pinky.getDescA())/100));
        }
        else if (kilos >= pinky.getLimiteB())
        {
            preciopinky=(preciopinky* ((100 - pinky.getDescB())/100));
        }
            return preciopinky;
    }
    
    public double descuento_blanco(double kilos)
    {
        precioblanco = kilos * blanco.getPrecio();
        blanco.setKilos(kilos);
        if (kilos>=blanco.getLimiteA() && kilos<blanco.getLimiteB())
        {
          precioblanco=(precioblanco* ((100 - blanco.getDescA())/100));
        }
        else if (kilos >= blanco.getLimiteB())
        {
            precioblanco=(precioblanco* ((100 - blanco.getDescB())/100));
        }
        return precioblanco;
    }
        
    public double descuento_jumbo(double kilos)
    {
        preciojumbo = kilos * jumbo.getPrecio();
        jumbo.setKilos(kilos);
        if (kilos>=jumbo.getLimiteA() && kilos<jumbo.getLimiteB()){           
            preciojumbo=(preciojumbo* ((100 - jumbo.getDescA())/100));
        }
        else if (kilos >= jumbo.getLimiteB()){
            preciojumbo=(preciojumbo* ((100 - jumbo.getDescB())/100));
        }
        return preciojumbo;  
    }    
    
    public Camaron getPinky() {
        return pinky;
    }

    public Camaron getBlanco() {
        return blanco;
    }

    public Camaron getJumbo() {
        return jumbo;
    }
    
    private void setPrecioConDescuento()
    {
        precioTotalConDescuento = preciojumbo + precioblanco + preciopinky;
    }
    private void setPrecioSinDescuento()
    {
        precioTotalSinDescuento = pinky.getTotal() + blanco.getTotal() + jumbo.getTotal();
    }
        
    public double getPrecioConDescuento()
    {
        setPrecioConDescuento();
        return precioTotalConDescuento;
    }
    public double getPrecioSinDescuento()
    {
        setPrecioSinDescuento();
        return precioTotalSinDescuento;
    }       
}