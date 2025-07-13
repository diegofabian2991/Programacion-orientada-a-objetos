/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaconstructores.estudiante;

/**
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        // Constructor por defecto
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarInformacion();

        // Constructor parametrizado
        Estudiante estudiante2 = new Estudiante("Carlos Pérez", 22, "Ingeniería en tecnologias de la informacion");
        estudiante2.mostrarInformacion();

        // Constructor sobrecargado
        Estudiante estudiante3 = new Estudiante("Ana Gómez", 19);
        estudiante3.mostrarInformacion();
    }
}
