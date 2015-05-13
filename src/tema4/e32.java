/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import java.util.Scanner;

/**
 *
 * @author Luigi
 */
public class e32 {

    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Ingresa el numero ");
    int num = in.nextInt();
    
    System.out.println("Escribe la letra del inciso de lo que desea hacer \n");
    System.out.println("a) Comprobar si es primo");
    System.out.println("b) Sacar el factorial");
    System.out.println("c) Imprimir su tabla de multiplicar");
    String s = sc.next();
    char opc = s.charAt(0);
    
    switch (opc) {
    case 'a':
        int a=0;
        for(int i=1;i<(num+1);i++){  
         if(num%i==0){  
             a++;
         }
        }  
         if(a!=2){  
              System.out.println("No es Primo");  
            }else{
             System.out.println("Si es Primo");} 
         break;
        
    case 'b':
        int fact=1;
        if(num<0){
             System.out.println("El numero no tiene factorial: ");
        }else{
        
        for(int i=num; i>1; i--){
         fact = fact * num;
         num = num-1;
         }
            System.out.println("El factorial es: "+ fact);
        }break;
        
    case 'c':
        if(num<11 && num>=0){
        System.out.println("Tabla del " + num);
        for(int i = 1; i<=10; i++){
             System.out.println(num + " * " + i + " = " + num*i);
        }
        }else{
            System.out.print("dato invalido\n");
        }
        break;
        default:
         System.out.print("Introduce un comando válido\n");  
            break;
            }
    }
}