/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Luigi
 */
public class e36 {
    public static void main(String[] ar) {
        Scanner sc=new Scanner(System.in); 
        int limite=100; 
        Random random=new Random(); 
        int i=0, j=0;
        int[][]matriz=new int[4][5]; 
        for(i=0; i<matriz.length; i++){ 
            for(j=0;j<matriz[i].length;j++){ 
                matriz[i][j]= 
                random.nextInt(limite)+1; 
            System.out.println("["+i+"]["+j+"]="+ matriz[i][j]); 
//para corroborar 
} 
} 
} 
}

