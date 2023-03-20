/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio05 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero");
        int num = leer.nextInt();
        
        System.out.println("Doble: " + num * 2);
        System.out.println("Triple: " + num * 3);
        System.out.println("Raiz cuadrada: " + Math.sqrt(num));
        
    }
    
}
