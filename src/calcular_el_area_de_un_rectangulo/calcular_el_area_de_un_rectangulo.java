
package calcular_el_area_de_un_rectangulo;
import java.util.Scanner;

public class calcular_el_area_de_un_rectangulo {

        public static void main(String[] args) {
            double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese ancho del rectangulo");
        double a=sc.nextDouble();  
        System.out.println("ingrese alto del rectangulo");
        double b=sc.nextDouble(); 
        area=a*b;
        System.out.println(area);           
            

    }
    
}
