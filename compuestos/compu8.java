/*
 Descuento por compra: pide el total de una compra: si supera $100, aplica 10% de descuento, si no, muestra el total normal
 */
import java.util.Scanner; 

public class compu8 {
public static void main(String[] args) {
    
Scanner scanner = new Scanner(System.in); 
System.out.println("total de pago");

int pay = Integer.parseInt(scanner.nextLine());

if (pay > 100) {
double discount = pay * 0.10; 
pay = pay - (int)discount;
System.out.println("se le hace descuento");

} else {
    
    System.out.println(" no se le hace descuento");
}
}
}