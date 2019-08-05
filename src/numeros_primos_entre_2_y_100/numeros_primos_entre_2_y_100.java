
package numeros_primos_entre_2_y_100;


public class numeros_primos_entre_2_y_100 {

  
    public static void main(String[] args) {
  int i,j;
  boolean esPrimo;
  int rInicial=2;
  int rFinal = 100;//Rango final.
  for(i = rInicial;i <= rFinal;i++){
  
      esPrimo=true;
       for(j = 2;j < i;j++){
      
       if(i % j == 0){
          esPrimo = false;
       }
       }
       if(esPrimo){//Si es primo lo imprimo.
        System.out.println(i+"\n");
       }
  }
 }
}