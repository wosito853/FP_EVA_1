/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_validar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_10_VALIDAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int dia;
        
    
        Scanner captu = new Scanner (System.in);
        
        do{
        System.out.println("ingresa el numero de tu dia (1 a 7):");
        dia = captu.nextInt();
        captu.nextLine();
       }  while(dia < 1 || dia >7);
        // While(!(dia <= 1 && dia <=7))
        
        
        if(dia == 1){
            System.out.println("domingo");
    } else if(dia == 2){
            System.out.println("lunes");
    }else if(dia == 3){
            System.out.println("martes");
    }
     else if(dia == 4){
     System.out.println("miercoles");
            }
        else if(dia == 5){
     System.out.println("jueves");
            }
        else if(dia == 6){
     System.out.println("viernes");
            }
        else if(dia == 7){
     System.out.println("Sabado");
            } else {
            System.out.println("dia invalido");
        }
        
        
        
        
        
        
            // TODO code application logic here
    
    }
    
}
