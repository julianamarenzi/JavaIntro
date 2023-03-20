/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de su vetor");
        int n = leer.nextInt();
        
        int [] vector = new int [n];
        int cont = 0;
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println("Vector [" + i + "] = " + vector[i]);
        }
        
        System.out.println("Ingrese un número a buscar en el vector");
        int num = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                cont++;
            }
        }
        
        if (cont < 1) {
            System.out.println("No se ha encontrado su número");
        } else {
            System.out.println("Su número se encuentra en: ");
        }
        
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                System.out.println("Vector [" + i + "]");
            }           
        }
        
    }
    
}
