/*
Crear un programa que dado un numero determine si es par o impar.
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio06 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        int num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("Su número es par");
        } else {
            System.out.println("Su número es impar");
        }
        
    }
    
}
