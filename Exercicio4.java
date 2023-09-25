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
public class Exercicio4 {
      public static void main(String[] args) {
          String  nome;
          Scanner sc = new Scanner(System.in);
          System.out.println("Digite o nome do funcionário: ");
          nome = sc.next();
          
          Double horas,horast,valor,salario;
          
          System.out.println("Digite a quantidades de horas trabalhadas: ");
           horas = sc.nextDouble();
           
            horast = horas * 8 * 26;
           
           System.out.println("Digite o valor da horas trabalhadas: ");
           valor = sc.nextDouble();
           
          
           
           salario = horast * valor;
           
           System.out.println("Nome do funcionário "  +nome);
           
           System.out.println("Salario pago no mês =  "  +salario);
          
          
      }
}
