/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
import java.util.Scanner;

public class Clima {
    // Atributo privado que almacena las temperaturas de la semana (7 días)
    private double[] temperaturas;

    // Constructor que inicializa el arreglo de temperaturas
    public Clima() {
        temperaturas = new double[7];
    }

    // Método para solicitar al usuario ingresar las temperaturas diarias
    public void ingresarTemperaturas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las temperaturas de los 7 días:");

        // Ciclo para leer 7 temperaturas, una por día
        for (int i = 0; i < 7; i++) {
            System.out.print("Día " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }
    }

    // Método que calcula y retorna el promedio de las temperaturas almacenadas
    public double calcularPromedio() {
        double suma = 0;
        // Sumar todas las temperaturas del arreglo
        for (double temp : temperaturas) {
            suma += temp;
        }
        // Calcular promedio dividiendo entre el número de días
        return suma / temperaturas.length;
    }

    // Método getter para obtener una copia del arreglo de temperaturas
    public double[] getTemperaturas() {
        return temperaturas.clone(); // Devuelve copia para proteger datos privados
    }
}
