/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade2aula2009;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class Atividade2Aula2009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //estratura de decisão
        
        int idade;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
       idade = sc.nextInt();
       
       if(idade>=18){
           System.out.println("Você é maior de idade! ");
       }
       else {
           System.out.println("Você é menor de idade! ");
       }
    }
    
}
