/*
Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner.
 */
package manosalaobra;

import java.util.Scanner;

public class Ejercicio05 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        boolean rta;
        double num1;
        char caracter;
        
        System.out.print("Boolean: ");
        rta = leer.nextBoolean();
        
        System.out.print("Double: ");
        num1 = leer.nextDouble();
        
        System.out.print("Char: ");
        caracter = leer.next().charAt(0);
        
    }
    
}
