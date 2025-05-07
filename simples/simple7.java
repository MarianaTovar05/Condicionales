/* 
Divisibles por 3: pide un numero e indica si es divisible entre 3. 
 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System .out.println("ingresa un numero");
        int number = Integer.parseInt(scanner.nextLine());

    if(number%3==0){
       System.out.println("si es divisible entre 3"); 
    }
     if(number %3 !=0){
        System.out.println("no es divisible entre 3");  
    }      
}
}
