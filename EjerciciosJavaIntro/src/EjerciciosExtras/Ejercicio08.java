/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
*/
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio08 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num, par = 0, impar = 0, cont = 0;
        
        System.out.println("Ingrese números");
        do {
            num = leer.nextInt();          
            if (num > 0) {
                cont++;
                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }   
            }
        } while (num % 5 != 0);
        
        System.out.println("Cantidad de números pares: " + par);
        System.out.println("Cantidad de números impares: " + impar);
        System.out.println("Cantidad de números ingresados: " + cont);
        
    }
    
}
