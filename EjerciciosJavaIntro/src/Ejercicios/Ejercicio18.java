/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int [][] matriz = new int [4][4];
        int [][] traspuesta = new int [4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 9);
            }
        }
        
        System.out.println("-Matriz-");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                traspuesta[i][j] = matriz[j][i];
            }
        }
        
        System.out.println("");
        System.out.println("-Traspuesta-");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + traspuesta[i][j] + "]");
            }
            System.out.println("");
        }
        
    }
    
}
