package tema2;

import java.util.Scanner;

/**
 *
 * @author Luigi
 */
public class e20 {
    public static int num; 
    public static int fact=1; 

    public static void main(String[] args) {
        inicio();
    }
    
    public static void inicio(){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Introduce el numero: ");
        num = scan.nextInt();
        if(num<0){
            System.out.println("El numero no tiene factorial: ");
        }else{
            calcular();
        }
         imprimir();
    }
    
     public static void calcular(){
         for(int i=num; i>1; i--){
         fact = fact * num;
         num = num-1;
         }
     }
    
      public static void imprimir(){
           System.out.println("El factorial es: "+fact);
      }
}
