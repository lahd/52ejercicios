/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import java.util.Scanner;
import static tema2.e20.num;

/**
 *
 * @author Luigi
 */
public class e24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Introduce el numero: ");
        num = scan.nextInt();
        int a = 0;
        if(num>1){
       for(int i=1;i<(num+1);i++){  
         if(num%i==0){  
             a++;  
            }  
         }  
         if(a!=2){  
              System.out.println("No es Primo");  
            }else{  
                System.out.println("Si es Primo");  
         } 
        }else{
        System.out.println("El numero no es mayor que la unidad"); 
        }
    }
}
