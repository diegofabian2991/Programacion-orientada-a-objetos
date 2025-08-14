/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordearchivosapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase que valida si un archivo de texto no está vacío.
 */
public class ValidadorArchivo {

    /**
     * Verifica que el archivo no esté vacío.
     * @param nombreArchivo Nombre del archivo a verificar.
     * @throws ArchivoVacioException Si el archivo está vacío.
     */
    public void verificarNoVacio(String nombreArchivo) throws ArchivoVacioException {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            if (reader.readLine() == null) { // Si no hay contenido
                throw new ArchivoVacioException("El archivo '" + nombreArchivo + "' está vacío.");
            }
        } catch (IOException e) {
            System.out.println("Error al verificar el archivo: " + e.getMessage());
        }
    }
}
