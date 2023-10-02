/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula0210;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class atividade1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int numero[] = new int[5];
        
        
        for (int i =0;i<=4;i++){
            System.out.println("Digite um numero: ");
            numero[i] = sc.nextInt();
            
        }
        
        for(int i=0;i<=4;i++){
            System.out.println(" Numero Digitado " +(i+1)+" = " +numero[i]);
            System.out.println("Dobro " +(i+1)+" = " +numero[i]*2);
        }
    }
}
