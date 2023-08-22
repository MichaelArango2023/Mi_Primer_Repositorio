
import java.util.Scanner;

/*
 */

/**
 *
 * @author Michael Arango
 */
public class Temperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        double temp;
        
        System.out.println("ingrese la temperatura");
        temp = teclado.nextDouble();
        
        if (temp<=10){
            System.out.println("la temperatura es NUBLADO");
            
        }else if(temp>20 && temp<=30){
            System.out.println("la temperatura es CALUROSO");
            
        }else if (temp>30){
            System.out.println("la temperatura es TROPICAL");
        }
      
    }
}
