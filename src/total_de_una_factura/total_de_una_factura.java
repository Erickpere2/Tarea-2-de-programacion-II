
package total_de_una_factura;
import java.util.Scanner;

public class total_de_una_factura {


    public static void main(String[] args) {
       int n1,total;
       
    Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca su base imponible: " );
        n1 = teclado.nextInt();


        total = n1*100/12;

        System.out.println( "el total de su factura es: " + total +  "." );
    }
}