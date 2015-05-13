package tema2;

/**Hacer un pseudocodigo que simule el funcionamiento de un reloj digital y
 * que permita ponerlo en hora.
 *
 * @author Luigi
 * 
 * 
ENTORNO:
   horas <- 0
   minutos <- 0
   segundos <- 0
   respuesta <- "S"
ALGORITMO:
   clrscr();
   system.out.println "Horas: "
   scan horas
   system.out.println "Minutos: "
   scan minutos
   system.out.println "Segundos: "
   scan segundos
   while res = "S" do
      while horas < 24 do
         while minutos < 60 do
            while segundos < 60 do
               system.out.println horas
               system.out.println minutos
               system.out.println segundos
               segundos <- segundos + 1
            end while
            minutos <- minutos + 1
            segundos <- 0
         end while
         horas <- horas + 1
         minutos <- 0
      end while
      horas <- 0
   end while
end while

 * 
 */
public class e19 {
    
}
