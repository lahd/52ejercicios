/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import java.util.Scanner;

/**
 *
 * @author Luigi
 */
public class e11 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Introduce el numero: ");
        int num = scan.nextInt();
        int i=0,cont=0;
        
        for(i = 1; i <= num; i++){
            
            if(i%3==0){
                cont=cont+1;            
        }
    }
        System.out.println("El numero de multiplos de 3 es: " + cont);
}
}