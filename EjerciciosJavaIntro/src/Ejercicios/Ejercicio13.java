/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los lados de su cuadrado");
        int lados = leer.nextInt();
        
        for (int i = 0; i < lados; i++) {
            if (i == 0 || i == lados - 1){
                for (int j = 0; j < lados; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            } else {
                for (int k = 0; k < lados; k++) {
                    if (k == 0 || k == lados - 1){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println("");
            }
        }
        
    }
    
}
