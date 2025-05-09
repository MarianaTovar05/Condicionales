/*numero positivo o negativo:  verifica si un nuemero 
 es positivo o negativo. */
 import java.util.Scanner; 
 public class compu2 {
     public static void main(String []args) {
         Scanner scanner = new Scanner(System.in); 
       System.out.println("Agregar el numero");
       int  number = Integer.parseInt(scanner.nextLine()); 
 
     if (number> 0) {
       System.out.println("Es positivo");
       
     } else if ( number == 0) {
     System.out.println("Es cero"); 
 
     } else {
       System.out.println("Es negativo");
     }
     }
   }