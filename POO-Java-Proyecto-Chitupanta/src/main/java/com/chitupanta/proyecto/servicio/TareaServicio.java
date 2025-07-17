/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chitupanta.proyecto.servicio;

import com.chitupanta.proyecto.modelo.Tarea;
import java.util.List;

/**
 * Interfaz que define las operaciones para gestionar tareas.
 */
public interface TareaServicio {
    void agregarTarea(Tarea tarea);
    List<Tarea> listarTareas();
}
