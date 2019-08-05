
package acceso_a_caja_fuerte;

import java.util.Scanner;


public class acceso_a_caja_fuerte {

    public static void main(String[] args) {
   	Scanner teclado= new Scanner(System.in);
		int login=0;
		int pass=0;
		int intentos=1;
		int maximo=3;
			
				while((login!=12)||(pass!=1234)&& (intentos<maximo)){
					
					System.out.print("introduzca numero de usuario: ");
					login=teclado.nextInt();
					System.out.print("Introduzca su contraseña:");
					pass=teclado.nextInt();
					
					if(intentos==3){
						System.out.println("acceso denegado..");
						intentos=intentos-maximo;
					}
				
					intentos++;
					
				
				
				
			}
			
			
			System.out.println("usuario erick bienvenido...");
			
			
	}

}