/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraccion;

public abstract class Vehiculo {
    public String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public abstract void encender();

    public void mostrarMarca() {
        System.out.println("Marca: " + marca);
    }
}
