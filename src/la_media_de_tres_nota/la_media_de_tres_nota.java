
package la_media_de_tres_nota;

import java.util.Scanner;


public class la_media_de_tres_nota {

    public static void main(String[] args) { 
int num1, num2, num3, suma,media ; 
Scanner entrada = new Scanner (System.in) ; 
System.out.println ("Ingrese nota 1"); 
num1 = entrada.nextInt() ; 
System.out.println ("Ingrese nota 2" ); 
num2 = entrada.nextInt() ; 
System.out.println ("Ingrese nota 3" ); 
num3 = entrada.nextInt() ; 
suma = (num1 + num2 + num3) ; 
media = (suma/3) ; 

System.out.println ("la media es: " +media) ; 

} 
} 



    
  
  