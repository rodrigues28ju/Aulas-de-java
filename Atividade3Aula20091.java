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
public class Atividade3Aula20091 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //estratura de decisão
        
        Double n1,n2,n3,n4,media;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a média do 1° bimestre:  ");
        n1 = sc.nextDouble();
        
        System.out.println("Digite a média do 2° bimestre:  ");
        n2 = sc.nextDouble();
        
        System.out.println("Digite a média do 3° bimestre:  ");
        n3 = sc.nextDouble();
       
        System.out.println("Digite a média do 1° bimestre:  ");
        n4 = sc.nextDouble();
        
         media = (n1+n2+n3+n4)/4;  
        
         if(media>=6){
            System.out.println("Aluno Aprovado! - Média = "+media);
        }
        else{
            System.out.println("Aluno Reprovado! - Média = "+media);
        }
       
    }
    
}
