/*
 Numero positivo: lee un numero y muestra si es positivo.
 */
import java.util.Scanner;
public class simple2{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Lee el numero");
    int nomber = Integer.parseInt(scanner.nextLine());
 
  if (nomber>0){
    System.out.println("El numero es positivo");
  }
  if (nomber<0){
    System.out.println("El numero es negativo");
  }
}
  }
