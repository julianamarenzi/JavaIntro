/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
*/
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio16 {
 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        String rta; 
        
        do {
            Persona();
            System.out.println("¿Desea seguir ingresando personas? S/N");
            rta = leer.next();         
        } while (rta.equalsIgnoreCase("S"));
        
    }
    
    public static void Persona(){
        
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        int edad;
        
        System.out.println("Ingrese el nombre de la persona");
        nombre = leer.next();
        System.out.println("Ingrese la edad");
        edad = leer.nextInt();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        if (edad >= 18) {         
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        
    }
    
}
