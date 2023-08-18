
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 */

/**
 *
 * @author Michael Arango
 */
public class AreaTriangulo {
    public static void main(String[] args) {
      
        double base, altura, resultado;     
        Scanner obj = new Scanner(System.in);
         
        System.out.println("ingrese base\t");
        base = obj.nextDouble();
         
        System.out.println("ingrese altura\t");
        altura = obj.nextDouble();
         
        resultado = ((base*altura)/2);
         
        //muestro el resultado
        
        System.out.println("el area del triangulo es: "+resultado);
    }
}
