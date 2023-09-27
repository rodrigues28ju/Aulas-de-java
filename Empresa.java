/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2;

import java.util.Scanner;

/**
 *
 * @author 36129532023.4
 */
public class Empresa {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String nome,sexo,resp,inicio;
          int idade;
          int contador = 0;
          int contm = 0;
          int contf = 0;
          
          System.out.println("Voce gostaria de participar da pesquisa?  Responda S pra sim");
          inicio = sc.next();
          
           while(inicio.equals("S")| inicio.equals("s"))  {
               
                System.out.println("Digite Nome:");
                 nome = sc.next();
        
                 System.out.println("Digite Idade:");
                 idade = sc.nextInt();
                 
                 System.out.println("Digite Seu sexo (F ou M):");
                  sexo = sc.next();
                  
                  System.out.println("Gostou do produto? ");
                  resp = sc.next();
                  
                  contador++;
             
                   if (sexo.equals("M") | sexo.equals("m")){
                    contm++;          
                  }else if  (sexo.equals("F") | sexo.equals("f")){
                    contf++;          
        }
                   
                   System.out.println("Voce gostaria de participar da pesquisa?  Responda S pra sim");
                   inicio = sc.next();

                    
      
           }
           
            System.out.println("Quantidade de pessoas que respoderam a pesquisa = "+contador);
            System.out.println("Quantidade de Homens que respoderam a pesquisa = "+contm);
            System.out.println("Quantidade de Mulheres que respoderam a pesquisa = "+contf);
            
            
     }
}
