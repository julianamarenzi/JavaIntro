/*
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
 */
package manosalaobra;

import java.util.Scanner;

public class Ejercicio06 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1, num2; 
       
        System.out.println("Ingrese dos número enteros: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos números son mayores a 25");
        } else if (num1 > 25 || num2 > 25) {
            System.out.println("Uno de los números es mayor a 25");
        } else if (!(num1 > 25 && num2 > 25)) {
            System.out.println("Ninguno es mayor a 25");
        }
       
    }
      
}
