package tema3;

import java.util.Scanner;

/**
 *
 * @author Luigi
 */
public class e27 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero del 0 al 10: ");
        n = sc.nextInt();
        if(n<11 && n>=0){
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);
        }
        }else{
            System.out.print("dato invalido\n");
        }
    }
}
