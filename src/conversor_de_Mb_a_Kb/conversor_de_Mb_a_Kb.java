
package conversor_de_Mb_a_Kb;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class conversor_de_Mb_a_Kb {

    
    public static void main(String[] args) throws Exception{
        BufferedReader teclado;
       int Mb;
       double Kb;
       String linea;

       teclado = new BufferedReader( new InputStreamReader(System.in) );

       System.out.print("Cual es la cantidad de Megabyte a convertir: ");
       linea = teclado.readLine();
       Mb = Integer.parseInt(linea);
       Kb = Mb*1024;
       System.out.println(Kb+" Kilobyte equivalen a: "+Mb+" Megabyte");
     
}
}