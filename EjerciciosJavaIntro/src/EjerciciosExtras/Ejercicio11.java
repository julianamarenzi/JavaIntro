/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados.
*/
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero");
        int num = leer.nextInt();
        int digitos = 0;
        int aux = num;
        
        do {
            num /= 10;
            digitos++;
        } while (num % 10 != 0 || num == 10);
        
        System.out.println("El número " + aux + " tiene " + digitos + " dígitos.");
        
        
    }
    
}
