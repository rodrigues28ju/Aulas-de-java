/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula0210;
//leia  o nome e a idade de 5 pessoas em vetor . ao final mostrar e a idade de todos eles
import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class vetor3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int idade[] = new int[5];
        String nome[] = new String[5];
        
        for(int i=0;i<=4;i++){
            System.out.println("Digite Seu nome: ");
             nome[i] = sc.next();
            System.out.println("Digite Sua idade: ");
             idade[i] = sc.nextInt();  
        }
       for(int i=0;i<=4;i++){
            System.out.println("********Dados da " +(i+1)+" Pessoa******** ");
            System.out.println("Nome " +(i+1)+" = " +nome[i]);
            System.out.println("Idade " +(i+1)+" = " +idade[i]);
        }
      
    }
}
