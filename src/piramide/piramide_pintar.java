
package piramide;

public class piramide_pintar {

   
    public static void main(String[] args)  {
       
    System.out.print("Introduzca el carácter con el que quiera dibujar la pirámide: ");
    String caracter = System.console().readLine();
    
    System.out.print("Introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    int cantidad = 1;//esta variable es la cantidad de variables que se dibujaran
    int espacios = 0;//el numero de espacios que necesitaremos
    
    
    for (int i = 0; i < altura; i++) {
      espacios++;
    }
    
    System.out.println();
    
    for (int i = 0; i < altura; i++) {
      //dibujamos los espacios sin saltar de linea
      for (int n = 0; n < espacios; n++) {
        System.out.print(" ");
      }
      espacios--;
      //una vez dibujados, pintamos los caracteres
      for (int n = 1; n <= cantidad; n++) {
        System.out.print(caracter);
      }

      cantidad += 2;
      System.out.println();
    }
  }
}