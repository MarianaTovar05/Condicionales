/*Numero mayor: compara dos numeros e indica cual es mayor o si son iguales.*/
import java.util.Scanner; 
public class compu6{
    public static void main(String []args) {
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Compara los numeros");

    int number_1 = Integer.parseInt(scanner.nextLine());
    int number_2 = Integer.parseInt(scanner.nextLine()); 

if (number_1 > number_2) {
    System.out.println("Numero 1 es mayor");

 } else if (number_1 < number_2) {
    System.out.println("Numero 2 es mayor");
 }else {
 System.out.println("Los Numeros son iguales ");
}
    }

}