/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecadigital;

/**
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Registrar usuarios
        biblioteca.registrarUsuario(new Usuario("U1", "Ana"));
        biblioteca.registrarUsuario(new Usuario("U2", "Luis"));

        // Añadir libros
        biblioteca.añadirLibro(new Libro("ISBN-001", "Clean Code", "Robert C. Martin", "Software"));
        biblioteca.añadirLibro(new Libro("ISBN-002", "Effective Java", "Joshua Bloch", "Java"));

        // Prestar libros
        biblioteca.prestarLibro("U1", "ISBN-001");
        biblioteca.prestarLibro("U2", "ISBN-002");

        // Listar libros prestados
        System.out.println("Libros prestados a U1:");
        biblioteca.listarPrestados("U1").forEach(System.out::println);

        // Devolver libro
        biblioteca.devolverLibro("U1", "ISBN-001");

        // Buscar por autor
        System.out.println("\nBuscar por autor 'Bloch':");
        biblioteca.buscarPorAutor("Bloch").forEach(System.out::println);

        // Buscar por categoría
        System.out.println("\nBuscar por categoría 'Software':");
        biblioteca.buscarPorCategoria("Software").forEach(System.out::println);
    }
}
