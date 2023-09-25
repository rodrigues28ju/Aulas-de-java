/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class Atividade2509 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        Double peso,altura,imc;
         
         
         System.out.println("Digite o seu nome: ");
         nome = sc.next();
         
         
         System.out.println("Digite a sua idade: ");
         idade = sc.nextInt();
         
         System.out.println("Digite o seu peso: ");
         peso = sc.nextDouble();
         
         System.out.println("Digite a sua Altura: ");
         altura = sc.nextDouble();
         
         imc = peso / (altura * altura);
         
         if (imc<=18.5){
             System.out.println("Nome = "+nome+    "idade = "+idade+    "Peso = "+peso+   "Altura = "+altura+   "Seu Imc = "+imc+   "abaixo do peso normal");
             
         } else if (imc>=18.5 && imc<=24.9){
             System.out.println("Nome = " +nome+ "   idade = "  +idade+    "Peso = " +peso+  "Altura = "   +altura+   "Seu Imc = "    +imc+ " peso normal");
             
         }else if (imc>=25.0 && imc<=29.9){
             System.out.println("Nome = " +nome+ " idade = " +idade+  "Peso = " +peso+ "Altura = " +altura+ "Seu Imc = "  +imc+  "Você esta com excesso de peso");
    
         }else if (imc>=30.0 && imc<=34.9){
             System.out.println("Nome = " +nome+ " idade = "  +idade+  "Peso = " +peso+ "Altura = " +altura+ "Seu Imc = " +imc+ "Você esta com Obesidade classe 1");
    
         }else if (imc>=35.0 && imc<=39.9){
             System.out.println("Nome = "  +nome+ " idade = "  +idade+  "Peso = " +peso+ "Altura = "  +altura+ "Seu Imc = "  +imc+  "Você esta com Obesidade classe 2");
    
         } else if(imc>=40.0){
         System.out.println("Nome = "  +nome+ " idade = "  +idade+  "Peso = "   +peso+ "Altura = "   +altura+ "Seu Imc = "  +imc+ "Você esta com Obesidade classe 3");
    }
    }
         
       
         
    }

