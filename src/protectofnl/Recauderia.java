
package protectofnl;

public class Recauderia 
{
    private String nombre;
    private String color;
    private String klos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getklos() {
        return klos;
    }

    public void setPrecio(String klos) {
        this.klos = klos;
    }
    //contrustor
    public Recauderia(String nombre, String color, String klos) {
        this.nombre = nombre;
        this.color = color;
        this.klos = klos;
    }
    public String Mostrar(){
        
        
        return "El nombre es: "+nombre+"\nEl color es: "+color+"\nLos kilos son: "+klos+" kg";
    }
    
}