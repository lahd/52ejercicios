package tema4;

import java.util.Random;

/**
 *
 * @author Luigi
 */
public class e30 {
    public static void main(String args[]){
    Random numAleatorio = new Random();
    boolean caballo = numAleatorio.nextBoolean();
    if (caballo) {
    System.out.println("Caballo1");
} else {
    System.out.println("Caballo2");
}
    }
}
