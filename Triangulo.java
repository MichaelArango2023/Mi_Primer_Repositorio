
import java.util.Scanner;

/*
 */

/**
 *
 * @author Michael Arango
 */
public class Triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int 11, 12, 13;
        
        System.out.println("escriba el lado A");
        11 = teclado.nextInt();
        
        System.out.println("escriba el lado B");
        12 = teclado.nextInt();
        
        System.out.println("escriba el lado C");
        13 = teclado.nextInt();
        
        if (11 == 12 && 12 == 13){
            System.out.println("triangulo es equilatero");
            
            else if (11 == 12 || 11 == 13 || 12 == 13);{
            System.out.println("triangulo es isoceles");
        }else if (11!=12 || 11!=13 || 13!=12){
                System.out.println("triangulo es escaleno");
                }
        }
        
        
          
        
        
        
        
        
    

