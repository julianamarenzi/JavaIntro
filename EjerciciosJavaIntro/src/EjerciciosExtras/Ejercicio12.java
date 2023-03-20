/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
*/
package EjerciciosExtras;

public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        String num1, num2, num3;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    num1 = String.valueOf(i);
                    num2 = String.valueOf(j);
                    num3 = String.valueOf(k);
                    if (num1.equals("3")) {
                        num1 = "E";
                    }
                    if (num2.equals("3")) {
                        num2 = "E";
                    }
                    if (num3.equals("3")) {
                        num3 = "E";
                    }
                    System.out.println(num1 + "-" + num2 + "-" + num3);
                }
            }
        }
        
    }
    
}
