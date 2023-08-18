
import javax.swing.JOptionPane;

/*
 */

/**
 *
 * @author Michael Arango
 */
public class RaizCuadrada {
    public static void main(String[] args) {
        //declaracion de variables
       int numero;
       
       //pedir datos
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("calcular la raiz cuadrada de"));
       
       
        
       //proceso
       
       double resultado = Math.sqrt(numero);
       
       //muestro el resultado
       
      JOptionPane.showMessageDialog(null,"la raiz cuadrada de "+numero+ " es "+resultado);
        
    }
}
