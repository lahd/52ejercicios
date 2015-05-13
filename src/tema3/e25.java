
package tema3;

import java.util.Scanner;

/**
 *
 * @author Luigi
 */
public class e25 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Ingresa numero natural ");
    int num = in.nextInt();
    System.out.println();
    switch((num/1000)%10){
        case 1: System.out.println("M");break;
        case 2: System.out.println("MM");break;
        case 3: System.out.println("MMM");break;
        case 4: System.out.println("IV");break;
        case 5: System.out.println("V");break;
        case 6: System.out.println("VI");break;
        case 7: System.out.println("VII");break;
        case 8: System.out.println("VIII");break;
        case 9: System.out.println("IX");break;    
    }
    switch((num/100)%10){
        case 1: System.out.println("C");break;
        case 2: System.out.println("CC");break;
        case 3: System.out.println("CCC");break;
        case 4: System.out.println("CD");break;
        case 5: System.out.println("D");break;
        case 6: System.out.println("DC");break;
        case 7: System.out.println("DCC");break;
        case 8: System.out.println("DCCC");break;
        case 9: System.out.println("CM");break;    
    }
    switch((num/10)%10){
        case 1: System.out.println("X");break;
        case 2: System.out.println("XX");break;
        case 3: System.out.println("XXX");break;
        case 4: System.out.println("XL");break;
        case 5: System.out.println("L");break;
        case 6: System.out.println("LX");break;
        case 7: System.out.println("LXX");break;
        case 8: System.out.println("LXXX");break;
        case 9: System.out.println("XC");break;    
    }
    switch((num/1000)%10){
        case 1: System.out.println("I");break;
        case 2: System.out.println("II");break;
        case 3: System.out.println("III");break;
        case 4: System.out.println("IV");break;
        case 5: System.out.println("V");break;
        case 6: System.out.println("VI");break;
        case 7: System.out.println("VII");break;
        case 8: System.out.println("VIII");break;
        case 9: System.out.println("IX");break;    
    }
    System.out.println('\n');
   }
}
