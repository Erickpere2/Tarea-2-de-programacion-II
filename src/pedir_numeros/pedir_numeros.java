
package pedir_numeros;

import javax.swing.JOptionPane;


public class pedir_numeros {

    
    public static void main(String[] args) {
 
       int usuario;
       int numMayor;
       int num1, num2, num3;
 
 
       usuario=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese cuantos datos desea ingresar"));
 
       int[] datos=new int[usuario];
 
       for(int i=0;i<datos.length;i++){
           datos[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese dato"+(i+1)));
       }
 
       num1 =0;
       num2 =0;
       num3=0;
       for (int i=0; i<datos.length; i++) {
 
           if (num1 <= datos[i]){
 
                num1 = datos[i];
           }
 
       }
 
 
 
       for (int i=0; i<datos.length;i++) {
           if (datos[i] < num1) {
               if(num2 <= datos[i]){
                   num2 = datos[i];
               }
           }
       }
 
 
       for (int i=0; i<datos.length;i++) {
           if (datos[i] < num2) {
               if(num3 <= datos[i]){
                   num3 = datos[i];
               }
           }
       }
        System.out.println(num1 + " " + num2 + " "+num3);
 
    }
 
}