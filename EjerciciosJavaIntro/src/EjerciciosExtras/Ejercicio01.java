/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
*/
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio01 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de minutos");
        int minutos = leer.nextInt();
        int dias = 0, horas = 0;
        
        horas = minutos / 60;
        dias = horas / 24;
        
        System.out.println(minutos + " minutos son: ");
        System.out.println(dias + " dias y " + horas + " horas");
        
    }
    
}
