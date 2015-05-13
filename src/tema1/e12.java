
package tema1;

/**
 *
 * @author Luigi
 */
public class e12 {
    public static void main(String[] args) {
        int x = 0,y = 0;
        for(int i = 1; i<=100;i++){
            System.out.println(i);
        
            if( i%2 == 0 ){ 
                    y = y+i;
               } 
            
            else{
                x=x+i;
            }
        }
        System.out.println("La suma de los pares es: " + y);
        System.out.println("La suma de los impares es: " + x);
            
    }
}
