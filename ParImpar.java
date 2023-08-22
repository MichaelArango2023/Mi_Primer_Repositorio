
import java.util.Scanner;

/*
 */

/**
 *
 * @author Michael Arango
 */
public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int numero;
        
        System.out.println("inserte un numero");
        numero = teclado.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("el numero "+numero+" es par");
        }else{
            System.out.println("el numero "+numero+" es impar");
        }
    }
}
