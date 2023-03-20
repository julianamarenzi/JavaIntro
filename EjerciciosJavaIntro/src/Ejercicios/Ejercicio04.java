/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio04 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de grados centígrados");
        Double grados = leer.nextDouble();
        
        Double fahr = 32 + (9 * grados / 5);
        
        System.out.println(grados + "°C equivalen a " + fahr + " °F");
        
    }
    
}
