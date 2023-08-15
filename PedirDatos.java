
import java.util.Scanner;

/*
 */

/**
 *
 * @author Michael Arango
 */
public class PedirDatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //declarar las variables
        
        int numero1;
        int numero2;
        int resultado;
        int resultado2;
        int resultado3;
        int multiplicar;
        
        
        System.out.println("señor usuario ingrese un numero");
        numero1 = teclado.nextInt();
        System.out.println("señor usuario, ingresar otro numero");
        numero2 = teclado.nextInt();
        
        System.out.println("señor usuario, ingresar numero");
        numero1 = teclado.nextInt();
        System.out.println("señor usario, le pido un numero");
        numero2 = teclado.nextInt();
        
        
        System.out.println("señor usuario, deme un numero");
        numero1 = teclado.nextInt();
        System.out.println("señor usuario, deme otro numero");
        numero2 = teclado.nextInt();
        
        
        System.out.println("señor usuario, un numero porfavor");
        numero1 = teclado.nextInt();
        System.out.println("señor usuario, un numero cordial");
        numero2 = teclado.nextInt();
       
        
        
        
        
        //proceso
        
        resultado = numero1 + numero2;
        resultado2 = numero1 - numero2;
        resultado3 = numero1 / numero2;
        multiplicar = numero1 * numero2;
        
        
        
        
        
        
        
        
        
        //mostrar resultado
        
        System.out.println("la suma es: "+resultado);
        System.out.println("la resta es: "+resultado2);
        System.out.println("la division es: "+resultado3);
        System.out.println("la multiplicacion es: "+multiplicar);
        
        
   
    }
}
