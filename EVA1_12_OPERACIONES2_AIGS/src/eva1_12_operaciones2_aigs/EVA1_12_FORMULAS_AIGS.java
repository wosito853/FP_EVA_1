/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_operaciones2_aigs;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_12_FORMULAS_AIGS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double d, t, a, V;
        Scanner captu = new Scanner(System.in);
    
        
        System.out.println("ingresa tu tiempo");
         t = captu.nextDouble();
       
        
       System.out.println("ingresa tu aceleracion");
       a = captu.nextDouble();
      
       
       
       System.out.println("ingresa tu velocidad");
       V = captu.nextDouble();
       
       
       
       
       System.out.println("aqui tienes tu distacia");
         d = V * t + (a * t * t)/2.0;                    // d = V * t +a*t*t/2;
       System.out.println(d);
         
       
     
        
        
        
        
    }
    
}
