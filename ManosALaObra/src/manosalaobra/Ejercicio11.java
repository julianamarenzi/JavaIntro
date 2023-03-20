/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package manosalaobra;

import java.util.Scanner;

public class Ejercicio11 {
   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();

        System.out.println(fraseCambiada(frase));
       
    }
    
    public static String fraseCambiada (String frase){
        
        int largo = frase.length();
        String frase2 = "";
        
        for (int i = 0; i < largo; i++) {
            String letra = frase.substring(i, i + 1);
            switch(letra){
                case "a":
                    frase2 = frase2.concat("@");
                    break;
                case "e":
                    frase2 = frase2.concat("#");
                    break;
                case "i":
                    frase2 = frase2.concat("$");
                    break;
                case "o":
                    frase2 = frase2.concat("%");
                    break;
                case "u":
                    frase2 = frase2.concat("*");
                    break;
                default:
                    frase2 = frase2.concat(letra);
            }
        }
        return frase2;
    }
    
}
