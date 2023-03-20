/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.
*/
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio03 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra: ");
        String letra = leer.next().toUpperCase();
        
        if (letra.equals("A") || letra.equals("E") || letra.equals("I") ||
                letra.equals("O") || letra.equals("U")) {
            System.out.println("Su letra es una vocal");
        } else {
            System.out.println("Su letra es una consonante");
        }
        
    }
    
}
