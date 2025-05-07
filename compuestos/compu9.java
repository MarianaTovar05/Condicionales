/* Hora del dia: ingresa una hora (0-23) y muestra si es mañana (6-12), 
 tarde (13,18), noche (19-23), o madrugada (0-5).*/
import java.util.Scanner; 
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("ingresa hora");
    int hour = Integer.parseInt(scanner.nextLine()); 

    if (hour>=6 && hour<=12) { 
        System.out.println("mañana");
    
    } else if (hour >=13 && hour<=18){
        System.out.println("tarde"); 

    }else if (hour >=19 && hour<=23) {
        System.out.println("noche"); 
    }else if (hour>=0 && hour<=5 ) {
        System.out.println("madrugada"); 

    }else {
        System.out.println("hora no valida"); 

    }
    }
    }

    