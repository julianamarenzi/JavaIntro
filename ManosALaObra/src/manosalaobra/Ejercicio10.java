/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
package manosalaobra;

import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            System.out.print(num);
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
    
}
