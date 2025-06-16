/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
package com.mycompany.polimorfismo;

public class MainPolimorfismo {
    public static void main(String[] args) {
        Animal miAnimal;

        miAnimal = new Perro();
        miAnimal.hacerSonido();  // Llama a Perro.hacerSonido()

        miAnimal = new Gato();
        miAnimal.hacerSonido();  // Llama a Gato.hacerSonido()
    }
}
