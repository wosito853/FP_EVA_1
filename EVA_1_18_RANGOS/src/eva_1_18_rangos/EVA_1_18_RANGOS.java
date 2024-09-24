/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_18_rangos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA_1_18_RANGOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calif;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce tu calificacion");
        calif = captu.nextInt();
        
        if (calif >= 0 && calif <= 100){
            System.out.println("valida");
        } else {
        System.out.println("no valida");
        }
        
        
        // TODO code application logic here
    }
    
}
