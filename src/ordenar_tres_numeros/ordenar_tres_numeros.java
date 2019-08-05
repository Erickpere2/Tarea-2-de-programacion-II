/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar_tres_numeros;

import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class ordenar_tres_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a,b,c; 
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primer número:");
        a=teclado.nextInt();
        System.out.println("Segundo número:");
        b=teclado.nextInt();
        System.out.println("Tercer número:");
        c=teclado.nextInt();
       
        System.out.println("Los números ordenados de mayor a menor son:");  
        if(a>=b && b>=c)
        {
           System.out.println(" " +a+ " " +b+ " " +c+ " ");  
        }
        else if (a>=c && c>=b)
        {
             
            System.out.println("" +a+ " " +c+ " " +b+ " "); 
        }
        else if (b>=a && a>=c)
        {
             
            System.out.println(" " +b+ " " +a+ " " +c+ " "); 
        }
        else if (b>=c && c>=a)
        {
             
            System.out.println(" " +b+ " " +c+ " " +a+ " "); 
        }
        else if (c>=a && a>=b)
        {
             
            System.out.println(" " +c+ " " +a+ " " +b+ " "); 
        }
        else
        {
              System.out.println(" " +c+ " "+b+ " " +a+ " ");
        }
    }   
}