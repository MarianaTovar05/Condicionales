/*numero positivo o negativo:  verifica si un nuemero 
 es positivo o negativo. */
 import java.util.Scanner; 
 public class compu2 {
     public static void main(String []args) {
         Scanner scanner = new Scanner(System.in); 
       System.out.println("agregar el numero");
       int  number = Integer.parseInt(scanner.nextLine()); 
 
     if (number> 0) {
       System.out.println("es positivo");
       
     } else if ( number == 0) {
     System.out.println("es cero"); 
 
     } else {
       System.out.println("es negativo");
     }
     }
   }