/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_meses_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_23_MESES_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int mes;
        Scanner captu = new Scanner (System.in);
        System.out.println("captura el numero del mes (1 a  12)");
        mes = captu.nextInt();
        captu.nextLine();
        
        
        switch(mes){
            case 1: 
                System.out.println("enero");
                break; // interrumpe el switch (lo termina)
        
         case 2: 
                System.out.println("febrero");
                break; // interrumpe el switch (lo termina)
                
                 case 3: 
                System.out.println("marzo");
                break; // interrumpe el switch (lo termina)   
        
         case 4: 
                System.out.println("abril");
                break; // interrumpe el switch (lo termina)   
        
                 case 5: 
                System.out.println("mayo");
                break; // interrumpe el switch (lo termina)   
                
                 case 6: 
                System.out.println("junio");
               break; // interrumpe el switch (lo termina) 
                
                 case 7: 
                System.out.println("julio");
                break; // interrumpe el switch (lo termina)   
        
       
                 case 8: 
                System.out.println("agosto");
                break; // interrumpe el switch (lo termina) 
                
                 case 9: 
                System.out.println("septiembre");
                break; // interrumpe el switch (lo termina) 
                
                 case 10: 
                System.out.println("octubre");
                break; // interrumpe el switch (lo termina)   
                
                 case 11: 
                System.out.println("noviembre");
                break; // interrumpe el switch (lo termina)  
                
                
                 case 12: 
                System.out.println("diciembre");
                break; // interrumpe el switch (lo termina)   
        
        
        
 
        
                 default: // opcional,se ejecuta cuando el valor capturado
                         //no coincide con ninguno de tus casos
                         // es la ulima instruccion y no tiene break
                     System.out.println("numero de mes no valido");
        
        }
                
        
        
        
        
        
        
        
        // TODO code application logic here
    
    
}
}

   
    

