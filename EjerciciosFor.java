/*
 */
package ejerciciosfor;

import java.util.Scanner;

/**
 *
 * @author Michael Arango
 */
public class EjerciciosFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner( System.in );
		int num,suma_total;
		 suma_total=0;

		 for (int i=1;i<=10;i++)
		 {
		 System.out.print("Introduzca número: ");
		 num=teclado.nextInt();
		 suma_total=suma_total+num;
		 }
		 System.out.println("La suma total es de: "+suma_total);
            
            
            
            
        
           
                
        }
               
    }
    

