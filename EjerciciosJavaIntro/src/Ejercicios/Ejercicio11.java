/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int rta;
        String sino = "N";
        
        do {
            System.out.println("¿Qué desea realizar?");
            System.out.println("MENU" + "\n" + 
                "1. Sumar" + "\n" +
                "2. Restar" + "\n" + 
                "3. Multiplicar" + "\n" +
                "4. Dividir" + "\n" + 
                "5. Salir");
            rta = leer.nextInt();
            switch(rta){
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    sino = leer.next();                    
            }
        } while (!sino.equalsIgnoreCase("S"));
         
        System.out.println("Adiós!");
        
    }
    
}
