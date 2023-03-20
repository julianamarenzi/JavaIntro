/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package manosalaobra;

import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        esMultiplo(num1, num2);
        
    }
    
    public static void esMultiplo(int num1, int num2){
        
        if (num1 % num2 == 0) {
            System.out.println("El primer número es múltiplo del segundo número");
        } else {
            System.out.println("El primer número NO es múltiplo del segundo número");
        }
        
    }
    
}
