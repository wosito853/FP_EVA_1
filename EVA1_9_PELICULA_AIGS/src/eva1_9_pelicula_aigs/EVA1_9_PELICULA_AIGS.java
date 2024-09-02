/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_pelicula_aigs;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_9_PELICULA_AIGS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String nombre;
        int duracion;
        String Genero;
        String Reparto;
        String clasificacion;
        int estreno;
        
        Scanner capturar;
        capturar = new Scanner(System.in);
        
        
        System.out.println("escribe el nombre de la pelicula");
        nombre = capturar.nextLine();
        
        System.out.println("escribe el genero de la pelicula");
       Genero = capturar.nextLine();
       
       
       
      System.out.println("escribe la duración de la pelicula");
      duracion = capturar.nextInt();
       capturar.nextLine();
      
      System.out.println("escribe el reparto de la pelicula");
      Reparto = capturar.nextLine();
      
      System.out.println("escribe la clasificación de la pelicula");
     clasificacion =  capturar.nextLine();
     
     System.out.println("escribe el año de salida de la pelicula");
      estreno = capturar.nextInt();
     
     
     System.out.println("DESCRIPCIÓN DE LA PELICULA");
     
     System.out.println(nombre);
       System.out.println(duracion);
       System.out.println(Genero);
       System.out.println(Reparto);
       System.out.println(clasificacion);
       System.out.println(estreno);
       
       
        
        
        
        
    }
    
}
