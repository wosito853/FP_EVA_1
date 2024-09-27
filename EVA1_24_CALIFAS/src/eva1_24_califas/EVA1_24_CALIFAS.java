/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_24_califas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_24_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int cal;
       
       Scanner captu = new Scanner (System.in);
        System.out.println("introduce tu calificacion ");
       cal = captu.nextInt();
       captu.nextLine();
       
       if (cal >= 90 && cal <= 100 ){
           System.out.println("tu calificacion es A");
       }
       else if (cal >= 80 && cal <= 89){
           System.out.println("tu calificacion es B");
       }
       else if (cal >= 70 && cal <=79){
           System.out.println("tu calificacion es C");
       }
       else if (cal >= 60 && cal <=69){
           System.out.println("tu calificacion es D");
       }
       else if (cal >= 0 && cal <= 59){
           System.out.println("tu calificacion es F");
       }
       
       
       
    }
    
}
