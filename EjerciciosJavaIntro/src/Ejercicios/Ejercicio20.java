/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int [][] matriz = new int [3][3];
        int [] cuadrado = new int [9];
        int num, cont = 0;
        
        System.out.println("Ingrese los números de su matriz (entre 1-9): ");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + i + "][" + j + "]:");
                num = leer.nextInt();
                if (num > 9) {
                    do {
                        System.out.println("Ingrese nuevamente el número");
                        System.out.print("[" + i + "]" + "[" + j + "]: ");
                        num = leer.nextInt();
                    } while (num > 9);
                    matriz[i][j] = num;
                }
                    //FILAS del 0 - 2
                    cuadrado[i] += num;  
                    //COLUMNAS del 3 - 5
                    cuadrado[j+3] += num;
                    //DIAGONALES 6 y 7
                    if(i==j){
                        cuadrado[6]+=num;
                    }
                    if(j==(2-i)){
                        cuadrado[7]+=num;               
                    }
            }
                
        }
        
        //Asigna num como la suma de la primer fila para comparar con las demas sumas
        num = cuadrado[0];
        
        //Verifica que todos los números sean igual al primero y lo suma al contador
        for (int i = 1; i < 8; i++) {
            if (num == cuadrado[i]) {
                cont++;
            }
        }
        
        if (cont == 7) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica");
        }
        
    }
    
}
