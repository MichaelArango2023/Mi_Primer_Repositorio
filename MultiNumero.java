
import java.util.Scanner;

/*
 */

/**
 *
 * @author Michael Arango
 */
public class MultiNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int numero1, numero2;
        
        System.out.println("introduce un numero entero");
        numero1 = teclado.nextInt();
        System.out.println("introduce otro numero entero");
        numero2 = teclado.nextInt();
        
        if (numero1 % numero2 == 0) {
            System.out.println("son multiplos");
        }else {
            System.out.println("no son multiplos");
        }
                
        
        
    }
}
