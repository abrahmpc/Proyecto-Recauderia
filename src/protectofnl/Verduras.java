
package protectofnl;


public class Verduras extends Recauderia
{
    private String n_caja;
    
    public Verduras (String nombre,String color,String klos,String n_caja){
        super(nombre,color,klos);
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