
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 */

/**
 *
 * @author Michael Arango
 */
public class Login {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        String usuario, contra;
        
        usuario = JOptionPane.showInputDialog("por favor ingrese su usuario");
        contra = JOptionPane.showInputDialog("por favor ingrese su contraseña");
        
        if (usuario.equals("michael arango")&& contra.equals("michael2023")){
            JOptionPane.showMessageDialog(null,"bienvenido al sistema");
            
        } else {
            JOptionPane.showMessageDialog(null,"contraseña y/o usuario invalido");
        }
        
        
        
        
        
        
        
        
                
        
        
    }
}
