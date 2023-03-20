/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package manosalaobra;

import java.util.Scanner;

public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de integrantes de su equipo");
        int n = leer.nextInt();
        String[] vector = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre del integrante N°" + (i + 1));
            vector[i] = leer.next();
        }
        
        System.out.println("");
        System.out.println("-----Integrantes del equipo-----");
        
        for (int i = 0; i < n; i++) {
            System.out.println(vector[i]);
        }
    }
    
}
