
package ecuaciones_de_primer_grado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ecuaciones_de_primer_grado {

    public static void main(String[] args) throws IOException
	{
 
	String valor;
	int a,b,c,d;
	double e,f,g,h,i,j;
 
		BufferedReader x=new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Ingrese el Nro A:");
		valor = x.readLine();
		a=Integer.parseInt(valor);
		System.out.println("Ingrese el Nro B");
		valor=x.readLine();
		b=Integer.parseInt(valor);
		System.out.println("Ingrese el Nro C");
		valor=x.readLine();
		c=Integer.parseInt(valor);
 
			d= b*b-4*a*c;
			if (d > 0)
				System.out.println("El Descriminante es: "+d);
			else System.out.println("El Descriminante debe de ser positivo y mayor al valor" +d);
 
		e=Math.sqrt(d);
	if (d > 0)
		{
		System.out.println("Raiz del Descrimannte : "+ Math.rint(e*1000)/1000);
		j=(2*a);
		h=-b+e;
		f=-h/(j);
 
 
		System.out.println("El resultado positivo es: " + Math.rint(f*1000)/1000);
		i=-b-e;
		g=-i/(j);
		System.out.println("El resultado negativo es: "+ Math.rint(g*1000)/1000);
		}
	else 	{
			System.out.println ("No hay resultado");
			}
 
	}
}