/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author Delfino
 */
public class SomaSimples {
    public static void main(String[] args) {
        int num1 , num2 , total ; 
        Scanner entrada = new Scanner(System.in);
        
        //apresentação
        System.out.println("\n\t\t\t-- Soma Simles--");
        
        //entrada
        System.out.print("informe o primeiro numero:");
        num1 = entrada.nextInt();
        System.out.print("informe outro numero: ");
        num2 = entrada.nextInt();
 
        //processamento
        total = num1 + num2;
        
        //saida
        System.out.printf("\n\t %d + %d = %d\n", num1 , num2 , total);
   
        
    }
    
}
