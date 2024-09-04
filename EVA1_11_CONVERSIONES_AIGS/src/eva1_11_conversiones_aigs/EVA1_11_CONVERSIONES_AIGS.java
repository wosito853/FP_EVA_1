/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_conversiones_aigs;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_11_CONVERSIONES_AIGS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        double F,C, K;
        Scanner captu = new Scanner (System.in);
        System.out.println("introduce tus grados fahrenheit");
        F = captu.nextDouble();
        
       C = (F - 32) / 1.8; // Expresión
       
       System.out.println("Conversion");
       System.out.println(C);
        
       
       
       System.out.println("introduce tus grados centigrados");
       C = captu.nextDouble();
       F = C*1.8+32;
       System.out.println("conversion de centigrados a fahrenheit");
      
       System.out.println(F);
       
       
       
       
       System.out.println("introduce tus grados celcius");
       C = captu.nextDouble();
       K = C + 273.15;
       System.out.println("tu conversion de grados celcius a kelvin--->");
       System.out.println(K);
       
       
      
       
       
       
       
       
       
       
       
       
       
       
        
   
    }
    }
                
    
    

