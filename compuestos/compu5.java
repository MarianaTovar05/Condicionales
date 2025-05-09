/*
 Nota academica: ingresa una nota y clasifica "Desaprobado" (<10), "Regular" (10-13), "Bueno" (14-17), "Excelente" (18-20).
 */
import java.util.Scanner;
public class compu5 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
    System.out.println("Nota academica");

    int note= Integer.parseInt(scanner.nextLine()); 

if (note<10) {
    System.out.println("Desaprobado");
} else if (note >=10 && note <=13) {
    System.out.println("Regular");

}else if (note >=14 && note <=17) {
    System.out.println("Bueno");

    }else if (note >=18 && note <=20) {
        System.out.println("Excelente");

    } else {

        System.out.println("no valida");
    }
}
}