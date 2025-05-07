/* 
multiplo de 5: verifica si un numero ingresado es multiplo de 5 
 */
import java.util.Scanner;
public class main{
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("multiplos del 5");
        int number = Integer.parseInt(scanner.nextLine());
    if (number % 5 ==0){
   System.out.println("si es multiplo de 5"); 

    } 
    if (number %5 !=0) {
        System.out.println("no es multiplo de 5"); 
    }

    }
}