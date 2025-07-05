/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleado;

/**
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Laura", 1200);
        emp1.mostrarInformacion();

        Gerente gerente1 = new Gerente("Carlos", 2500, "Ventas");
        gerente1.mostrarInformacion();

        Empleado emp2 = new Gerente("Mónica", 2800, "Marketing");
        emp2.mostrarInformacion(); // polimorfismo
    }
}
