/* 
 Temperatura adecuada: pide una temperatura y muestra si hace frio (menor a 15), normal  (15 a 30) o calor (mayor a 30).
 */
import java.util.Scanner; 
public class compu4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Temperatura adecuada");
    int temperature = Integer.parseInt(scanner.nextLine());

if (temperature<15) {
    System.out.println("Temperatura fria");
} else if (temperature<30) {
    System.out.println("Temperatura  normal");

} else {
    System.out.println("Temperatura  calor");  
}
    }

}