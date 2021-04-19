/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2.senif;

import java.util.Scanner;

/**
 *
 * @author Campe
 */
public class EJERCICIO2SenIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Valor1;
        int Valor2;
        
        Scanner Ingresar = new Scanner(System.in);
        System.out.println("Ingresa Un Valor 1:");
        Valor1 = Ingresar.nextInt();
        System.out.println("Ingrese Un Valor 2:");
        Valor2 = Ingresar.nextInt();
        
        if (Valor1 > Valor2  ) {
            System.out.println("Valor 1 Mayor y Valor 2 Menor");
        }else if (Valor1 < Valor2) {
            System.out.println("Valor 1 Menor Y Valor 2 Mayor");
        }
       
        
    }
    
}
