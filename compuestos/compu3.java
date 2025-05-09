/*Número es par o impar*/
 import java.util.Scanner; 
 public class compu3{
     public static void main(String []args) {
       Scanner scanner = new Scanner(System.in); 
       System.out.println("Agrega un numero");
       int  number = Integer.parseInt(scanner.nextLine()); 
 
     if (number % 2 == 0) {
       System.out.println("Es par");
       
     } else {
     System.out.println("Es impar");
     }
   }
  }