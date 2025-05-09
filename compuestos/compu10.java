/* Acceso al sistema: pide usuario y contraseña si coinciden con valores 
predeterminados, muestra "Acceso concedido", si no, "acceso denegado". */
 import java.util.Scanner;

 public class compu10 {
     public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in); 
     System.out.println("pide usuario y contraselña");
 
     String user = scanner.nextLine(); 
    String password = scanner.nextLine();
 
 if (user.equals("admin") && password.equals("1234")) {
 
     System.out.println("Acceso concedido");
 
 }else{
     System.out.println("acceso denegado");
 }
     }
 
  }