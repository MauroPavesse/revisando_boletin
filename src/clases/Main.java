
package clases;

import java.util.Scanner;

/**
 *
 * @author Copy&&Paste
 */
public class Main {
    
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Ingrese cantidad de notas: ");
        int cantidad = entrada.nextInt();
        
        int [] notas = new int[cantidad];
        System.out.println("Ingrese las notas:");
        for(int i=0; i<cantidad; i++){
            notas[i] = entrada.nextInt();
        }
        System.out.println("RESULTADO:\n");
        
        int sumaNotas = sumaNotas(notas);
        System.out.println(sumaNotas);
        int promedio = promedio(notas, sumaNotas);
        System.out.println(promedio);
        if(verAprobado(promedio))
            System.out.println("SI");
        else
            System.out.println("NO");
        System.out.println(mejorNota(notas));
    }
    
    public static int sumaNotas(int[] notas){
        int suma=0;
        for(int i=0; i<notas.length; i++){
            suma += notas[i];
        }
        return suma;
    }
    
    public static int promedio(int[] notas, int suma){
        return (int) suma/notas.length;
    }
    
    public static boolean verAprobado(int promedio){
        return promedio >= 7;
    }
    
    public static int mejorNota(int[] notas){
        int mayor=0;
        for(int i=0; i<notas.length; i++){
            if(notas[i]>mayor){
                mayor=notas[i];
            }
        }
        return mayor;
    }
    
}
