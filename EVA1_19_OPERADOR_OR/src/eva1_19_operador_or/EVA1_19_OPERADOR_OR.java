/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_operador_or;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_19_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int km, meses;
        
        Scanner captu= new Scanner (System.in);
     System.out.println("cuantos kiometros desde el ultimo cambio de aceite?");
        km = captu.nextInt();
        captu.hasNextLine();
        
    System.out.println("cuantos meses desde el ultio cambio de aceite");
        meses = captu.nextInt();
        captu.hasNextLine();
        
        if (km >= 5000 || meses >= 6){
            System.out.println(" hace falta cambiar el aceite!! ");
        } else {
            System.out.println("no te hace falta el cambio de aceite");
        }
        
        
        
        
        
        // TODO code application logic here
    }
    
}
