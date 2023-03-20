/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
*/
package manosalaobra;

import java.util.Scanner;

public class Ejercicio08 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una nota");
        int nota = leer.nextInt();
        
        while(nota > 10 || nota < 0){
            System.out.println("Ingrese nuevamente la nota");
            nota = leer.nextInt();
        }
        
        System.out.println("Correcto");
    }
    
}
