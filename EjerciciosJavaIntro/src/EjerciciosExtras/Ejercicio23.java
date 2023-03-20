/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
*/
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio23 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String[][] matriz = new String[20][20];       
        String palabra;
        int fila, columna, num = 0, largo, letra = 0;
       
        System.out.println("Ingrese cinco palabras de entre 3 y 5 caracteres:");
                                         
        for (int i = 0; i < 5; i++) { 
            palabra = leer.next();
            largo = palabra.length();
            switch(largo){
                case 3:
                    num = 17;
                    break;
                case 4:
                    num = 16;
                    break;
                case 5:
                    num = 15;
                    break;
            }
            fila = (int)(Math.random() * 19);
            columna = (int)(Math.random() * num);
            for (int j = 0; j < largo; j++){                                            
                matriz[fila][columna + j] = palabra.substring(letra, letra + 1);
                letra++; 
            }               
            letra = 0;
        }                        
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++){               
            if (matriz[i][j] == null) {
                matriz[i][j] = String.valueOf((int)(Math.random()*9));
                }            
            }                
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++){
                System.out.print("[" + matriz[i][j] + "]");  
            }
            System.out.println("");
        }
        
    }
    
}
