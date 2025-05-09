  /*
Nota aprobada: ingresa una nota y muestra si es mayor o igual a 10 (aprobado).
 */
import java.util.Scanner;
public class simple4 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); 
      System.out.println("Ingresa una nota");
      int note = Integer.parseInt(scanner.nextLine());
   
if (note>=10){
System.out.println("Aprobado"); 
}
if (note<10) {
   System.out.println("Reprobado");
}
}
}
