
package protectofnl;
import java.io.*;




public class ProtectoFnl {
    private static BufferedReader stdIn = new BufferedReader( new InputStreamReader( System.in ));

    
    public static void main(String[] args) throws IOException
    {
        
        String z,w,x,y,a,b,c,d,p,q,r,s;
        
        System.out.println("\t--DATOS DE FRUTA--");
        System.out.println("Nombre De Fruta: ");
        z=stdIn.readLine();
        System.out.println("Color De Fruta: ");
        w=stdIn.readLine();
        System.out.println("Cuantos kilos De Fruta: ");
        x=stdIn.readLine();
        System.out.println("Codigo de caja: ");
        y=stdIn.readLine();
        
        System.out.println("--------------------------------------");
        
        System.out.println("\t--DATOS DE VERDURA--");
        System.out.println("Nombre De Verdura: ");
        a=stdIn.readLine();
        System.out.println("Color De Verdura: ");
        b=stdIn.readLine();
        System.out.println("Cuantos kilos De Verdura: ");
        c=stdIn.readLine();
        System.out.println("Codigo de caja: ");
        d=stdIn.readLine();
        
        System.out.println("--------------------------------------");
        /*
        System.out.println("\t--DATOS DE SEMILLA--");
        System.out.println("Nombre De Semilla: ");
        p=stdIn.readLine();
        System.out.println("Color De Semilla: ");
        q=stdIn.readLine();
        System.out.println("Cuantos kilos De Semilla: ");
        r=stdIn.readLine();
        System.out.println("Codigo de caja: ");
        s=stdIn.readLine();
        */
        
        
        
        
            System.out.println("\n\t--PRODUCTOS DE RECAUDERIA--"); 
            int numProd = 5, cajas, ct;  
            String des;
            double precio,total=0;       
            boolean flag;
            Productto productos[] = new Productto[numProd];
            System.out.println("\nCuantos cajas son: "); 
            cajas=Integer.parseInt(stdIn.readLine());
            Productto linea = new Productto();
            for(int i=0; i<cajas; i++)
            {
                flag=true;
                do
                {
                    try
                    {
                        System.out.print("\nCantidad: ");
                        ct=Integer.parseInt(stdIn.readLine());
                        System.out.print("\nDescripcion: ");
                        des=stdIn.readLine();
                        System.out.print("\nCual es el precio: ");
                        precio=Double.parseDouble(stdIn.readLine());
                        linea = new Productto(ct,des,precio);
                        productos[i] = linea;
                        productos[i].setImporte();
                        total+=productos[i].getImporte();
                        flag=false;
                    }                                                       
                    catch (NumberFormatException e)
                    {
                        System.out.println("No es un numero lo que tecleaste! :( ");
                    }
                }
                while(flag);  
            }
            
        System.out.println("\n\"  RECAUDERIA   ' EL MARRANITO FELIZ '  \"");
        System.out.println("\t--DATOS DE FRUTA--");
        Frutas MIFRUTA= new Frutas(z,w,x,y);
        System.out.println(MIFRUTA.Mostrar());
        System.out.println("--------------------------------------");
        System.out.println("\t--DATOS DE VERDURA--");
        Verduras MIVERDURA= new Verduras (a,b,c,d);
        System.out.println(MIVERDURA.Mostrar());
        System.out.println("--------------------------------------");
        System.out.println("\t--DATOS DE SEMILLA--"); //p,q,r,s
        Semillas MISEMILLAS= new Semillas("frijolito","negro","2","1234");
        System.out.println(MISEMILLAS.Mostrar());
        System.out.println("--------------------------------------");
        System.out.println("\t--ENTREGA DE PEDIDO--");
       for(int i=0; i<cajas; i++)
           
        {
            System.out.println("\nN° DE CAJAS: ");
            System.out.print(productos[i].getCantidad()+"\t\n");
            System.out.println("\nDESCRIPCION DEL PRODUCTO: ");
            System.out.print(productos[i].getDescrip()+"\t\n");
            System.out.println("\nPRECIO: ");
            System.out.print(productos[i].getPrecio()+"\t\n");
            System.out.println("\nTOTAL: ");
            System.out.print(productos[i].getImporte());
            System.out.println("\n");
            
            }
        
        
        
    }
    
}