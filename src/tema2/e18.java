package tema2;

/**Hacer un pseudocodigo que cuente las veces que aparece una determinada
 * letra en una frase que introduciremos por teclado.
 *
 * @author Luigi
 * 
   ENTORNO:
   frase <- Espacios( 50 )
   letra <- Espacios( 1 )
   longitud <- 0
   a <- 0
   respuesta <- "S"
 
   
    ALGORITMO:
   while res = "S" do
      clrscr();
      system.out.println ("Introduce una frase: ")
      scan frase
      longitud <- Hallar_longitud( frase )
      i <- 1
      ESCRIBIR "Letra a buscar: "
      scan letra
      while i <= longitud do
         if letra = Caracter( frase, i, 1 ) 
            a <- a + 1
         finif
         i <- i + 1
      FINMIENTRAS
      clrscr();
      system.out.println ("El n£mero de veces que aparece la letra ")
      system.out.println (letra)
      system.out.println (" en la frase ")
      system.out.println (frase)
      system.out.println (" es de ")
      system.out.println (a)
      respuesta <- Espacios( 1 )
      while respuesta <> "S" Y res <> "N" do
         ESCRIBIR "Desea introducir mas frases (S/N): "
         LEER res
         res <- Convertir_may£sculas( res )
      FINMIENTRAS
   FINMIENTRAS
FINPROGRAMA

 */
public class e18 {
    
}
