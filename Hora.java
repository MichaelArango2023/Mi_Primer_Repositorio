
import java.util.Scanner;

/*
 */

/**
 *
 * @author Michael Arango
 */
public class Hora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int H,M,S;
        
        System.out.println("introduzca una hora: ");
        H = teclado.nextInt();
        
        System.out.println("introduzca minutos");
        M = teclado.nextInt();
        
        System.out.println("introduzca segundos");
        S = teclado.nextInt();
        
        if (H>=0 && H<21 && M>=0 && M<60 && S>=0 && S<60){
            System.out.println("su hora es: "+H+" : "+M+" : "+S);
        }else{
            System.out.println("hora incorrecta");
        }
        
    }
}
