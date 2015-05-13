package tema4;

import java.util.Scanner;

/**
 *
 * @author Luigi
 */
public class e31 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Ingresa el primer numero ");
    int num1 = in.nextInt();
    System.out.println("Ingresa el segundo numero ");
    int num2 = in.nextInt();
    
    System.out.println("Escribe la letra del inciso de lo que desea hacer \n");
    System.out.println("a) Sumar");
    System.out.println("b) Restar");
    System.out.println("c) Multiplicar");
    System.out.println("d) Dividir");
    String s = sc.next();
    char opc = s.charAt(0);
    
    switch (opc) {
    case 'a':
        int suma = 0;
        suma = num1 + num2;
        System.out.print("La suma es: " + suma+"\n");  
        break;
        
    case 'b':
        int resta = 0;
        resta = num1 - num2;
        System.out.print("La resta es: " + resta+"\n");  
        break;
        
    case 'c':
        int mult = 0;
        mult = num1 * num2;
        System.out.print("La multilicacion es: " + mult+"\n");  
        break;
        
    case 'd':
        int div = 0;
        div = num1 / num2;
        System.out.print("La division es: " + div+"\n");  
        break;
        
        default:
         System.out.print("Introduce un comando válido\n");  
            break;
            }

    }
        
}
