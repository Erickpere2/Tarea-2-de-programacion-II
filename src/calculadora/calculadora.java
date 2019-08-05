
package calculadora;

import java.util.Scanner;
public class calculadora {

    
    public static void main(String[] args) {
             int n1, n2, mult,div,suma,resta;
       
    Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca primer número: " );
        n1 = teclado.nextInt();

        System.out.print( "Introduzca segundo número: " );
        n2 = teclado.nextInt();

        mult = n1 * n2;
        div = n1 / n2;
        suma = n1 + n2;
        resta = n1 - n2;

        System.out.println( "La multiplicacion de " + n1 + " por " + n2 + " es: "+mult + "." );
        System.out.println( "La division de " + n1 + " con " + n2 + " es: "+div + "." );
        System.out.println( "La suma de " + n1 + " con " + n2 + " es: "+suma + "." );
        System.out.println( "La resta de " + n1 + " con " + n2 + " es: "+resta + "." );
    }
}