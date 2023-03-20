/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        
        System.out.println("Mayúscula: " + frase.toUpperCase() + "\n" + 
                "Minúscula: " + frase.toLowerCase());
        
    }
    
}
