/*
 */
package agosto24;

import javax.swing.JOptionPane;



/**
 *
 * @author Michael Arango
 */
public class Agosto24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 5.5, b = 4;
        
        double raiz = Math.sqrt(b);
        System.out.println("la raiz es: "+raiz);
             
        
        long redondo = Math.round(a);
        System.out.println("numero redondo: "+redondo);
        
        double c = 5, d = 3;
        
        double elevado = Math.pow(c, d);
        System.out.println("numero elevado: "+elevado);
        
        double aleatorio = Math.random();
        System.out.println("aleatorio: "+aleatorio);
        
        
        
        
        int numero ;
                
                
        numero = (int)(Math.random()*30+1);
        
        JOptionPane.showMessageDialog(null,"numero aleatorio: "+numero);
        
        
        
        double valorPI = Math.PI;
        System.out.printf("%.4f " ,valorPI);
                
                
        
        
        
    
               
        
        
        
        
        
        
        
        
        
    
    }}
        
