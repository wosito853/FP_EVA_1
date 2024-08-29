/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_entrada_datos2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_6_ENTRADA_DATOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
        String curp;
        int edad;
        double promedio;
        // crear scanner
        
        Scanner capturar;
        capturar = new Scanner(System.in);
        // captura de datos
        System.out.println("escribe/captura tu nombre completo");
        
        nombre = capturar.nextLine();
         System.out.println("captura tu CURP");
         curp = capturar.nextLine();
          System.out.println("captura tu edad");
          edad = capturar.nextInt();
           System.out.println("captura tu promedio");
           promedio = capturar.nextDouble();
           
           
           // impresion;
   
            System.out.println("VERIFICA TUS DATOS");
            System.out.println(nombre);
             System.out.println(curp);
              System.out.println(edad);
               System.out.println(promedio);
               
    }
    
}
