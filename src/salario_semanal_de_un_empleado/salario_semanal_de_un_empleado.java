
package salario_semanal_de_un_empleado;

import java.util.Scanner;
public class salario_semanal_de_un_empleado {

    
    public static void main(String[] args) { 
        Scanner entrada = new Scanner (System.in);
        
        int horas;
        int sueldo;
        
        System.out.println ("¿Cuantas horas laboro durante la semana?");
        horas = entrada.nextInt();
        
        
        sueldo = horas*12;
        
        System.out.println ("El sueldo del trabajador es"+" de: "+sueldo+" euros a la semana ");
    }
}
