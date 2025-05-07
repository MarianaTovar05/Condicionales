/* 
 mayor de edad: 
 solicita la edad e imprime si la persona es mayor de edad.
 */
import java.util.Scanner;
public class Main { 
       public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("solicitar la edad de la persona");
        int person = Integer.parseInt(scanner.nextLine());
    if(person>=18) {
        System.out.println("es mayor de edad");
    }
    if(person<18) {
        System.out.println("es menor de edad");
    }
    }
}
