
import java.util.Scanner;

/*
 */

/**
 *
 * @author Michael Arango
 */
public class CuentaCifra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int numero, contador=0;
        
        System.out.println("introduce un numero");
        numero = teclado.nextInt();
        
        while(numero!=0){
            numero=numero/10;
            contador++;
            System.out.println("numero de cifras: "+contador);
        }
    }
}
