
package convertidor_de_pesetas_a_euros;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util. *; 


public class convertidor_de_pesetas_a_euros {

   
    public static void main(String[] args) throws Exception{
        BufferedReader teclado;
       double pesetas;
       double euros;
       String linea;

       teclado = new BufferedReader( new InputStreamReader(System.in) );

       System.out.print("cantidad de pesetas: ");
       linea = teclado.readLine();
       pesetas = Integer.parseInt(linea);
       euros = pesetas/166;
       System.out.println(pesetas+" pesetas equivalen a: "+euros+" euros");
    }
  }
   