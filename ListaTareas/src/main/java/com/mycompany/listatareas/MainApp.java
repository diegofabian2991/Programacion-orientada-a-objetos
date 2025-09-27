/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas;

import javax.swing.SwingUtilities;

/**
 * Clase principal que arranca la aplicación.
 */
public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaPrincipal().mostrarGUI());
    }
}