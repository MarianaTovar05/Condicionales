/*
Temperatura alta: pide una temperatura y muestra si esta por encima de 30°C.
 */
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pide la temperatura:");
        int temperature = Integer.parseInt(scanner.nextLine());

        if (temperature >= 30) {
            System.out.println("Está por encima de los 30.");
        }

        if (temperature <= 30) {
            System.out.println("Está por debajo de los 30.");
        }

    }
}
