package my.t2gui1;

public class Cliente {
    private String nombre;
    private String cedula;
    private Descuentos compra;

    public Cliente()
    {
        nombre = "";
        cedula = "";
        compra = null;
    }
    
    public Cliente(String n, String c, Descuentos d)
    {
        nombre = n;
        cedula = c;
        compra = d;
    }      
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String c) {
        cedula = c;
    }

    public Descuentos getCompra() {
        return compra;
    }

    public void setCompra(Descuentos c) {
        compra = c;
    }        
}
