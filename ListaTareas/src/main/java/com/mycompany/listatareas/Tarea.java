/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas;

/**
 * Clase modelo que representa una tarea.
 */
public class Tarea {
    private String texto;
    private boolean completada;

    public Tarea(String texto) {
        this.texto = texto;
        this.completada = false;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        return texto;
    }
}
