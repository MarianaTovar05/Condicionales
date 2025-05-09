/* 
 mayor de edad: 
 solicita la edad e imprime si la persona es mayor de edad.
 */
import java.util.Scanner;
public class simple5 { 
       public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Solicitar la edad de la persona");
        int person = Integer.parseInt(scanner.nextLine());
    if(person>=18) {
        System.out.println("Es mayor de edad");
    }
    if(person<18) {
        System.out.println("Es menor de edad");
    }
    }
}
