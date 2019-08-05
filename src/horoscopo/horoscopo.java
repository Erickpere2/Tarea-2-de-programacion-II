/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horoscopo;

import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class horoscopo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
int reply=0;
System.out.println("Sistema iniciado");
JOptionPane.showMessageDialog(null, "Bienvenido a mi primer programa en java");
JOptionPane.showMessageDialog(null, "Juguemos un poco");

while (reply==0){
//Fase uno (Obtencion de datos)
System.out.println("Solicitando datos iniciales");
String Nombre = JOptionPane.showInputDialog("¿Cual es tu nombre?"); 
String DiaS = JOptionPane.showInputDialog("¿Que dia naciste?(1-31)");
String MesS = JOptionPane.showInputDialog("¿En que mes naciste?(1-12)");

//Fase dos (Convierte los datos)
System.out.println("Transformado datos");
int dia = Integer.parseInt(DiaS);
int mes = Integer.parseInt(MesS);

//Fase tres (Calculando datos)
System.out.println("Calculado");
String Signo;
Signo = SacarSigno(dia, mes);

//Fase cuatro (Salido de datos)
System.out.println("Salida de informacion");
JOptionPane.showMessageDialog(null, Nombre+" tu signo es "+Signo);

reply = JOptionPane.showConfirmDialog(null, "¿Desea volver a iniciar?","Reiniciar?", JOptionPane.YES_NO_OPTION);
System.out.println("Repeticion: "+reply);
}

}

public static String SacarSigno (int Dia, int Mes){
String signo = "Sin datos";


if (Dia >= 21 && Mes == 3 || Dia <= 20 && Mes == 4){
return ("Aries");
}


if (Dia >= 21 && Mes == 4 || Dia <= 21 && Mes == 5 ){
return ("Tauro");
}

if (Dia >= 22 && Mes == 5 || Dia <= 21 && Mes == 6) {
return ("Geminis");
}

if (Dia >= 21 && Mes == 6 || Dia <= 27 && Mes == 7){
return ("Cancer");
}

if (Dia >= 24 && Mes == 7 || Dia <= 23 && Mes == 8){
return ("Leo");
}

if (Dia >= 24 && Mes == 8 || Dia <= 23 && Mes == 9){
return ("Virgo");
}

if (Dia >= 24 && Mes == 9 || Dia <= 23 && Mes == 10){
return ("Libra");
}

if (Dia >= 24 && Mes == 10 || Dia <= 22 && Mes == 11){
return ("Escorpio");
}

if (Dia >= 23 && Mes == 11 || Dia <= 21 && Mes == 12){
return ("Sagitario");
}

if (Dia >= 22 && Mes == 11 || Dia <= 20 && Mes == 1){
return ("Capricornio");
}

if (Dia >= 21 && Mes == 1 || Dia <= 19 && Mes == 2){
return ("Acuario");
}

if (Dia >= 20 && Mes == 2 || Dia <= 20 && Mes == 3){
return ("Picis");
}
else {
return signo;
}

}
}

