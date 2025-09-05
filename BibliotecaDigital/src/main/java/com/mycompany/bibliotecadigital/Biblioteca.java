/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecadigital;

/**
 *
 * @author diego
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Biblioteca {
    private final Map<String, Libro> catalogoPorIsbn;
    private final Map<String, Usuario> usuariosPorId;
    private final Set<String> isbnsPrestados;

    public Biblioteca() {
        catalogoPorIsbn = new HashMap<>();
        usuariosPorId = new HashMap<>();
        isbnsPrestados = new HashSet<>();
    }

    // ---- Libros ----
    public void añadirLibro(Libro libro) {
        catalogoPorIsbn.put(libro.getIsbn(), libro);
    }

    public void quitarLibro(String isbn) {
        if (isbnsPrestados.contains(isbn)) {
            System.out.println("No se puede quitar, el libro está prestado");
        } else {
            catalogoPorIsbn.remove(isbn);
        }
    }

    // ---- Usuarios ----
    public void registrarUsuario(Usuario u) {
        usuariosPorId.put(u.getId(), u);
    }

    public void darBajaUsuario(String id) {
        Usuario u = usuariosPorId.get(id);
        if (u != null && u.getIsbnsPrestados().isEmpty()) {
            usuariosPorId.remove(id);
        } else {
            System.out.println("No se puede dar de baja, tiene libros prestados");
        }
    }

    // ---- Préstamos ----
    public void prestarLibro(String idUsuario, String isbn) {
        Usuario u = usuariosPorId.get(idUsuario);
        Libro l = catalogoPorIsbn.get(isbn);

        if (u == null || l == null) {
            System.out.println("Usuario o libro no encontrado");
            return;
        }
        if (isbnsPrestados.contains(isbn)) {
            System.out.println("El libro ya está prestado");
            return;
        }
        u.prestarLibro(isbn);
        isbnsPrestados.add(isbn);
    }

    public void devolverLibro(String idUsuario, String isbn) {
        Usuario u = usuariosPorId.get(idUsuario);
        if (u != null && u.getIsbnsPrestados().contains(isbn)) {
            u.devolverLibro(isbn);
            isbnsPrestados.remove(isbn);
        } else {
            System.out.println("El usuario no tiene este libro prestado");
        }
    }

    // ---- Búsquedas ----
    public List<Libro> buscarPorTitulo(String texto) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro l : catalogoPorIsbn.values()) {
            if (l.getTitulo().toLowerCase().contains(texto.toLowerCase())) {
                resultado.add(l);
            }
        }
        return resultado;
    }

    public List<Libro> buscarPorAutor(String texto) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro l : catalogoPorIsbn.values()) {
            if (l.getAutor().toLowerCase().contains(texto.toLowerCase())) {
                resultado.add(l);
            }
        }
        return resultado;
    }

    public List<Libro> buscarPorCategoria(String texto) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro l : catalogoPorIsbn.values()) {
            if (l.getCategoria().toLowerCase().contains(texto.toLowerCase())) {
                resultado.add(l);
            }
        }
        return resultado;
    }

    // ---- Listar prestados ----
    public List<Libro> listarPrestados(String idUsuario) {
        Usuario u = usuariosPorId.get(idUsuario);
        List<Libro> resultado = new ArrayList<>();
        if (u == null) return resultado;

        for (String isbn : u.getIsbnsPrestados()) {
            resultado.add(catalogoPorIsbn.get(isbn));
        }
        return resultado;
    }
}

