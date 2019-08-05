
package dia_de_la_semana_segun_el_numero;

import java.util.Scanner;


public class dia_de_la_semana_segun_el_numero {

    
    public static void main(String[] args)  {
  Scanner dias = new Scanner (System.in);
  System.out.println("ingrese un numero para saber a que dia de la semana pertenece");
  int numero = 0;
  while ( numero >7 || numero<1){
   numero =dias.nextInt(); 
  
  switch(numero){
    case 1:
     System.out.println("lunes");
     break;
    case 2:
     System.out.println("martes");
     break;
    case 3:
     System.out.println("miercoles");
     break;
    case 4:
     System.out.println("jueves");
     break;
    case 5:
     System.out.println("viernes");
     break;
    case 6:
     System.out.println("sabado");
     break;
    case 7:
     System.out.println("domingo");
     break;
    default:
     System.out.println("ingreso otro numer0");
     break;
  }
  
  }
   }
  
  }
  