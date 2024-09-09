/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_tipos.de.instrucciones_.aigs;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_13_TIPOSDEINSTRUCCIONES_AIGS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // instrucciones condicionales; toma de decisiones, elecciones
       // logica booleana
       // operaciones con verdadero o falso 
       //if-->  si--> toma de deciones ( verdadero o falso)
       // switch --> elecciones entre varias alternativas
       // comparacion lógica:operadores
       // < menor que
       // > mayor que
       // == igual que 
       //! diferente que 
       // >= mayor o igual
       // < = menor que 
       // ! negacion 
       
       
       int edad ;
       Scanner captu = new Scanner(System.in);
        
       System.out.println(" introduce tu edad");
          edad = captu.nextInt();
          
          // instrucción IF
          // SI ( algo se cumple) es verdadero
          // que hago si se cumple
          // que hago si (no se cumple) es falso
          
          if (edad >= 18){
              // aqui van las instrucciones si la evaluación
              // es VERDADERO
              System.out.println("Adulto: mayor de edad");
              
          }else{// bloque de falso
              System.out.println("menor de edad");
          
          }
          
          
          
        
       
       
       
    }
    
}
