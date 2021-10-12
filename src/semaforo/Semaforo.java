/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class Semaforo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("FORMA 1:");
        Scanner ent = new Scanner (System.in);
        System.out.println("Introduce el estado del semáforo: ");
        String estado= ent.nextLine();
        if(estado.equals("Rojo")){
            System.out.println("Parar");
        }if(estado.equals("Ámbar")){
            System.out.println("Precaución");
        }if(estado.equals("Verde")){
            System.out.println("Pasar");
        }
        
     
        
    }
    
}
