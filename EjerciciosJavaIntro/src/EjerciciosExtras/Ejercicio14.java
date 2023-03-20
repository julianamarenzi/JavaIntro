/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
*/
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio14 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de familias que desea ingresar");
        int familias = leer.nextInt();
        int cont = 0, contEdades = 0;
        
        for (int i = 1; i <= familias; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia N°" + i);
            int hijos = leer.nextInt();
            for (int j = 1; j <= hijos; j++) {
                System.out.println("Ingrese la edad del Hijo " + j);
                int edad = leer.nextInt();
                cont++;
                contEdades += edad;
            }
        }
        
        System.out.println("Se ingresaron " + cont + " hijos");
        System.out.println("El promedio de edad de los hijos de las familias es de " + (contEdades / cont));
        
    }
    
}
