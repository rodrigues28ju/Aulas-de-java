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
public class vetor1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       
        String nome[] = new String[5];
        for (int i =0;i<=4;i++){
            System.out.println("Digite Seu nome: ");
            nome[i] = sc.next();
            
        }
        for(int i=0;i<=4;i++){
            System.out.println("Nome " +(i+1)+" = " +nome[i]);
        }
    }
}
