
package salario_semanal_condicional;

import java.util.Scanner;

public class salario_semanal_condicional {

    
    public static void main(String[] args)  {  Scanner entrada = new Scanner (System.in);
        
        int horas;
        int sueldo;
        
        System.out.println ("¿Cuantas horas laboro durante la semana?");
        horas = entrada.nextInt();
        
         if (horas < 40) {
      sueldo = 12 * horas;
    } else {
      sueldo= (40 * 12) + ((horas- 40) * 16);
    }
//        sueldo = horas*12;
        
        System.out.println ("El sueldo del trabajador es"+" de: "+sueldo+" euros a la semana ");
    }
}
