
import java.util.Scanner;

/*
 */

/**
 *
 * @author Michael Arango
 */
public class NumeroGrande {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int num1,num2,num3;
        
        System.out.println("digite el primer numero");
        num1 = teclado.nextInt();
        
        System.out.println("digite el segundo numero");
        num2 = teclado.nextInt();
        
        System.out.println("digite el tercer numero");
        num3 = teclado.nextInt();
        
        if (num1>num2 && num1>num3){
            System.out.println("el numero "+num1+" es el mayor");
        }else if (num2>num1 && num2>num3){
            System.out.println("el numero "+num2+" es el mayor");
        }else{
            System.out.println("el numero "+num3+" es el mayor");
        }
                
    }
}
