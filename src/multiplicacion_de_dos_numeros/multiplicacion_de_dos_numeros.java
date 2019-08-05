
package multiplicacion_de_dos_numeros;

import java.util.Scanner;
public class multiplicacion_de_dos_numeros {

   
    public static void main(String[] args) {
       int n1, n2, multiplicacion;
       
    Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca primer número: " );
        n1 = teclado.nextInt();

        System.out.print( "Introduzca segundo número: " );
        n2 = teclado.nextInt();

        multiplicacion = n1 * n2;

        System.out.println( "La multiplicacion de " + n1 + " por " + n2 + " es: "+multiplicacion + "." );
    }
}