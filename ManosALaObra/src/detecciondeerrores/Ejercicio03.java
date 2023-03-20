/*
public static void main(String[] args) {
Scanner leer = new Scanner();
System.out.println("Ingresa tu edad");
String nombre = leer.nextInt();

System.out.println("Ingresa tu nombre");
int edad = leer.next();
}
}
 */
package detecciondeerrores;

import java.util.Scanner;

public class Ejercicio03 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
        
        System.out.println("Ingrese tu nombre");
        String nombre = leer.next();
        
    }
    
}
