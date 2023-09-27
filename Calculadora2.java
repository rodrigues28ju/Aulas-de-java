
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * fazer um programa que leia um numero qualquer e calcula a tabuada de multiplicar
 */

public class Calculadora2 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
          int num,total;
          
           
           System.out.println("Digite um numero para tabuada: ");
          num = sc.nextInt();
           
           for (int i=1; i<=10; i++){
               total = num * i;
                 System.out.println(num + " x " + i + " = " + total);
         
     }
     }
    
}
