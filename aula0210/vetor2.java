/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula0210;
//leia 10 numeros inteiros inteiros e ao final mostre os numeros lidos
import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class vetor2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       
       int numero[] = new int[10];
       
       for(int i=0;i<=9;i++){
           System.out.println("Digite número:  ");
           numero[i] = sc.nextInt();
       }
       for (int i=0;i<=9;i++){
           System.out.println("Número na Posiçao ["+(i+1)+"] = " +numero[i] );
       }
    }
}
