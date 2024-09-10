/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_calificaciones;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_14_CALIFICACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calif ;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("introduce tu calicicación");
        calif = captu.nextInt();
        
        if (calif >= 70) {
            System.out.println("aprobado");
        } else {
        System.out.println("No aprobaste");
    }
        // TODO code application logic here
    }
    
}
