/*Numero mayor: compara dos numeros e indica cual es mayor o si son iguales.*/
import java.util.Scanner; 
public class main {
    public static void main(String []args) {
    Scanner scanner = new Scanner(System.in); 
    System.out.println("compara los numeros");

    int number_1 = Integer.parseInt(scanner.nextLine());
    int number_2 = Integer.parseInt(scanner.nextLine()); 

if (number_1 > number_2) {
    System.out.println("numero1 es mayor");

 } else if (number_1 < number_2) {
    System.out.println("numero2 es mayor");
 }else {
 System.out.println("los numeros son iguales ");
}
    }

}