/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0210;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class Aula0210 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       
        String nome;
        for (int i =1;i<=5;i++){
            System.out.println("Digite Seu nome: ");
            nome = sc.next();
            System.out.println("Nome " +i+" = " +nome);
        }
        
    }
    
}
