
package calcular_la_media_de_un_conjunto;

import java.util.Scanner;


public class calcular_la_media_de_un_conjunto {

   
    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in);
        double numero, suma=0, media;
        int contador=0;
        System.out.println("Este programa calcula la media de una serie de números.");
        System.out.println("Cuando quiera ver la media  introduzca '9'.");
        System.out.println("Introduzca los números:");
        numero = entrada.nextDouble();
        while (numero != 9){
            suma = suma + numero;
            contador++;
            numero = entrada.nextDouble();
        }
        if (numero == 999)
            System.out.println("Ha decidido salir sin introducir números.");
        else{
            media = suma/contador;
            System.out.println("La media de los números introducidos es: "+ media);
        }
    }   
}