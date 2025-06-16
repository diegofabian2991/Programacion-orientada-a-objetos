/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraccion;

public class Coche extends Vehiculo {

    public Coche(String marca) {
        super(marca);
    }

    @Override
    public void encender() {
        System.out.println("El coche está encendido");
    }
}