/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
*/
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio06 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas");
        int cant = leer.nextInt();
        int cont = 0;
        double promedio = 0;
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese la altura de la Persona N°" + (i + 1));
            double altura = leer.nextDouble();
            if (altura < 1.60) {
                cont++;
            }
            promedio += altura;
        }
        
        System.out.println("El " + (cont * 100 / cant) + "% mide menos que 1.60 mts");
        System.out.println("El promedio de altura es de " + (promedio / cant) + " mts");
        
    }
    
}
