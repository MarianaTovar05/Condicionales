/* 
Divisibles por 3: pide un numero e indica si es divisible entre 3. 
 */
import java.util.Scanner;
public class simple7{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System .out.println("Ingresa un numero");
        int number = Integer.parseInt(scanner.nextLine());

    if(number%3==0){
       System.out.println("Si es divisible entre 3"); 
    }
     if(number %3 !=0){
        System.out.println("No es divisible entre 3");  
    }      
}
}
