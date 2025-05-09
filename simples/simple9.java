/*
 Nombre largo: pide un nombre e indique si tiene mas de 8 caracteres
 */
import java.util.Scanner;

public class simple9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Su nombre es");
        String name = scanner.nextLine(); 

    if (name.length()>8){
        System.out.println("tiene mas de 8 caracteres");
    
     }
    if (name.length()<8) {
        System.out.println("tiene menos de 8 caracteres");
    }
    }
}