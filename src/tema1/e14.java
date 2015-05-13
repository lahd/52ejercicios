package tema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Luigi
 */
public class e14 {
    public static void main(String[] args) throws IOException {
        int n = 0, mayor = -99999, menor = 99999;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 5; i++) {
                System.out.println("Ingresa un numero");
                n = Integer.parseInt(br.readLine());
                    if(n > mayor){
                        mayor = n;
                }
                    if(n < menor){
                        menor = n;
                }
               }
                System.out.println("El numero mayor es :" + mayor);
        System.out.println("El numero menor es :" + menor);
}
}
