/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setenciasifusuariointroduzca;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Setenciasifusuariointroduzca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca un numero cualquiera");
        int numero1 = leer.nextInt();
        
        if(numero1 >= 0){
            System.out.println("Positivo");
        }else {
            System.out.println("Negativo");
        }
        
    }
    
}
