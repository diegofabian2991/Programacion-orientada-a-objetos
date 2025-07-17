/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chitupanta.proyecto.servicio;

import com.chitupanta.proyecto.modelo.Tarea;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementación del servicio para gestionar tareas usando una lista en memoria.
 */
public class TareaServicioImpl implements TareaServicio {

    private List<Tarea> tareas;

    public TareaServicioImpl() {
        tareas = new ArrayList<>();
    }

    @Override
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    @Override
    public List<Tarea> listarTareas() {
        return tareas;
    }
}