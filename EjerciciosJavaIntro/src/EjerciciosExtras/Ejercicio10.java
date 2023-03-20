/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
*/
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int multi = num1 * num2;
        int rta;
        
        System.out.println("Adivine el resultado de la siguiente multiplicación: ");
        System.out.println(num1 + " * " + num2);
        do {
            rta = leer.nextInt();
            if (rta != multi) {
                System.out.println("INCORRECTO");
            }
        } while (rta != multi);
        
        System.out.println("Felicitaciones! Ha adivinado");
        
    }
    
}
