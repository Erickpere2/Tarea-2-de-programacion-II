
package conversor_de_Kb_a_Mb;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class conversor_de_Kb_a_Mb {

   
    public static void main(String[] args) throws Exception{
        BufferedReader teclado;
       double Mb;
       double Kb = 0;
       String linea;

       teclado = new BufferedReader( new InputStreamReader(System.in) );

       System.out.print("Cual es la cantidad de Kilobyte  a convertir: ");
       linea = teclado.readLine();
       Kb = Integer.parseInt(linea);
       Mb = Kb/1024;
       System.out.println(Mb+" Megabyte equivalen a: "+Kb+" byte");
     
}
}