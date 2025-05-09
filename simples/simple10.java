/*
 Salario alto: pide un salrio mensual y muestre si supera los $3000.
 */
import java.util.Scanner;
public class simple10{
  public static void main(String []args) {
  Scanner scanner = new Scanner(System.in); 
  System.out.println("salario mensual");
  int salary = Integer.parseInt(scanner.nextLine());

if (salary>3000) {
  System.out.println("el salario es superior");

}
if(salary<3000) {
  System.out.println("el salario  es inferior");
}
}
}
  
