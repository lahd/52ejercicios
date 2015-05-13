
package tema2;

import java.util.Scanner;

/**
 *
 * @author Luigi
 */
public class e21 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
    System.out.print("Escoge 'i' para impares o 'p' para pares \n");
    String s = sc.next();
    char opc = s.charAt(0);

    String details = "";

    switch (opc) {
    case 'p':
        int suma = 0;
        for(int i = 1; i<=1000;i++){
                if(i%2==0){
                suma=suma+i;
            }
    }
        System.out.print("La suma de los pares es: " + suma);  
      break;
        
        
    case 'i':
        int suma2 = 0;
        for(int i = 1; i<=1000;i++){
                if(i%2==0){
            }else{
                       suma2=suma2+i;
                }
    }
        System.out.print("La suma de los impares es: " + suma2);  
      break;
    default:
      System.out.print("Escoge un caracter correcto");
      break;
    }
    System.out.println(details);
  }
}
