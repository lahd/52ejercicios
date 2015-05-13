/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Luigi
 */
public class e07 {
     public static void main(String[] args) throws IOException {
        BufferedReader S = new BufferedReader(new InputStreamReader(System.in));		
        System.out.println("Ingrese las frases que desea que el programa cuente (escriba 'exit' para terminar) : ");
        int cont = 0;
            for(String frase;(frase = S.readLine()) != null;cont++){
                if(frase.equals("exit")){
                    System.out.println("El numero de frases ingresadas es : " +cont);
            break;
}
}
}
}
