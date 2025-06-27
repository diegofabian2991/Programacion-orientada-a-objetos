/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversortemperatura;

/**
 *
 * @author diego
 */


// Programa para convertir grados Celsius a Fahrenheit
// Utiliza tipos de datos: float, string, boolean

import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {

        // Declaración de variables
        Scanner input = new Scanner(System.in);
        float temperatura_celsius;
        float temperatura_fahrenheit;
        String mensaje_resultado;
        boolean conversion_exitosa = false;

        // Solicita al usuario ingresar una temperatura en grados Celsius
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        temperatura_celsius = input.nextFloat();

        // Realiza la conversión
        temperatura_fahrenheit = (temperatura_celsius * 9 / 5) + 32;
        conversion_exitosa = true;

        // Genera el mensaje de salida
        if (conversion_exitosa) {
            mensaje_resultado = "La temperatura en Fahrenheit es: " + temperatura_fahrenheit + "°F";
        } else {
            mensaje_resultado = "Error al convertir la temperatura.";
        }

        // Muestra el resultado
        System.out.println(mensaje_resultado);

        input.close();
    }
}