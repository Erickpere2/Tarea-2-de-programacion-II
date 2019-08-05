
package numero_par_y_si_es_divisible_en_cinco;

import java.util.Scanner;


public class numero_par_y_si_es_divisible_en_cinco {

  
    public static void main(String[] args) {
        
            Scanner kb = new Scanner(System.in);
            System.out.println("Escribir primer numero ");
            int x = kb.nextInt();
            System.out.println("Escribir segundo numero");
            int y = kb.nextInt();

            if (x % y == 0) {

                  System.out.println(x + " es divisible por " + y);

            } else {

                  System.out.println(x + " es divisible por " + y);
            }

      }
     }