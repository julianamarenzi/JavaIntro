/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
*/
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio05 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de obra social qie tiene A/B/C");
        String obraSocial = leer.next().toUpperCase();
        System.out.println("Ingrese el costo del tratamiento: ");
        int tratamiento = leer.nextInt();
        
        switch(obraSocial){
            case "A":
                System.out.println("---Socio Tipo A---");
                System.out.println("Precio del tratamiento $" + (tratamiento * 0.5));
                break;
            case "B":
                System.out.println("---Socio Tipo B---");
                System.out.println("Precio del tratamiento $" + (tratamiento - (tratamiento * 0.35)));
                break;
            case "C":
                System.out.println("---Socio Tipo C---");
                System.out.println("Precio del tratamiento $" + tratamiento);
                break;
        }
        
    }
    
}
