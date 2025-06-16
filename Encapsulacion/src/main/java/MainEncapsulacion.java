/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
package Encapsulacion;

public class MainEncapsulacion {
    public static void main(String[] args) {
        Persona p = new Persona("Diego", 20);
        p.mostrarInformacion();

        // Cambiar nombre usando setter
        p.setNombre("Diego Chitupanta");
        p.setEdad(21);

        System.out.println("\nDespués de actualizar:");
        p.mostrarInformacion();
    }
}