/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
*/
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio20 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        int vector[] = new int [n];
        
        Relleno(vector, n);
        Imprimir(vector, n);
        
    }
    
    public static void Relleno(int vector[], int n){
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        
    }
    
    public static void Imprimir(int vector[], int n){
        
        for (int i = 0; i < n; i++) {
            System.out.println("Vector " + i + " = [" + vector[i] + "]");
        }
        
    }
    
}
