
package tema1;

/**
 *
 * @author Luigi
 */
public class e13 {
  public static void main(String[] args) {
    int x = 0,y = 0;
        for(int i = 1; i<=100;i++){
        
            if( i%2 == 0 ){ 
                y = y+1;
                System.out.println(i + "    dos");
               } 

            
            if( i%3 == 0 ){
                x=x+1;
                System.out.println(i + "    tres");
            }
        }
        System.out.println("Los multiplos de 2 son: " + y);
        System.out.println("Llos multiplos de 3 son: " + x);
            
    }
}
