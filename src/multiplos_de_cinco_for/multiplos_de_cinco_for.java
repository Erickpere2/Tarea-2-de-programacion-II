
package multiplos_de_cinco_for;


public class multiplos_de_cinco_for {

    
    public static void main(String[] args) {
      String cad="";
      for(int i = 1; i<=100;i++){
          if(i%5==0){
              cad=cad+i+",";
              
      }
        }
    System.out.println("multiplos de 5 de 1 a 100 son: "+cad);
}

}

