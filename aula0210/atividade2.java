/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula0210;
//leia  9 numeros inteiros em uma matriz  3x3 ao final imprima os valores armazenados
import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class atividade2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int numeros[][] = new int[5][2];
        
        for (int i=0;i<=4;i++){
            for(int j=0;j<=1;j++){
                System.out.println("Digite o numero: ");
                numeros[i][j] =sc.nextInt();
                 System.out.print(numeros[i][j] +"|" );
            }
        }
        
        System.out.println(" dobro Numeros armazenados na matriz de dados");
        
         for (int i=0;i<=4;i++){
             System.out.println("");
            for(int j=0;j<=1;j++){
                System.out.print(numeros[i][j]*2 +"|" );
            }
        }
      
    }
}
