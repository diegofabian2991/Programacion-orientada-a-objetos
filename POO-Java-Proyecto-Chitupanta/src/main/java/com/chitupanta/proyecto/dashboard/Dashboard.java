/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chitupanta.proyecto.dashboard;

import com.chitupanta.proyecto.modelo.Tarea;
import com.chitupanta.proyecto.servicio.TareaServicio;
import com.chitupanta.proyecto.servicio.TareaServicioImpl;
import com.chitupanta.proyecto.vista.VistaConsola;

import java.util.List;
import java.util.Scanner;

/**
 * Clase principal del sistema de gestión de tareas. Muestra menú, permite registrar y listar tareas.
 * @author 
 */
public class Dashboard {

    private TareaServicio servicio;
    private VistaConsola vista;
    private Scanner scanner;

    public Dashboard() {
        servicio = new TareaServicioImpl();
        vista = new VistaConsola();
        scanner = new Scanner(System.in);
    }

    /**
     * Muestra el menú principal del sistema.
     */
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n===== DASHBOARD DE TAREAS =====");
            System.out.println("1. Registrar nueva tarea");
            System.out.println("2. Ver tareas");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1 -> {
                    Tarea nueva = vista.pedirDatosTarea();
                    servicio.agregarTarea(nueva);
                    vista.mostrarMensaje("✅ Tarea registrada correctamente.");
                }
                case 2 -> {
                    List<Tarea> lista = servicio.listarTareas();
                    if (lista.isEmpty()) {
                        vista.mostrarMensaje("⚠️ No hay tareas registradas.");
                    } else {
                        System.out.println("\n📋 Lista de tareas:");
                        lista.forEach(System.out::println);
                    }
                }
                case 0 -> vista.mostrarMensaje("👋 Saliendo del sistema...");
                default -> vista.mostrarMensaje("❌ Opción inválida.");
            }
        } while (opcion != 0);
    }

    public static void main(String[] args) {
        Dashboard dashboard = new Dashboard();
        dashboard.mostrarMenu();
    }
}
