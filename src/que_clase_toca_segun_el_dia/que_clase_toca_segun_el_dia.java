
package que_clase_toca_segun_el_dia;

import java.util.Scanner;
public class que_clase_toca_segun_el_dia {

    public static void main(String[] args)  {
  Scanner dias = new Scanner (System.in);
        System.out.println("1.Lunes");
        System.out.println("2.Martes");
        System.out.println("3.Miercoles");
        System.out.println("4.Jueves");
        System.out.println("5.Viernes");
      
        System.out.println("ingrese el numero del dia de la semana que desea saber");
  int numero = 0;

  while ( numero >7 || numero<1){
   numero =dias.nextInt(); 
  
  switch(numero){
    case 1:
     System.out.println("Este dia tocara Matematica en la mañana");
     break;
    case 2:
     System.out.println("Este dia tocara Programción en la mañana");
     break;
    case 3:
     System.out.println("Este dia tocara Cálculo en la mañana");
     break;
    case 4:
     System.out.println("Este dia tocara Programción en la mañana");
     break;
    case 5:
     System.out.println("Este dia tocara Física en la mañana");
     break;
    case 6:
     System.out.println("Este dia no hay clases");
     break;
    case 7:
     System.out.println("Este dia no hay clases");
     break;
    default:
     System.out.println("ingrese otro dia");
     break;
  }
  
  }
 }
  
  } 
  