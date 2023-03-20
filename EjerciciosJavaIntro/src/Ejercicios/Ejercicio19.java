/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio19 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de su matriz");
        int n = leer.nextInt();
        
        int [][] matriz = new int [n][n];
        int [][] matriz2 = new int [n][n];
        int cont = 0;
        
        System.out.println("Matriz 1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
        System.out.println("Matriz 2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz2[i][j] = leer.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz2[i][j] + "]");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == matriz2[j][i]) {
                    cont++;
                }
            }
        }
        
        if (cont == 9) {
            System.out.println("La matriz es anti simétrica");
        } else {
            System.out.println("La matriz no es anti simétrica");
        }
        
    }
    
}
