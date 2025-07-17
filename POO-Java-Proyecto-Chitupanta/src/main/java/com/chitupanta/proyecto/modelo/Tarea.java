/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chitupanta.proyecto.modelo;

import java.time.LocalDate;

/**
 * Representa una tarea académica con un título, descripción, fecha de entrega y estado.
 */
public class Tarea {
    private static int contador = 1; // Genera IDs únicos automáticamente
    private int id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaEntrega;
    private String estado; // Ej: pendiente, completada, en progreso

    public Tarea(String titulo, String descripcion, LocalDate fechaEntrega, String estado) {
        this.id = contador++;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
    }

    // Getters y setters
    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public LocalDate getFechaEntrega() { return fechaEntrega; }
    public void setFechaEntrega(LocalDate fechaEntrega) { this.fechaEntrega = fechaEntrega; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Tarea #" + id + " - " + titulo + " (" + estado + ") - Fecha: " + fechaEntrega;
    }
}
