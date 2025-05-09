/*Division segura: pide dos numeros y divide solo si el segundo no es cero*/
import java.util.Scanner;

public class compu7 { 
   public static void main(String[] args) {
    
Scanner scanner = new Scanner(System.in); 
System.out.println("pide los dos numeros");

double number1 = Integer.parseInt(scanner.nextLine()); 
double number2 = Integer.parseInt(scanner.nextLine()); 
 
if (number2 !=0) {
    double result = number1 /number2; 
    
System.out.println("el resultado del numero es" + result);

} else {
    System.out.println("error no se puede dividir");
}
   }
}