/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package manosalaobra;

import java.util.Scanner;

public class Ejercicio09 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num, cont = 0;
        
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            if (num != 0 || num < 0) {
                cont++;  
            }
        } while (num != 0 && cont < 20);
        
        System.out.println("Se capturó el número 0");
        System.out.println("Se han ingresado " + cont + " números");
        
    }
    
}
