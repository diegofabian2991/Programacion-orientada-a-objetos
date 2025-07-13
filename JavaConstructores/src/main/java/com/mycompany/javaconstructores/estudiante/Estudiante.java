/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaconstructores.estudiante;

/**
 *
 * @author diego
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.carrera = "Sin asignar";
    }

    // Constructor parametrizado
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    // Constructor sobrecargado
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = "Sin definir";
    }

    // Mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println();
    }
}
