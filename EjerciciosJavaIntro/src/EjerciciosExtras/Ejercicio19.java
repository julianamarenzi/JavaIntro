/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
*/
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio19 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el largo deseado para ambos vectores");
        int n = leer.nextInt();
        int vector1 [] = new int [n];
        int vector2 [] = new int [n];
        int cont = 0;
        
        for (int i = 0; i < n; i++) {
            vector1[i] = (int) (Math.random() * 2);
            vector2[i] = (int) (Math.random() * 2);
        }
        
        System.out.println("");
        System.out.println("Vector 1");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector1[i] + "] ");
        }
        
        System.out.println("");
        System.out.println("Vector 2");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector2[i] + "] ");
        }
        
        System.out.println("");
        for (int i = 0; i < n; i++) {
            if (vector1[i] == vector2[i]) {
                cont++;
            } else {
                i = n;
            }
        }
        
        System.out.println("");
        if (cont == n) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
    }
    
}
