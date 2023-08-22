
import java.util.Scanner;

/*
 */

/**
 *
 * @author Michael Arango
 */
public class DiferenteIgual {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int num1, num2, num3;
        
        System.out.println("escribe un numero");
        num1 = teclado.nextInt();
        
        System.out.println("escribe otro numero");
        num2 = teclado.nextInt();
        
        System.out.println("escribe un tercer numero");
        num3 = teclado.nextInt();
        
        if (num1 == num3 && num2 == num1 && num3 == num2){
            System.out.println("los tres numeros son iguales");
            
            
        }else if (num3 != num2 && num1 != num2 && num3 != num1){
            System.out.println("los tres numeros son diferentes");
            
        }else {
            System.out.println("ninguno de los dos es igual o diferente");
        }
    }
}
