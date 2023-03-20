/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
*/
package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese le tamaño de su vector");
        int n = leer.nextInt();
        
        int [] vector = new int [n];
        String digitos;
        int largo, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 99999);
            System.out.println("Vector [" + i + "] = " + vector[i]);
        }
        
        for (int i = 0; i < n; i++) {
            digitos = String.valueOf(vector[i]);
            largo = digitos.length();
            switch(largo){
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;                   
            }                   
        }
        
        System.out.println("En el vector hay: ");
        System.out.println(cont1 + " números con 1 dígito");
        System.out.println(cont2 + " números con 2 dígitos");
        System.out.println(cont3 + " números con 3 dígitos");
        System.out.println(cont4 + " números con 4 dígitos");
        System.out.println(cont5 + " números con 5 dígitos");      
        
    }
    
}
