
package tema4;

import java.util.Random;

/**
 *
 * @author Luigi
 */
public class e28 {
    public static void main(String args[]){
    Random numAleatorio = new Random();
    boolean moneda = numAleatorio.nextBoolean();
    if (moneda) {
    System.out.println("Cara");
} else {
    System.out.println("Cruz");
}
    }
}
