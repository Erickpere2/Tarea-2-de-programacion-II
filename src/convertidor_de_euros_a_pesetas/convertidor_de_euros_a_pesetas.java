
package convertidor_de_euros_a_pesetas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util. *; 

public class convertidor_de_euros_a_pesetas {

   
    public static void main(String[] args) throws Exception{
        BufferedReader teclado;
       double pesetas;
       double euros;
       String linea;

       teclado = new BufferedReader( new InputStreamReader(System.in) );

       System.out.print("cantidad de euros: ");
       linea = teclado.readLine();
       pesetas = Integer.parseInt(linea);
       euros = pesetas*166;
       System.out.println(pesetas+" euros equivalen a: "+euros+" pesetas");
    }
  }
   
    
    

