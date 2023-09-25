/* Aula do dia 25/09/2023 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class Aula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double n1,n2,n3,n4,media;
        
        System.out.println("Digite a nota do 1° bimestre: ");
        n1 = sc.nextDouble();
        
        System.out.println("Digite a nota do 2° bimestre: ");
        n2 = sc.nextDouble();
        
        System.out.println("Digite a nota do 3° bimestre: ");
        n3 = sc.nextDouble();
        
         System.out.println("Digite a nota do 4° bimestre: ");
        n4 = sc.nextDouble();
        
        
        media = (n1+n2+n3+n4) / 4;
        
       /* 
         if (media>=6){
           System.out.println("Aluno aprovado - Media =" +media);
       }
       else if (media>=3){
           System.out.println("Aluno recuperaçao - Media = "+media);
       } 
       else{
           System.out.println("Aluno reprovado - Media = "+media);
       } 
        */
       
        if (media <3){
           System.out.println("Aluno Reprovado");
       }
       else if (media <=5.9) {
           System.out.println("Aluno de recuperacao");
       }
       else {
           System.out.println("Aluno Aprovado");
       }
        
        
        
        // TODO code application logic here
    }
    
}
