
import java.util.Scanner;

/*
 */

/**
 *
 * @author Michael Arango
 */
public class ISBNSo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double nota1;
        
        System.out.println("por favor, introduzca una nota: ");
        nota1 = teclado.nextDouble();
        
        if (nota1 < 5){
            System.out.println("insuficiente");
        }
        
        if ((nota1 >= 5) && (nota1 <6)){
            System.out.println("suficiente");
        }   
            if ((nota1 >= 6) && (nota1 < 7)){
                System.out.println("bien");
            }
            if ((nota1 >= 7) && (nota1 < 9)){
                System.out.println("notable");
                
            }
            if (nota1 >= 9){
                System.out.println("sobresaliente");
            }
        }
    
                
    
}
