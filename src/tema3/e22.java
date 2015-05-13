package tema3;

import java.util.Scanner;

/**
 *
 * @author Luigi
 */
public class e22 {
    public static void main (String[] args) 
    { 
        Scanner leer = new Scanner (System.in); 

        System.out.print ("Escriba una frase "); 
        String frase = leer.nextLine(); 

        int cont = 0; 

        for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < cont; j++) 
                System.out.print (" "); 
            System.out.println (frase); 
            cont += 4; 
        } 
    } 
}
