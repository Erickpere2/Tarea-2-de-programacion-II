
package potencia;

import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        int base,exponente,resultado,i;
        
        try{
            base=Integer.parseInt(JOptionPane.showInputDialog("Introduzca base:"));
            exponente=Integer.parseInt(JOptionPane.showInputDialog("Introduzca exponente:"));
            //Si el exponente es 0, el resultado es 1 sea cual sea la base
            if (exponente!=0){
                resultado=1;
                //Multiplico la base tantas veces como indica el exponente, tanto si es positivo como negativo
                for (i=1;i<=Math.abs(exponente);i++){
                    resultado=resultado*base;
                }
                //Si el exponente es negativo el resultado es 1/resultado
                if (exponente<0){                    
                    JOptionPane.showMessageDialog(null, "Resultado: "+(1/resultado));
                } else {
                    JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
                }
            } else {
                JOptionPane.showMessageDialog(null, "1");
            }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Formato incorrecto");
        }
    }   
}