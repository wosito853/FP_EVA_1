/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_25_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int anno;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce tu anno");
        anno = captu.nextInt();
        
        
        
         if (( anno % 4 == 0 && anno % 100 < 0) || (anno % 400 == 0)){
             System.out.println("año bisiesto");
    }  else{System.out.println("no bisiesto");}
        
        
    
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
      