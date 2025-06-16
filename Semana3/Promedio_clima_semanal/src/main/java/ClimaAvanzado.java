/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
// Clase que extiende (hereda) de Clima para agregar funcionalidad extra
public class ClimaAvanzado extends Clima {

    // Método para obtener la temperatura máxima registrada en la semana
    public double obtenerMaxima() {
        double max = Double.MIN_VALUE; // Valor mínimo inicial

        // Recorre todas las temperaturas usando el getter para proteger encapsulamiento
        for (double temp : getTemperaturas()) {
            if (temp > max) {
                max = temp; // Actualiza si encuentra temperatura mayor
            }
        }
        return max;
    }
}
