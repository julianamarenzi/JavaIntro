/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
*/
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int rta;
        
        do {
            System.out.println("");
            System.out.println("¿Qué desea realizar? \n" + "1. Sumar \n" + "2. Restar \n" + "3. Multiplicar \n" + "4. Dividir \n" + "5. Salir");
            rta = leer.nextInt();
        
            switch(rta){
                case 1:   
                    System.out.println(num1 + " + " + num2 + " = " + Suma(num1, num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + Resta(num1, num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + Multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println(num1 + " / " + num2 + " = " + Dividir(num1, num2));
                    break;
            }
        } while (rta != 5);
        
        System.out.println("Adiós");
        
    }
    
    public static int Suma(int num1, int num2){
        
        int rta = num1 + num2;
        return rta;
        
    }
    
    public static int Resta(int num1, int num2){
        
        int rta = num1 - num2;
        return rta;
        
    }
    
    public static int Multiplicar(int num1, int num2){
        
        int rta = num1 * num2;
        return rta;
        
    }
    
    public static int Dividir(int num1, int num2){
        
        int rta = num1 / num2;
        return rta;
        
    }
    
}
