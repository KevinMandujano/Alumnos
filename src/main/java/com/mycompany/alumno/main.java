
package com.mycompany.alumno;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        int[] calificaciones = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la calificacion " + (i + 1) + ": ");
            calificaciones[i] = sc.nextInt();
        }

        // OBJETO alumno
        Alumno alumno = new Alumno(nombre, calificaciones);

        // Calcular promedio y calificación
        double promedio = alumno.calcularPromedio();
        char calificacionLetra = alumno.obtenerCalificacionFinal(promedio);

        // Resultados
        alumno.imprimirResultados(promedio, calificacionLetra);

        sc.close();
    }
}
