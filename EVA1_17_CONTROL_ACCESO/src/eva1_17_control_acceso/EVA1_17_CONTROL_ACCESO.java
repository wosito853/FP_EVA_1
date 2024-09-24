/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_control_acceso;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_17_CONTROL_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String usu, contr;
        Scanner captu = new Scanner (System.in);
        System.out.println("ingresa tu usuario:");
        usu = captu.nextLine();
      
        System.out.println("ingresa tu contraseña:");
        contr = captu.nextLine();
       
        if (usu.equals("Admin") && contr.equals("1234")){
            System.out.println("Bienvenido");
        }else {
            System.out.println("acceso denegado");
        }
        
        
        
        
        
       
    
    
    }
    
}
