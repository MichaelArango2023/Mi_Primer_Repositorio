
import java.util.Scanner;

/*
 */

/**
 *
 * @author Michael Arango
 */
public class Problemas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int num;
        
        System.out.println("introduzca un numero");
        num = teclado.nextInt();
        
        if (num > 0){
            System.out.println("el numero "+num+" es positivo");
        }else{
            System.out.println("el numero "+num+" es negativo");
        }
            
            
        }
    }
