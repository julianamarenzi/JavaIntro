/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese otro número: ");
        int num2 = leer.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println(num1 + " + " + num2 + " = " + suma);
        
    }
    
}
