/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_5_entrada_datos_aigs;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_1_5_ENTRADA_DATOS_AIGS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
        
        
        // captura de datos del teclado:
        // scanner--> herramienta (clase)
        // scanner: es un tipo de dato
        Scanner capturar; // incorporar la herramienta al codigo (import)
        // no existe, hay que crearla 
        capturar = new Scanner (System.in);// creamos la herramienta Scanner
        // Darle la instrucción al usuario
        System.out.println("introduce tu nombre completo:");
        // capturar (signar un valor a la variable)
        
        nombre = capturar.nextLine(); // Capturamos todo el texto qe escriba
                      // el usuario hasta que presiona "enter"
        // next line captura solo texto
        
        System.out.println("<<<DATOS>>>>");
        
        System.out.println(nombre);
        
        
        
        
        
        
        
        
        
    }
    
}
