/*Mayor o menor de edad: solicita la edad e indique si la persona es 
mayor o menor de edad.*/
import java.util.Scanner; 
public class compu1 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    System.out.println("solicita la edad");
    int age =  Integer.parseInt(scanner.nextLine()); 

   if (age < 12) {
    System.out.println("es menor");

   } else if(age < 18) {
    System.out.println("es adolescente");

   } else {
    System.out.println("es un mayor");
   }
 }
}