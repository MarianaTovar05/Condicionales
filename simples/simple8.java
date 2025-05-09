/* 
 numero par: indica si un numero ingresado es par. 
 */
import java.util.Scanner; 
public class simple8{ 
    public static void main(String[]args) {
        Scanner scanner=new Scanner(System.in); 
        System.out.println("Ingrese un número");
       int nomber = Integer.parseInt(scanner.nextLine());
        if (nomber%2==0){
            System.out.println("el numero es par");
        }
        if(nomber%2 !=0){
            System.out.println("el numero es impar");
        }
    }
}
