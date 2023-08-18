

import javax.swing.JOptionPane;

/*
 */

/**
 *
 * @author Michael Arango
 */
public class NumeroAleatorio {
    public static void main(String[] args) {
        
        int numero;
        
        numero = (int)(Math.random()*20+1);
        
        JOptionPane.showMessageDialog(null,"numero aleatorio: "+numero);
                
        
        
        
        
    }
}
