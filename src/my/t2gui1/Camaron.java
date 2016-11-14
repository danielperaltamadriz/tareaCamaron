package my.t2gui1;

public class Camaron {
    protected String tipo;
    protected  int precio;
    protected  int limiteA;
    protected  int limiteB;
    protected double kilos;
    protected  double descA;
    protected  double descB;
    protected String name;
    protected String scientificName;
    protected String size;
    protected String color;
    protected String weight;   

    public double getDescA() {
        return descA;
    }

    public void setDescA(double descA) {
        this.descA = descA;
    }

    public double getDescB() {
        return descB;
    }

    public void setDescB(double descB) {
        this.descB = descB;
    }        

    public int getLimiteA() {
        return limiteA;
    }

    public void setLimiteA(int limiteA) {
        this.limiteA = limiteA;
    }

    public int getLimiteB() {
        return limiteB;
    }

    public void setLimiteB(int limiteB) {
        this.limiteB = limiteB;
    }
    

    public String getName() {
        return name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getWeight() {
        return weight;
    }    
    public Camaron() {
        tipo = "";
        precio = 0;
        kilos = 0;
        name = "";
        scientificName = "";
        size = "";
        color = "Rosado";
        weight = "";
    }

    public void setPrecio(int p) {
        precio = p;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public double getKilos() {
        return kilos;
    }

    public void setKilos(double k) {
        kilos = k;
    }
    
    public double getTotal(){
        return kilos * precio;
    }
}
