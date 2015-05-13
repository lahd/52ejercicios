
package tema1;

import java.util.Scanner;

/**
 *
 * @author Luigi
 */
public class e09 {
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Introduce el numero: ");
        int num = scan.nextInt();
        if(num>0){
            System.out.println("El numero " + num + " es positivo");
        }if(num<0){
            System.out.println("El numero " + num + " es negativo");
        }
        if(num==0){
            System.out.println("El numero es 0");
        }
}
}