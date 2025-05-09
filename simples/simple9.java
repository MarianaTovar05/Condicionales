/*
 Nombre largo: pide un nombre e indique si tiene mas de 8 caracteres
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("nombre es");
        String name = scanner.nextLine(); 

    if (name.length()>8){
        System.out.println("tiene mas de 8 caracteres");
    
     }
    if (name.length()<8) {
        System.out.println("tiene meno de 8 caracteres");
    }
    }
}