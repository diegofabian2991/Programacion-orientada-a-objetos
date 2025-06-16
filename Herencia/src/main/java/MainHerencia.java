/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
package com.mycompany.herencia;

public class MainHerencia {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Firulais");
        miPerro.mostrarNombre();  // Método heredado
        miPerro.hacerSonido();    // Método sobrescrito
    }
}