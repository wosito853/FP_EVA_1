/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_16_.hacienda_.corr;


import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_16_HACIENDA_Corr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        
        char tipo;
        Scanner captu = new Scanner(System.in);
        System.out.println("Tipo de persona Fisica--> F y moral--> M:");
        tipo = captu.nextLine().charAt(0);
        System.out.println(tipo);
        
        // imprimir el tipo de persona:
        if (tipo == 'F'){
            System.out.println("persona fisica");
        }else {
            System.out.println("persona moral");
        }
     
    }
    
}
