
package protectofnl;

public class Semillas extends Recauderia
{
    private String n_caja;
    
    public Semillas (String nombre,String color,String precio,String n_caja){
        super(nombre,color,precio);
        this.n_caja=n_caja;
    }
    public String getN_caja() {
        return n_caja;
    }

    public void setN_caja(String n_caja) {
        this.n_caja = n_caja;
    }
    
     public String Mostrar(){
        return super.Mostrar()+"\nCodigo de caja: "+n_caja;
    }
    
}
