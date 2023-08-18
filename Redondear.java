
import javax.swing.JOptionPane;

/*
 */

/**
 *
 * @author Michael Arango
 */
public class Redondear {
    public static void main(String[] args) {
       double numero,redon;
       
       numero = Double.parseDouble(JOptionPane.showInputDialog("digite el numero que quiera redondear "));
       
       redon = Math.round(numero);
       
       JOptionPane.showMessageDialog(null,"el numero " +numero+ " redondeado es "+redon);
       
       
       
        
        
        
        
        
        
        
    }
}
