package tema1;

import java.util.Scanner;

/**
 *
 * @author Luigi
 */
public class e15 {
    public static void main(String[] args) {
        int cont=0,par=0,impar=0;
        Scanner scan = new Scanner(System.in); 
        System.out.println("Introduce el numero: ");
        int n1 = scan.nextInt();

        System.out.println("Introduce el numero: ");
        int n2 = scan.nextInt();
        
        if(n1>n2){
        for ( int i = n2; i <= n1; i++ ){
            System.out.println(i);
            cont=cont++;
                if( i%2 == 0 ){ 
                par = par+1;
               }else{
                impar=impar+i;
                } 
        }
        
        System.out.println("La cantidad de pares es: "+ par);
        System.out.println("La suma de los impares es: "+ impar);
        
        }
        if(n1<n2){
        for ( int i = n1; i <= n2; i++ ){
            System.out.println(i);
            cont=cont++;
            if( i%2 == 0 ){ 
                par = par+1;
               }else{
                impar=impar+i;
                } 
        }
        
        System.out.println("La cantidad de pares es: "+ par);
        System.out.println("La suma de los impares es: "+ impar);
       }
    }
  }
