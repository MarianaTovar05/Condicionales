/*
 Numero positivo: lee un numero y muestra si es positivo.
 */
import java.util.Scanner;
public class main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    System.out.println("lee el numero");
    int nomber = Integer.parseInt(scanner.nextLine());
 
  if (nomber>0){
    System.out.println("el numero es positivo");
  }
  if (nomber<0){
    System.out.println("el numero es negativo");
  }
}
  }
