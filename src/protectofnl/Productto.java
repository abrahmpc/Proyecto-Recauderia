
package protectofnl;

public class Productto 
{
    private int Cantidad;
    private String Descrip;
    private double Precio;
    private double Importe;
    

    public Productto() {
    }

    
    public Productto(int Cantidad, String Descrip, double Precio) {
        this.Cantidad = Cantidad;
        this.Descrip = Descrip;
        this.Precio = Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getDescrip() {
        return Descrip;
    }

    public void setDescrip(String Descrip) {
        this.Descrip = Descrip;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    public double getImporte() {
        return Importe;
    }

    public void setImporte() {
        this.Importe = Precio*Cantidad;
    } 
    

  
}
