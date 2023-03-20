/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
*/
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio18 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de su vector");
        int n = leer.nextInt();
        int vector [] = new int [n];
        int cont = 0;
        
        System.out.println("Ingrese " + n + " números");
        for (int i = 0; i < n; i++) {
            vector[i] = leer.nextInt();
            cont += vector[i];
        }
        
        System.out.println("La suma de todos los números ingresados es de: " + cont);
            
    }
    
}
