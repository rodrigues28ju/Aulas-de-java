/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades2009;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class Exercicio3 {
     public static void main(String[] args) {
         
         int matricula;
          Scanner sc = new Scanner(System.in);
          System.out.println("Digite a matricula  do aluno: ");
          matricula = sc.nextInt();
          
          
           Double nota1, nota2,nota3, media;
    
           System.out.println("Digite a primeira nota: ");
           nota1 = sc.nextDouble();
    
           System.out.println("Digite a segunda nota");
           nota2 = sc.nextDouble();
           
           System.out.println("Digite a terceira nota");
           nota3 = sc.nextDouble();
           
           media = nota1 + nota2 + nota3 / 3;
           
           System.out.println("matricula do aluno "  +matricula);
           
           System.out.println("Resultado da média =  "  +media);
                   
          
          
          
         
     }
    
}

