
package contador_de_digitos;

import java.util.Scanner;


public class contador_de_digitos {

  
    public static void main(String[] args) {
    Scanner ingreso = new Scanner(System.in);
    int numero, cociente, divisor, contador;
    cociente = 0;
    divisor = 1;
    contador = 0;
    System.out.print("Ingresa un numero: ");
    numero = ingreso.nextInt();
    while (cociente != 1){
      contador ++;
      divisor = divisor * 10;
      cociente = numero / divisor;
      if (cociente == 1){
        System.out.println("El numero tiene: "+ (contador + 1) + " digitos");
      }//fin if
      if (cociente < 1){
        System.out.println("El numero tiene: "+ contador + " digitos");
        cociente = 1;
      }//fin if
            
      if (numero < 10){
        System.out.println("Solo tiene un digito");
        cociente = 1;
      }//fin if
    }//fin while
       
}
}

