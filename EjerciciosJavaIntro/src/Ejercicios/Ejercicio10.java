/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor límite");
        int limite = leer.nextInt();
        int cont = 0;
        
        do {
            System.out.println("Ingrese un número");
            int num2 = leer.nextInt();
            cont += num2;
        } while (cont < limite);
        
        if (cont == limite) {
            System.out.println("Ha llegado a su límite");
        } else {
            System.out.println("Ha superado su límite");
        }
        
    }
    
}
