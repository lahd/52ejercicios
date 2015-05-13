package tema1;

import java.io.IOException;

/**
 *
 * @author Luigi
 */
public class e08 {
    public static void main(String[] args) throws IOException {
    char cad = ' ';
    while(cad != 'S' && cad != 'N'&& cad != 's' && cad != 'n'){	
	System.out.println("Ingrese una S o una N para continuar : ");
	cad = (char) System.in.read();
}
System.out.println("Bienvenido !!! ");	
}
}
