/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chitupanta.proyecto.vista;

import com.chitupanta.proyecto.modelo.Tarea;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Clase auxiliar para interactuar con el usuario por consola.
 */
public class VistaConsola {

    private Scanner scanner = new Scanner(System.in);

    public Tarea pedirDatosTarea() {
        System.out.print("Título de la tarea: ");
        String titulo = scanner.nextLine();

        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();

        System.out.print("Fecha de entrega (YYYY-MM-DD): ");
        LocalDate fecha = LocalDate.parse(scanner.nextLine());

        System.out.print("Estado (pendiente / en progreso / completada): ");
        String estado = scanner.nextLine();

        return new Tarea(titulo, descripcion, fecha, estado);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}