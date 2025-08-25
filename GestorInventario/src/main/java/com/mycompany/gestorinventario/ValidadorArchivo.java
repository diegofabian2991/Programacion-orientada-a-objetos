/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorinventario;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ValidadorArchivo {

    public void verificarNoVacio(String nombreArchivo) throws ArchivoVacioException {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            if (reader.readLine() == null) {
                throw new ArchivoVacioException("El archivo '" + nombreArchivo + "' está vacío.");
            }
        } catch (IOException e) {
            System.out.println("Error al verificar el archivo: " + e.getMessage());
        }
    }
}
