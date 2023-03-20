/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
 * Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15%
 * Primer Integrador 25%
 * Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
*/
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio21 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        double notas[] = new double [10];
        int nota1, nota2, nota3, nota4;
        double promedio;
        int aprobados = 0, desaprobados = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Notas del alumno N°" + (i + 1));
            do {
                System.out.print("Primer trabajo práctico: ");
                nota1 = leer.nextInt();
            } while (!(nota1 <= 10 && nota1 >= 1));
            do {
                System.out.print("Segundo trabajo práctico: ");
                nota2 = leer.nextInt();
            } while (!(nota2 <= 10 && nota2 >= 1));
            do {
                System.out.print("Primer Integrador: ");
                nota3 = leer.nextInt();
            } while (!(nota3 <= 10 && nota3 >= 1));
            do {
                System.out.print("Segundo Integrador: ");
                nota4 = leer.nextInt();
            } while (!(nota4 <= 10 && nota4 >= 1));           
            promedio = nota1 * 0.10 + nota2 * 0.15 + nota3 * 0.25 + nota4 * 0.5;
            notas[i] = promedio;
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("---Promedio de Alumnos---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno N°" + (i + 1) + ": " + notas[i]);
        }
        
        for (int i = 0; i < 10; i++) {
            if (notas[i] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        
        System.out.println("");
        System.out.println("---Aprobados y desaprobados---");
        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos desaprobados: " + desaprobados);
        
    }
    
}
