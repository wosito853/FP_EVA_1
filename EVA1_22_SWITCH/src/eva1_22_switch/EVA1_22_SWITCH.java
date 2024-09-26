/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_22_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // elección de opciones sencillas
        int dia;
        Scanner captu = new Scanner (System.in);
        System.out.println("captura el número del dia (1 a  7)");
        dia = captu.nextInt();
        captu.nextLine();
        
        
        switch(dia){
            case 1: 
                System.out.println("domingo");
                break; // interrumpe el switch (lo termina)
        
         case 2: 
                System.out.println("lunes");
                break; // interrumpe el switch (lo termina)
                
                 case 3: 
                System.out.println("martes");
                break; // interrumpe el switch (lo termina)   
        
         case 4: 
                System.out.println("miercoles");
                break; // interrumpe el switch (lo termina)   
        
                 case 5: 
                System.out.println("jueves");
                break; // interrumpe el switch (lo termina)   
                
                 case 6: 
                System.out.println("viernes");
               break; // interrumpe el switch (lo termina) 
                
                 case 7: 
                System.out.println("sabado");
                break; // interrumpe el switch (lo termina)   
        
                 default: // opcional,se ejecuta cuando el valor capturado
                         //no coincide con ninguno de tus casos
                         // es la ulima instruccion y no tiene break
                     System.out.println("numero de dia no valido");
        
        }
                
        
        
        
        
        
        
        
        // TODO code application logic here
    
    
}
}
