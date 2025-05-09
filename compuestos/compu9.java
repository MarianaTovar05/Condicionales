/* Hora del dia: ingresa una hora (0-23) y muestra si es mañana (6-12), 
 tarde (13,18), noche (19-23), o madrugada (0-5).*/
import java.util.Scanner; 
public class compu9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Ingresa hora");
    int hour = Integer.parseInt(scanner.nextLine()); 

    if (hour>=6 && hour<=12) { 
        System.out.println("Mañana");
    
    } else if (hour >=13 && hour<=18){
        System.out.println("Tarde"); 

    }else if (hour >=19 && hour<=23) {
        System.out.println("Noche"); 
    }else if (hour>=0 && hour<=5 ) {
        System.out.println("Madrugada"); 

    }else {
        System.out.println("Hora no valida"); 

    }
    }
    }

    