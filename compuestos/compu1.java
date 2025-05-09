/*
Mayor o menor de edad: solicita la edad e indique si la persona es mayor o menor de edad.
 */
import java.util.Scanner; 
public class compu1 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Solicita la edad");
    int age =  Integer.parseInt(scanner.nextLine()); 

   if (age < 12) {
    System.out.println("Es menor un menor de edad");

   } else if(age < 18) {
    System.out.println("Es un adolescente");

   } else {
    System.out.println("Es un mayor de edad");
   }
 }
}