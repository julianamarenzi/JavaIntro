/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de dinero en euros a convertir");
        double dinero = leer.nextDouble();
        
        conversor(dinero);
        
    }
    
    public static void conversor(double dinero){
        
        System.out.println(dinero + "€ son " + (dinero * 0.86) + " libras");
        System.out.println(dinero + "€ son " + (dinero * 1.28611) + " dolares");
        System.out.println(dinero + "€ son " + (dinero * 129.852) + " yenes");
        
    }
    
}
