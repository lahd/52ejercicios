
package tema1;

/**
 *
 * @author Luigi
 */
public class e05 {
    public static void main(String[] args) {
     int cont = 0; 
          for(int i = 0 ; i <= 100 ; i ++){ 
               if( i%2 != 0 ){ 
                    System.out. printf("%d " , i); 
                    cont = cont + 1; 
               } 
          } 
          System.out.printf("\nEl número de impares es %d\n\n", cont); 
}
}
