
package calcular_el_volumen_de_un_cono;
import java.util.Scanner;


public class calcular_el_volumen_de_un_cono {

    
    public static void main(String[] args) {
        double radio,altura,volumen;
        Scanner valor= new Scanner(System.in);
        System.out.println("Ingrese el radio del cono");
        System.out.print("radio=");
        radio=valor.nextDouble();
        System.out.println("Ingrese la altura del cono");
        System.out.print("altura=");
        altura=valor.nextDouble();
        volumen=(3.1416*radio*radio*altura)/3;
        System.out.println("el volumen del cono es =  "+volumen+" unidades cubicas");
        
      
    }
    
}
