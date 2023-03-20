/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.
*/
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio07 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("---While---");
        System.out.println("Ingrese la cantidad de números que desea introducir");
        int cant = leer.nextInt();
        int cont = 0, promedio = 0, valorMin = 0, valorMax = 0;
        boolean min = false;
        
        System.out.println("Ingrese los números");
        while(cont < cant){           
            int num = leer.nextInt();
            if (min == false) {
                valorMin = num;
                min = true;
            }
            if (num < valorMin) {
                valorMin = num;
            }
            if (num > 0) {
                promedio += num;
                cont++;
            }
            if (num > valorMax) {
                valorMax = num; 
            }          
        }
        
        System.out.println("Valor mínimo: " + valorMin);
        System.out.println("Valor máximo: " + valorMax);
        System.out.println("Promedio: " + (promedio / cant));
        
        System.out.println("");
        System.out.println("---Do While---");
        System.out.println("Ingrese la cantidad de números que desea introducir");
        int cant2 = leer.nextInt();
        cont = 0;
        promedio = 0; 
        valorMin = 0; 
        valorMax = 0;
        boolean min2 = false;
        
        System.out.println("Ingrese los números");
        do {
            int num = leer.nextInt();
            if (min2 == false) {
                valorMin = num;
                min2 = true;
            }
            if (num < valorMin) {
                valorMin = num;
            }
            if (num > 0) {
                promedio += num;
                cont++;
            }
            if (num > valorMax) {
                valorMax = num; 
            }
        } while (cont < cant2);
        
        
        System.out.println("Valor mínimo: " + valorMin);
        System.out.println("Valor máximo: " + valorMax);
        System.out.println("Promedio: " + (promedio / cant2));
        
    }
    
}
