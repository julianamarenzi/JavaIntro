/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
*/
package EjerciciosExtras;

public class Ejercicio02 {
    
    public static void main(String[] args) {
        
        int A = 1, B = 2, C = 3, D = 4, aux = B;
        
        System.out.println("Variables:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        
        System.out.println("");
        System.out.println("Variables cambiadas:");
        B = C;
        C = A;
        A = D;
        D = B;
        
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        
    }
    
}
