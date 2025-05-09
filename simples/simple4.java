  /*
Nota aprobada: ingresa una nota y muestra si es mayor o igual a 10 (aprobado).
 */
import java.util.Scanner;
public class main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); 
      System.out.println("ingresa una nota");
      int note = Integer.parseInt(scanner.nextLine());
   
if (note>=10){
System.out.println("aprobado"); 
}
if (note<10) {
   System.out.println("reprobado");
}
}
}
