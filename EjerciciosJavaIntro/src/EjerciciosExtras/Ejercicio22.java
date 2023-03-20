/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
*/
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio22 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de su matriz");
        int n = leer.nextInt();
        int m = leer.nextInt();
        int cont = 0;
        
        int matriz[][] = new int [n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[i][j] + "]");
                cont += matriz[i][j];
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("La suma de todos los valores de la matriz es de: " + cont);
    }
    
}
