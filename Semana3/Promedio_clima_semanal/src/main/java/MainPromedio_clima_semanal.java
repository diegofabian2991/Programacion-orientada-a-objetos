/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
public class MainPromedio_clima_semanal {
    public static void main(String[] args) {
        System.out.println("=== Promedio semanal del clima (POO) ===");

        // Crear objeto de la clase ClimaAvanzado
        ClimaAvanzado clima = new ClimaAvanzado();

        // Invocar método para ingresar temperaturas por teclado
        clima.ingresarTemperaturas();

        // Calcular promedio con método de la clase
        double promedio = clima.calcularPromedio();

        // Calcular temperatura máxima con el método heredado
        double maxima = clima.obtenerMaxima();

        // Mostrar resultados al usuario con formato
        System.out.printf("El promedio semanal es: %.2f°C%n", promedio);
        System.out.printf("La temperatura máxima semanal es: %.2f°C%n", maxima);
    }
}
