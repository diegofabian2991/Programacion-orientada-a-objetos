/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestordearchivosapp;

/**
 * Clase principal que prueba las funcionalidades de GestorDeArchivo y ValidadorArchivo.
 */
public class Main {
    public static void main(String[] args) {
        String nombreArchivo = "prueba.txt";
        String contenido = "Hola, este es un archivo de prueba para validar el programa.";

        GestorDeArchivo gestor = new GestorDeArchivo();
        ValidadorArchivo validador = new ValidadorArchivo();

        try {
            // 1. Guardar contenido en el archivo
            gestor.guardar(nombreArchivo, contenido);

            // 2. Leer el contenido del archivo
            String textoLeido = gestor.leer(nombreArchivo);
            System.out.println("Contenido leído del archivo:\n" + textoLeido);

            // 3. Verificar si el archivo está vacío
            validador.verificarNoVacio(nombreArchivo);
            System.out.println("El archivo tiene contenido.");

        } catch (ArchivoVacioException ave) {
            System.out.println("Error: " + ave.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }
}