/* 
edad para votar: pide al usuario su edad e indica si puede votar (mayor o igual a 18 años)
*/ 
import java.util.Scanner;
public class main {
public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("pide la edad del usuario");
    int age = Integer.parseInt(scanner.nextLine());
if (age>18) {
    System.out.println("es mayor de edad y puede votar");
}
    if (age<18) {
        System.out.println("es menor de edad y no puede votar");
    }
if (age==18){
    System.out.println("es igual a los 18 y puede votar");
}
}
}