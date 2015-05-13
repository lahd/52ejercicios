package tema1;

import java.util.Scanner;

/**
 *
 * @author Luigi
 */
public class e10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Introduce el numero: ");
        int num = scan.nextInt();
        if(num%2==0){
            System.out.println("El numero " + num + " es par");
        }else{
            System.out.println("El numero es impar");
        }
}
}
